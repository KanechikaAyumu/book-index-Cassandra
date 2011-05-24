/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra.service;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.*;
import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.cassandra.concurrent.Stage;
import org.apache.cassandra.concurrent.StageManager;
import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.db.*;
import org.apache.cassandra.db.filter.QueryFilter;
import org.apache.cassandra.dht.AbstractBounds;
import org.apache.cassandra.dht.Bounds;
import org.apache.cassandra.dht.IPartitioner;
import org.apache.cassandra.dht.Token;
import org.apache.cassandra.gms.Gossiper;
import org.apache.cassandra.locator.AbstractReplicationStrategy;
import org.apache.cassandra.locator.TokenMetadata;
import org.apache.cassandra.net.IAsyncCallback;
import org.apache.cassandra.net.Message;
import org.apache.cassandra.net.MessagingService;
import org.apache.cassandra.thrift.*;
import org.apache.cassandra.utils.*;

import static com.google.common.base.Charsets.UTF_8;

public class StorageProxy implements StorageProxyMBean
{
    private static final Logger logger = LoggerFactory.getLogger(StorageProxy.class);

    // mbean stuff
    private static final LatencyTracker readStats = new LatencyTracker();
    private static final LatencyTracker rangeStats = new LatencyTracker();
    private static final LatencyTracker writeStats = new LatencyTracker();
    private static boolean hintedHandoffEnabled = DatabaseDescriptor.hintedHandoffEnabled();
    private static int maxHintWindow = DatabaseDescriptor.getMaxHintWindow();
    public static final String UNREACHABLE = "UNREACHABLE";
//static Change
    private static File outFile = new File("/work1/kane/time.txt");
    private static String s = new String();
//    private final static long START = System.nanoTime();  
    private static long now;
//************
    public static final StorageProxy instance = new StorageProxy();

    private StorageProxy() {}
    static
    {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        try
        {
            mbs.registerMBean(new StorageProxy(), new ObjectName("org.apache.cassandra.db:type=StorageProxy"));
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    /**
     * Use this method to have these RowMutations applied
     * across all replicas. This method will take care
     * of the possibility of a replica being down and hint
     * the data across to some other replica.
     *
     * @param mutations the mutations to be applied across the replicas
     * @param consistency_level the consistency level for the operation
    */
    public static void mutate(List<RowMutation> mutations, ConsistencyLevel consistency_level) throws UnavailableException, TimeoutException
    {	

//Change
//	in_timestamp();
stamp("mutations");
//**********************
        long startTime = System.nanoTime();
        List<IWriteResponseHandler> responseHandlers = new ArrayList<IWriteResponseHandler>();

        RowMutation mostRecentRowMutation = null;
        StorageService ss = StorageService.instance;
        String localDataCenter = DatabaseDescriptor.getEndpointSnitch().getDatacenter(FBUtilities.getLocalAddress());
        
        try
        {
            for (RowMutation rm : mutations)
            {
                mostRecentRowMutation = rm;
                String table = rm.getTable();
                AbstractReplicationStrategy rs = Table.open(table).getReplicationStrategy();

                List<InetAddress> naturalEndpoints = ss.getNaturalEndpoints(table, rm.key());
                Collection<InetAddress> writeEndpoints = ss.getTokenMetadata().getWriteEndpoints(StorageService.getPartitioner().getToken(rm.key()), table, naturalEndpoints);
                Multimap<InetAddress, InetAddress> hintedEndpoints = rs.getHintedEndpoints(writeEndpoints);
                
                final IWriteResponseHandler responseHandler = rs.getWriteResponseHandler(writeEndpoints, hintedEndpoints, consistency_level);
                
                // exit early if we can't fulfill the CL at this time
                responseHandler.assureSufficientLiveNodes();
                
                responseHandlers.add(responseHandler);
                
                // Multimap that holds onto all the messages and addresses meant for a specific datacenter
                Map<String, Multimap<Message, InetAddress>> dcMessages = new HashMap<String, Multimap<Message, InetAddress>>(hintedEndpoints.size());
                Message unhintedMessage = null;

                for (Map.Entry<InetAddress, Collection<InetAddress>> entry : hintedEndpoints.asMap().entrySet())
                {
                    InetAddress destination = entry.getKey();
                    Collection<InetAddress> targets = entry.getValue();

                    String dc = DatabaseDescriptor.getEndpointSnitch().getDatacenter(destination);

                    if (targets.size() == 1 && targets.iterator().next().equals(destination))
                    {
                        // unhinted writes
                        if (destination.equals(FBUtilities.getLocalAddress()))
                        {
                            insertLocal(rm, responseHandler);
                        }
                        else
                        {
                            // belongs on a different server
                            if (unhintedMessage == null)
                                unhintedMessage = rm.makeRowMutationMessage();
                            if (logger.isDebugEnabled())
                                logger.debug("insert writing key " + ByteBufferUtil.bytesToHex(rm.key()) + " to " + destination);
                            
                            Multimap<Message, InetAddress> messages = dcMessages.get(dc);
                            if (messages == null)
                            {
                               messages = HashMultimap.create();
                               dcMessages.put(dc, messages);
                            }
                            
                            messages.put(unhintedMessage, destination);
                        }
                    }
                    else
                    {
                        // hinted messages are unique, so there is no point to adding a hop by forwarding via another node.
                        // thus, we use sendRR/sendOneWay directly here.
                        Message hintedMessage = rm.makeRowMutationMessage();
                        for (InetAddress target : targets)
                        {
                            if (!target.equals(destination))
                            {
                                addHintHeader(hintedMessage, target);
                                if (logger.isDebugEnabled())
                                    logger.debug("insert writing key " + ByteBufferUtil.bytesToHex(rm.key()) + " to " + destination + " for " + target);
                            }
                        }
                        // non-destination hints are part of the callback and count towards consistency only under CL.ANY
                        if (writeEndpoints.contains(destination) || consistency_level == ConsistencyLevel.ANY)
                            MessagingService.instance().sendRR(hintedMessage, destination, responseHandler);
                        else
                            MessagingService.instance().sendOneWay(hintedMessage, destination);
                    }
                }

                sendMessages(localDataCenter, dcMessages, responseHandler);
            }
                        
            // wait for writes.  throws timeoutexception if necessary
            for (IWriteResponseHandler responseHandler : responseHandlers)
                responseHandler.get();
        }
        catch (IOException e)
        {
            if (mostRecentRowMutation == null)
                throw new RuntimeException("no mutations were seen but found an error during write anyway", e);
            else
                throw new RuntimeException("error writing key " + ByteBufferUtil.bytesToHex(mostRecentRowMutation.key()), e);
        }
        finally
        {
            writeStats.addNano(System.nanoTime() - startTime);
        }
    }

    /**
     * for each datacenter, send a message to one node to relay the write to other replicas
     */
    private static void sendMessages(String localDataCenter, Map<String, Multimap<Message, InetAddress>> dcMessages, IWriteResponseHandler handler)
    throws IOException
    {
stamp("sendMessages");
//Change**************
//in_timestamp();

        for (Map.Entry<String, Multimap<Message, InetAddress>> entry: dcMessages.entrySet())
        {
            String dataCenter = entry.getKey();

            // send the messages corresponding to this datacenter
            for (Map.Entry<Message, Collection<InetAddress>> messages: entry.getValue().asMap().entrySet())
            {
                Message message = messages.getKey();
                // a single message object is used for unhinted writes, so clean out any forwards
                // from previous loop iterations
                message.removeHeader(RowMutation.FORWARD_HEADER);

                if (dataCenter.equals(localDataCenter) || StorageService.instance.useEfficientCrossDCWrites())
                {
                    // direct writes to local DC or old Cassadra versions
                    for (InetAddress destination : messages.getValue())
                        MessagingService.instance().sendRR(message, destination, handler);
                }
                else
                {
                    // Non-local DC. First endpoint in list is the destination for this group
                    Iterator<InetAddress> iter = messages.getValue().iterator();
                    InetAddress target = iter.next();
                    // Add all the other destinations of the same message as a header in the primary message.
                    while (iter.hasNext())
                    {
                        InetAddress destination = iter.next();
                        // group all nodes in this DC as forward headers on the primary message
                        ByteArrayOutputStream bos = new ByteArrayOutputStream();
                        DataOutputStream dos = new DataOutputStream(bos);

                        // append to older addresses
                        byte[] previousHints = message.getHeader(RowMutation.FORWARD_HEADER);
                        if (previousHints != null)
                            dos.write(previousHints);

                        dos.write(destination.getAddress());
                        message.setHeader(RowMutation.FORWARD_HEADER, bos.toByteArray());
                    }
                    // send the combined message + forward headers
                    MessagingService.instance().sendRR(message, target, handler);
                }
            }
        }
    }

    private static void addHintHeader(Message message, InetAddress target) throws IOException
    {
//Change
stamp("addHintHeader");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bos);
        byte[] previousHints = message.getHeader(RowMutation.HINT);
        if (previousHints != null)
        {
            dos.write(previousHints);
        }
        ByteBufferUtil.writeWithShortLength(ByteBuffer.wrap(target.getHostAddress().getBytes(UTF_8)), dos);
        message.setHeader(RowMutation.HINT, bos.toByteArray());
    }

    private static void insertLocal(final RowMutation rm, final IWriteResponseHandler responseHandler)
    {
 /*
//Change 
	try{
        FileWriter out = new FileWriter(outFile,true);
        BufferedWriter bw = new BufferedWriter(out);
	now  = System.currentTimeMillis();
	s = "Insert;"+Long.toString(now);
	bw.write(s);
	bw.newLine();
	bw.close();
        }catch(IOException e) {
     	}
//**********
*/
stamp("insertLocal");
//	in_timestamp();
        if (logger.isDebugEnabled())
            logger.debug("insert writing local " + rm.toString(true));
        Runnable runnable = new WrappedRunnable()
        {
            public void runMayThrow() throws IOException
            {
                rm.deepCopy().apply();
                responseHandler.response(null);
            }
        };
        StageManager.getStage(Stage.MUTATION).execute(runnable);
    }

    /**
     * Performs the actual reading of a row out of the StorageService, fetching
     * a specific set of column names from a given column family.
     */
    public static List<Row> read(List<ReadCommand> commands, ConsistencyLevel consistency_level)
            throws IOException, UnavailableException, TimeoutException, InvalidRequestException
    {

/*
//*********Change
	 try{
        FileWriter out = new FileWriter(outFile,true);
        BufferedWriter bw = new BufferedWriter(out);
        now  = System.currentTimeMillis();
        s = "Read;"+Long.toString(now);
        bw.write(s);
        bw.newLine();
        bw.close();
        }catch(IOException e) {
        }
//****************************
*/
stamp("read");
//	out_timestamp();

        if (StorageService.instance.isBootstrapMode())
            throw new UnavailableException();
        long startTime = System.nanoTime();
        List<Row> rows;
        try
        {
            rows = fetchRows(commands, consistency_level);
        }
        finally
        {
            readStats.addNano(System.nanoTime() - startTime);
        }
        return rows;
    }

    /**
     * This function executes local and remote reads, and blocks for the results:
     *
     * 1. Get the replica locations, sorted by response time according to the snitch
     * 2. Send a data request to the closest replica, and digest requests to either
     *    a) all the replicas, if read repair is enabled
     *    b) the closest R-1 replicas, where R is the number required to satisfy the ConsistencyLevel
     * 3. Wait for a response from R replicas
     * 4. If the digests (if any) match the data return the data
     * 5. else carry out read repair by getting data from all the nodes.
     */
    private static List<Row> fetchRows(List<ReadCommand> commands, ConsistencyLevel consistency_level) throws IOException, UnavailableException, TimeoutException
    {
//Change
stamp("fetchRows");
        List<ReadCallback<Row>> readCallbacks = new ArrayList<ReadCallback<Row>>();
        List<Row> rows = new ArrayList<Row>();

        // send out read requests
        for (ReadCommand command: commands)
        {
            assert !command.isDigestQuery();
            logger.debug("Command/ConsistencyLevel is {}/{}", command, consistency_level);

            List<InetAddress> endpoints = StorageService.instance.getLiveNaturalEndpoints(command.table, command.key);
            DatabaseDescriptor.getEndpointSnitch().sortByProximity(FBUtilities.getLocalAddress(), endpoints);

            RowDigestResolver resolver = new RowDigestResolver(command.table, command.key);
            ReadCallback<Row> handler = getReadCallback(resolver, command, consistency_level, endpoints);
            handler.assureSufficientLiveNodes();
            assert !handler.endpoints.isEmpty();

            // The data-request message is sent to dataPoint, the node that will actually get
            // the data for us. The other replicas are only sent a digest query.
            ReadCommand digestCommand = null;
            if (handler.endpoints.size() > 1)
            {
                digestCommand = command.copy();
                digestCommand.setDigestQuery(true);
            }

            InetAddress dataPoint = handler.endpoints.get(0);
            if (dataPoint.equals(FBUtilities.getLocalAddress()))
            {
                if (logger.isDebugEnabled())
                    logger.debug("reading data locally");
                StageManager.getStage(Stage.READ).execute(new LocalReadRunnable(command, handler));
            }
            else
            {
                Message message = command.makeReadMessage();
                if (logger.isDebugEnabled())
                    logger.debug("reading data from " + dataPoint);
                MessagingService.instance().sendRR(message, dataPoint, handler);
            }

            // We lazy-construct the digest Message object since it may not be necessary if we
            // are doing a local digest read, or no digest reads at all.
            Message digestMessage = null;
            for (InetAddress digestPoint : handler.endpoints.subList(1, handler.endpoints.size()))
            {
                if (digestPoint.equals(FBUtilities.getLocalAddress()))
                {
                    if (logger.isDebugEnabled())
                        logger.debug("reading digest locally");
                    StageManager.getStage(Stage.READ).execute(new LocalReadRunnable(digestCommand, handler));
                }
                else
                {
                    if (digestMessage == null)
                        digestMessage = digestCommand.makeReadMessage();
                    if (logger.isDebugEnabled())
                        logger.debug("reading digest for from " + digestPoint);
                    MessagingService.instance().sendRR(digestMessage, digestPoint, handler);
                }
            }

            readCallbacks.add(handler);
        }

        // read results and make a second pass for any digest mismatches
        List<RepairCallback<Row>> repairResponseHandlers = null;
        for (int i = 0; i < commands.size(); i++)
        {
            ReadCallback<Row> handler = readCallbacks.get(i);
            Row row;
            ReadCommand command = commands.get(i);
            try
            {
                long startTime2 = System.currentTimeMillis();
                row = handler.get(); // CL.ONE is special cased here to ignore digests even if some have arrived
                if (row != null)
                    rows.add(row);

                if (logger.isDebugEnabled())
                    logger.debug("Read: " + (System.currentTimeMillis() - startTime2) + " ms.");
            }
            catch (DigestMismatchException ex)
            {
                if (logger.isDebugEnabled())
                    logger.debug("Digest mismatch:", ex);

                RowRepairResolver resolver = new RowRepairResolver(command.table, command.key);
                RepairCallback<Row> repairHandler = new RepairCallback<Row>(resolver, handler.endpoints);
                Message messageRepair = command.makeReadMessage();
                for (InetAddress endpoint : handler.endpoints)
                    MessagingService.instance().sendRR(messageRepair, endpoint, repairHandler);

                if (repairResponseHandlers == null)
                    repairResponseHandlers = new ArrayList<RepairCallback<Row>>();
                repairResponseHandlers.add(repairHandler);
            }
        }

        // read the results for the digest mismatch retries
        if (repairResponseHandlers != null)
        {
            for (RepairCallback<Row> handler : repairResponseHandlers)
            {
                try
                {
                    Row row = handler.get();
                    if (row != null)
                        rows.add(row);
                }
                catch (DigestMismatchException e)
                {
                    throw new AssertionError(e); // full data requested from each node here, no digests should be sent
                }
            }
        }

        return rows;
    }

    static class LocalReadRunnable extends WrappedRunnable
    {
        private final ReadCommand command;
        private final ReadCallback<Row> handler;
        private final long start = System.currentTimeMillis();

        LocalReadRunnable(ReadCommand command, ReadCallback<Row> handler)
        {
            this.command = command;
            this.handler = handler;
        }

        protected void runMayThrow() throws IOException
        {
            if (logger.isDebugEnabled())
                logger.debug("LocalReadRunnable reading " + command);

            Table table = Table.open(command.table);
            ReadResponse result = ReadVerbHandler.getResponse(command, command.getRow(table));
            MessagingService.instance().addLatency(FBUtilities.getLocalAddress(), System.currentTimeMillis() - start);
            handler.response(result);
        }
    }
    
    static <T> ReadCallback<T> getReadCallback(IResponseResolver<T> resolver, IReadCommand command, ConsistencyLevel consistencyLevel, List<InetAddress> endpoints)
    {
        if (consistencyLevel.equals(ConsistencyLevel.LOCAL_QUORUM) || consistencyLevel.equals(ConsistencyLevel.EACH_QUORUM))
        {
            return new DatacenterReadCallback(resolver, consistencyLevel, command, endpoints);
        }
        return new ReadCallback(resolver, consistencyLevel, command, endpoints);
    }

    /*
    * This function executes the read protocol locally.  Consistency checks are performed in the background.
    */

    public static List<Row> getRangeSlice(RangeSliceCommand command, ConsistencyLevel consistency_level)
    throws IOException, UnavailableException, TimeoutException
    {
//***********Change
//	out_timestamp();
//*************
stamp("getRangeSlice");

        if (logger.isDebugEnabled())
            logger.debug(command.toString());
        long startTime = System.nanoTime();
        List<Row> rows;
        // now scan until we have enough results
        try
        {
            rows = new ArrayList<Row>(command.max_keys);
            List<AbstractBounds> ranges = getRestrictedRanges(command.range);
            for (AbstractBounds range : ranges)
            {
                List<InetAddress> liveEndpoints = StorageService.instance.getLiveNaturalEndpoints(command.keyspace, range.right);
                DatabaseDescriptor.getEndpointSnitch().sortByProximity(FBUtilities.getLocalAddress(), liveEndpoints);

                if (consistency_level == ConsistencyLevel.ONE && !liveEndpoints.isEmpty() && liveEndpoints.get(0).equals(FBUtilities.getLocalAddress())) 
                {
                    if (logger.isDebugEnabled())
                        logger.debug("local range slice");
                    ColumnFamilyStore cfs = Table.open(command.keyspace).getColumnFamilyStore(command.column_family);
                    try 
                    {
                        rows.addAll(cfs.getRangeSlice(command.super_column,
                                                    range,
                                                    command.max_keys,
                                                    QueryFilter.getFilter(command.predicate, cfs.getComparator())));
                    } 
                    catch (ExecutionException e) 
                    {
                        throw new RuntimeException(e.getCause());
                    } 
                    catch (InterruptedException e) 
                    {
                        throw new AssertionError(e);
                    }           
                }
                else 
                {
                    RangeSliceCommand c2 = new RangeSliceCommand(command.keyspace, command.column_family, command.super_column, command.predicate, range, command.max_keys);
                    Message message = c2.getMessage();

                    // collect replies and resolve according to consistency level
                    RangeSliceResponseResolver resolver = new RangeSliceResponseResolver(command.keyspace, liveEndpoints);
                    ReadCallback<List<Row>> handler = getReadCallback(resolver, command, consistency_level, liveEndpoints);
                    handler.assureSufficientLiveNodes();
                    for (InetAddress endpoint : handler.endpoints)
                    {
                        MessagingService.instance().sendRR(message, endpoint, handler);
                        if (logger.isDebugEnabled())
                            logger.debug("reading " + c2 + " from " + endpoint);
                    }

                    // if we're done, great, otherwise, move to the next range
                    try 
                    {
                        if (logger.isDebugEnabled()) 
                        {
                            for (Row row : handler.get()) 
                            {
                                logger.debug("range slices read " + row.key);
                            }
                        }
                        rows.addAll(handler.get());
                    } 
                    catch (DigestMismatchException e) 
                    {
                        throw new AssertionError(e); // no digests in range slices yet
                    }
                }
            
                if (rows.size() >= command.max_keys)
                    break;
            }
        }
        finally
        {
            rangeStats.addNano(System.nanoTime() - startTime);
        }
        return rows.size() > command.max_keys ? rows.subList(0, command.max_keys) : rows;
    }

    /**
     * initiate a request/response session with each live node to check whether or not everybody is using the same 
     * migration id. This is useful for determining if a schema change has propagated through the cluster. Disagreement
     * is assumed if any node fails to respond.
     */
    public static Map<String, List<String>> describeSchemaVersions()
    {
        final String myVersion = DatabaseDescriptor.getDefsVersion().toString();
        final Map<InetAddress, UUID> versions = new ConcurrentHashMap<InetAddress, UUID>();
        final Set<InetAddress> liveHosts = Gossiper.instance.getLiveMembers();
        final CountDownLatch latch = new CountDownLatch(liveHosts.size());

        IAsyncCallback cb = new IAsyncCallback()
        {
            public void response(Message message)
            {
                // record the response from the remote node.
                logger.debug("Received schema check response from " + message.getFrom().getHostAddress());
                UUID theirVersion = UUID.fromString(new String(message.getMessageBody()));
                versions.put(message.getFrom(), theirVersion);
                latch.countDown();
            }

            public boolean isLatencyForSnitch()
            {
                return false;
            }
        };
        // an empty message acts as a request to the SchemaCheckVerbHandler.
        for (InetAddress endpoint : liveHosts)
        {
            Message message = new Message(FBUtilities.getLocalAddress(), StorageService.Verb.SCHEMA_CHECK, ArrayUtils.EMPTY_BYTE_ARRAY);
            MessagingService.instance().sendRR(message, endpoint, cb);
        }

        try
        {
            // wait for as long as possible. timeout-1s if possible.
            latch.await(DatabaseDescriptor.getRpcTimeout(), TimeUnit.MILLISECONDS);
        } 
        catch (InterruptedException ex) 
        {
            throw new AssertionError("This latch shouldn't have been interrupted.");
        }
        
        logger.debug("My version is " + myVersion);
        
        // maps versions to hosts that are on that version.
        Map<String, List<String>> results = new HashMap<String, List<String>>();
        Set<InetAddress> allHosts = new HashSet<InetAddress>();
        allHosts.addAll(Gossiper.instance.getLiveMembers());
        allHosts.addAll(Gossiper.instance.getUnreachableMembers());
        for (InetAddress host : allHosts)
        {
            UUID version = versions.get(host);
            String stringVersion = version == null ? UNREACHABLE : version.toString();
            List<String> hosts = results.get(stringVersion);
            if (hosts == null)
            {
                hosts = new ArrayList<String>();
                results.put(stringVersion, hosts);
            }
            hosts.add(host.getHostAddress());
        }

        // we're done: the results map is ready to return to the client.  the rest is just debug logging:
        if (results.get(UNREACHABLE) != null)
            logger.debug("Hosts not in agreement. Didn't get a response from everybody: " + StringUtils.join(results.get(UNREACHABLE), ","));
        for (Map.Entry<String, List<String>> entry : results.entrySet())
        {
            // check for version disagreement. log the hosts that don't agree.
            if (entry.getKey().equals(UNREACHABLE) || entry.getKey().equals(myVersion))
                continue;
            for (String host : entry.getValue())
                logger.debug("%s disagrees (%s)", host, entry.getKey());
        }
        if (results.size() == 1)
            logger.debug("Schemas are in agreement.");
        
        return results;
    }

    /**
     * Compute all ranges we're going to query, in sorted order. Nodes can be replica destinations for many ranges,
     * so we need to restrict each scan to the specific range we want, or else we'd get duplicate results.
     */
    static List<AbstractBounds> getRestrictedRanges(final AbstractBounds queryRange)
    {
        // special case for bounds containing exactly 1 (non-minimum) token
        if (queryRange instanceof Bounds && queryRange.left.equals(queryRange.right) && !queryRange.left.equals(StorageService.getPartitioner().getMinimumToken()))
        {
            if (logger.isDebugEnabled())
                logger.debug("restricted single token match for query " + queryRange);
            return Collections.singletonList(queryRange);
        }

        TokenMetadata tokenMetadata = StorageService.instance.getTokenMetadata();

        List<AbstractBounds> ranges = new ArrayList<AbstractBounds>();
        // divide the queryRange into pieces delimited by the ring and minimum tokens
        Iterator<Token> ringIter = TokenMetadata.ringIterator(tokenMetadata.sortedTokens(), queryRange.left, true);
        AbstractBounds remainder = queryRange;
        while (ringIter.hasNext())
        {
            Token token = ringIter.next();
            if (remainder == null || !(remainder.left.equals(token) || remainder.contains(token)))
                // no more splits
                break;
            Pair<AbstractBounds,AbstractBounds> splits = remainder.split(token);
            if (splits.left != null)
                ranges.add(splits.left);
            remainder = splits.right;
        }
        if (remainder != null)
            ranges.add(remainder);
        if (logger.isDebugEnabled())
            logger.debug("restricted ranges for query " + queryRange + " are " + ranges);

        return ranges;
    }
 //Change
 
    public static void stamp(String str){
         try{
         FileWriter out = new FileWriter(outFile,true);
         BufferedWriter bw = new BufferedWriter(out);
         now  = System.nanoTime();
         s = str +";"+Long.toString(now);
         bw.write(s);
         bw.newLine();
         bw.close();
         }catch(IOException e) {
         }

    }



    public static void in_timestamp(){
	 try{
       	 FileWriter out = new FileWriter(outFile,true);
       	 BufferedWriter bw = new BufferedWriter(out);
       	 now  = System.nanoTime();
       	 s = "Insert;"+Long.toString(now);
       	 bw.write(s);
       	 bw.newLine();
       	 bw.close();
       	 }catch(IOException e) {
       	 }

    }		  

    public static void out_timestamp(){
         try{
         FileWriter out = new FileWriter(outFile,true);
         BufferedWriter bw = new BufferedWriter(out);
         now  = System.nanoTime();
         s = "Read;"+Long.toString(now);
         bw.write(s);
         bw.newLine();
         bw.close();
         }catch(IOException e) {
         }

    }     
//************************************


    public long getReadOperations()
    {
        return readStats.getOpCount();
    }

    public long getTotalReadLatencyMicros()
    {
        return readStats.getTotalLatencyMicros();
    }

    public double getRecentReadLatencyMicros()
    {
        return readStats.getRecentLatencyMicros();
    }

    public long[] getTotalReadLatencyHistogramMicros()
    {
        return readStats.getTotalLatencyHistogramMicros();
    }

    public long[] getRecentReadLatencyHistogramMicros()
    {
        return readStats.getRecentLatencyHistogramMicros();
    }

    public long getRangeOperations()
    {
        return rangeStats.getOpCount();
    }

    public long getTotalRangeLatencyMicros()
    {
        return rangeStats.getTotalLatencyMicros();
    }

    public double getRecentRangeLatencyMicros()
    {
        return rangeStats.getRecentLatencyMicros();
    }

    public long[] getTotalRangeLatencyHistogramMicros()
    {
        return rangeStats.getTotalLatencyHistogramMicros();
    }

    public long[] getRecentRangeLatencyHistogramMicros()
    {
        return rangeStats.getRecentLatencyHistogramMicros();
    }

    public long getWriteOperations()
    {
        return writeStats.getOpCount();
    }

    public long getTotalWriteLatencyMicros()
    {
        return writeStats.getTotalLatencyMicros();
    }

    public double getRecentWriteLatencyMicros()
    {
        return writeStats.getRecentLatencyMicros();
    }

    public long[] getTotalWriteLatencyHistogramMicros()
    {
        return writeStats.getTotalLatencyHistogramMicros();
    }

    public long[] getRecentWriteLatencyHistogramMicros()
    {
        return writeStats.getRecentLatencyHistogramMicros();
    }

    public static List<Row> scan(final String keyspace, String column_family, IndexClause index_clause, SlicePredicate column_predicate, ConsistencyLevel consistency_level)
    throws IOException, TimeoutException, UnavailableException
    {
        IPartitioner p = StorageService.getPartitioner();

        Token leftToken = index_clause.start_key == null ? p.getMinimumToken() : p.getToken(index_clause.start_key);
        List<AbstractBounds> ranges = getRestrictedRanges(new Bounds(leftToken, p.getMinimumToken()));
        logger.debug("scan ranges are " + StringUtils.join(ranges, ","));

        // now scan until we have enough results
        List<Row> rows = new ArrayList<Row>(index_clause.count);
        for (AbstractBounds range : ranges)
        {
            List<InetAddress> liveEndpoints = StorageService.instance.getLiveNaturalEndpoints(keyspace, range.right);
            DatabaseDescriptor.getEndpointSnitch().sortByProximity(FBUtilities.getLocalAddress(), liveEndpoints);

            // collect replies and resolve according to consistency level
            RangeSliceResponseResolver resolver = new RangeSliceResponseResolver(keyspace, liveEndpoints);
            IReadCommand iCommand = new IReadCommand()
            {
                public String getKeyspace()
                {
                    return keyspace;
                }
            };
            ReadCallback<List<Row>> handler = getReadCallback(resolver, iCommand, consistency_level, liveEndpoints);
            handler.assureSufficientLiveNodes();

            IndexScanCommand command = new IndexScanCommand(keyspace, column_family, index_clause, column_predicate, range);
            Message message = command.getMessage();
            for (InetAddress endpoint : handler.endpoints)
            {
                MessagingService.instance().sendRR(message, endpoint, handler);
                if (logger.isDebugEnabled())
                    logger.debug("reading " + command + " from " + endpoint);
            }

            List<Row> theseRows;
            try
            {
                theseRows = handler.get();
            }
            catch (DigestMismatchException e)
            {
                throw new RuntimeException(e);
            }
            rows.addAll(theseRows);
            if (logger.isDebugEnabled())
            {
                for (Row row : theseRows)
                    logger.debug("read " + row);
            }
            if (rows.size() >= index_clause.count)
                return rows.subList(0, index_clause.count);
        }

        return rows;
    }

    public boolean getHintedHandoffEnabled()
    {
        return hintedHandoffEnabled;
    }

    public void setHintedHandoffEnabled(boolean b)
    {
        hintedHandoffEnabled = b;
    }

    public static boolean isHintedHandoffEnabled()
    {
        return hintedHandoffEnabled;
    }

    public int getMaxHintWindow()
    {
        return maxHintWindow;
    }

    public void setMaxHintWindow(int ms)
    {
        maxHintWindow = ms;
    }

    public static boolean shouldHint(InetAddress ep)
    {
        return Gossiper.instance.getEndpointDowntime(ep) <= maxHintWindow;
    }

    /**
     * Performs the truncate operatoin, which effectively deletes all data from
     * the column family cfname
     * @param keyspace
     * @param cfname
     * @throws UnavailableException If some of the hosts in the ring are down.
     * @throws TimeoutException
     * @throws IOException
     */
    public static void truncateBlocking(String keyspace, String cfname) throws UnavailableException, TimeoutException, IOException
    {
        logger.debug("Starting a blocking truncate operation on keyspace {}, CF ", keyspace, cfname);
        if (isAnyHostDown())
        {
            logger.info("Cannot perform truncate, some hosts are down");
            // Since the truncate operation is so aggressive and is typically only
            // invoked by an admin, for simplicity we require that all nodes are up
            // to perform the operation.
            throw new UnavailableException();
        }

        Set<InetAddress> allEndpoints = Gossiper.instance.getLiveMembers();
        int blockFor = allEndpoints.size();
        final TruncateResponseHandler responseHandler = new TruncateResponseHandler(blockFor);

        // Send out the truncate calls and track the responses with the callbacks.
        logger.debug("Starting to send truncate messages to hosts {}", allEndpoints);
        Truncation truncation = new Truncation(keyspace, cfname);
        Message message = truncation.makeTruncationMessage();
        for (InetAddress endpoint : allEndpoints)
            MessagingService.instance().sendRR(message, endpoint, responseHandler);

        // Wait for all
        logger.debug("Sent all truncate messages, now waiting for {} responses", blockFor);
        responseHandler.get();
        logger.debug("truncate done");
    }

    /**
     * Asks the gossiper if there are any nodes that are currently down.
     * @return true if the gossiper thinks all nodes are up.
     */
    private static boolean isAnyHostDown()
    {
        return !Gossiper.instance.getUnreachableMembers().isEmpty();
    }
}
