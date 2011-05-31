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
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.nio.ByteBuffer;
import java.util.*;

import org.apache.cassandra.thrift.*;
import org.apache.cassandra.utils.ByteBufferUtil;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class appSetup
{
    private static final Logger logger = LoggerFactory.getLogger(appSetup.class);

    public static final int TEST_COUNT = 5;

public static String total ="";

    public static void main(String[] args) throws Exception
    {
        Cassandra.Iface client = createConnection();

        setupKeyspace(client);
        client.set_keyspace(app.KEYSPACE);
        Map<ByteBuffer, Map<String,List<Mutation>>> mutationMap;
        Column c;

/*
        // text0: no rows
try{
      File file = new File("/home/kane/text/2008LNCS/4.txt");

      if (checkBeforeReadfile(file)){
        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        while((str = br.readLine()) != null){
                total += str;
        }
        System.out.println(total);
        br.close();
      }else{
        System.out.println("no file");
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }
*/
String string;
for(int i=0;i<TEST_COUNT;i++){
string = Integer.toString(i);
readtext(string + ".txt");

        // text1: 1 row, 1 word
        c = new Column(ByteBufferUtil.bytes("2008LNCS/"+ string), ByteBufferUtil.bytes(total), System.currentTimeMillis());
        mutationMap = getMutationMap(ByteBufferUtil.bytes("key" + string), app.COLUMN_FAMILY, c);
        client.batch_mutate(mutationMap, ConsistencyLevel.ONE);
        logger.info("added text" + string );
}
/*
readtext("4.txt");
        // text1: 1 row, 2 word
        c = new Column(ByteBufferUtil.bytes("2008LNCS/4"), ByteBufferUtil.bytes(total), System.currentTimeMillis());
        mutationMap = getMutationMap(ByteBufferUtil.bytes("key0"), app.COLUMN_FAMILY, c);
        client.batch_mutate(mutationMap, ConsistencyLevel.ONE);
        logger.info("added text2");
*/
/*
        // text3: 1000 rows, 1 word
        mutationMap = new HashMap<ByteBuffer,Map<String,List<Mutation>>>();
        for (int i=0; i<1; i++)
        {
            c = new Column(ByteBufferUtil.bytes("text3"), ByteBufferUtil.bytes("word1"), System.currentTimeMillis());
            addToMutationMap(mutationMap, ByteBufferUtil.bytes("key" + i), app.COLUMN_FAMILY, c);
        }
        client.batch_mutate(mutationMap, ConsistencyLevel.ONE);
        logger.info("added text3");
*/
        System.exit(0);
    }

    private static Map<ByteBuffer,Map<String,List<Mutation>>> getMutationMap(ByteBuffer key, String cf, Column c)
    {
        Map<ByteBuffer,Map<String,List<Mutation>>> mutationMap = new HashMap<ByteBuffer,Map<String,List<Mutation>>>();
        addToMutationMap(mutationMap, key, cf, c);
        return mutationMap;
    }

    private static void addToMutationMap(Map<ByteBuffer,Map<String,List<Mutation>>> mutationMap, ByteBuffer key, String cf, Column c)
    {
        Map<String,List<Mutation>> cfMutation = new HashMap<String,List<Mutation>>();
        List<Mutation> mList = new ArrayList<Mutation>();
        ColumnOrSuperColumn cc = new ColumnOrSuperColumn();
        Mutation m = new Mutation();

        cc.setColumn(c);
        m.setColumn_or_supercolumn(cc);
        mList.add(m);
        cfMutation.put(cf, mList);
        mutationMap.put(key, cfMutation);
    }

    private static void setupKeyspace(Cassandra.Iface client) throws TException, InvalidRequestException
    {
        List<CfDef> cfDefList = new ArrayList<CfDef>();
        CfDef input = new CfDef(app.KEYSPACE, app.COLUMN_FAMILY);
       input.setComparator_type("AsciiType");
       input.setDefault_validation_class("AsciiType");
       cfDefList.add(input);
        CfDef output = new CfDef(app.KEYSPACE, app.OUTPUT_COLUMN_FAMILY);
       output.setComparator_type("AsciiType");
       output.setDefault_validation_class("AsciiType");
        cfDefList.add(output);

        client.system_add_keyspace(new KsDef(app.KEYSPACE, "org.apache.cassandra.locator.SimpleStrategy", 1, cfDefList));
        int magnitude = client.describe_ring(app.KEYSPACE).size();
        try
        {
            Thread.sleep(1000 * magnitude);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }

// Change
	private static void readtext(String dir){
	total="";
	try{
      File file = new File("/home/kane/text/2008LNCS/"+dir);

      if (checkBeforeReadfile(file)){
        BufferedReader br = new BufferedReader(new FileReader(file));

        String str;
        while((str = br.readLine()) != null){
                total += str;
        }
        System.out.println(total);
        br.close();
      }else{
        System.out.println("no file");
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }catch(IOException e){
      System.out.println(e);
    }

	}


    private static Cassandra.Iface createConnection() throws TTransportException
    {
        if (System.getProperty("cassandra.host") == null || System.getProperty("cassandra.port") == null)
        {
           logger.warn("cassandra.host or cassandra.port is not defined, using default");
        }
        return createConnection( System.getProperty("cassandra.host","localhost"),
                                 Integer.valueOf(System.getProperty("cassandra.port","9160")),
                                 Boolean.valueOf(System.getProperty("cassandra.framed", "true")) );
    }

    private static Cassandra.Client createConnection(String host, Integer port, boolean framed) throws TTransportException
    {
        TSocket socket = new TSocket(host, port);
        TTransport trans = framed ? new TFramedTransport(socket) : socket;
        trans.open();
        TProtocol protocol = new TBinaryProtocol(trans);

        return new Cassandra.Client(protocol);
    }

private static boolean checkBeforeReadfile(File file){
if (file.exists()){
if(file.isFile() && file.canRead()){
return true;
}
}
return false;
}
}
