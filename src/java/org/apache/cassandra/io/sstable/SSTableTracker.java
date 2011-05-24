/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.cassandra.io.sstable;

import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import com.google.common.base.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.cassandra.cache.JMXInstrumentedCache;
import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.db.ColumnFamily;
import org.apache.cassandra.db.DecoratedKey;
import org.apache.cassandra.utils.Pair;

public class SSTableTracker implements Iterable<SSTableReader>
{
    private static final Logger logger = LoggerFactory.getLogger(SSTableTracker.class);

    private volatile Set<SSTableReader> sstables;
    private final AtomicLong liveSize = new AtomicLong();
    private final AtomicLong totalSize = new AtomicLong();

    private final String ksname;
    private final String cfname;

    private final JMXInstrumentedCache<Pair<Descriptor,DecoratedKey>,Long> keyCache;
    private final JMXInstrumentedCache<DecoratedKey, ColumnFamily> rowCache;

    public SSTableTracker(String ksname, String cfname)
    {
        this.ksname = ksname;
        this.cfname = cfname;
        sstables = Collections.emptySet();
        keyCache = new JMXInstrumentedCache<Pair<Descriptor,DecoratedKey>,Long>(ksname, cfname + "KeyCache", 0);
        rowCache = new JMXInstrumentedCache<DecoratedKey, ColumnFamily>(ksname, cfname + "RowCache", 3);
    }

    public CacheWriter<Pair<Descriptor, DecoratedKey>, Long> getKeyCacheWriter()
    {
        Function<Pair<Descriptor, DecoratedKey>, ByteBuffer> function = new Function<Pair<Descriptor, DecoratedKey>, ByteBuffer>()
        {
            public ByteBuffer apply(Pair<Descriptor, DecoratedKey> key)
            {
                return key.right.key;
            }
        };
        return new CacheWriter<Pair<Descriptor, DecoratedKey>, Long>(cfname, keyCache, DatabaseDescriptor.getSerializedKeyCachePath(ksname, cfname), function);
    }

    public CacheWriter<DecoratedKey, ColumnFamily> getRowCacheWriter()
    {
        Function<DecoratedKey, ByteBuffer> function = new Function<DecoratedKey, ByteBuffer>()
        {
            public ByteBuffer apply(DecoratedKey key)
            {
                return key.key;
            }
        };
        return new CacheWriter<DecoratedKey, ColumnFamily>(cfname, rowCache, DatabaseDescriptor.getSerializedRowCachePath(ksname, cfname), function);
    }

    public synchronized void replace(Collection<SSTableReader> oldSSTables, Iterable<SSTableReader> replacements)
    {
        Set<SSTableReader> sstablesNew = new HashSet<SSTableReader>(sstables);

        for (SSTableReader sstable : replacements)
        {
            assert sstable.getKeySamples() != null;
            if (logger.isDebugEnabled())
                logger.debug(String.format("adding %s to list of files tracked for %s.%s",
                                           sstable.descriptor, ksname, cfname));
            sstablesNew.add(sstable);
            long size = sstable.bytesOnDisk();
            liveSize.addAndGet(size);
            totalSize.addAndGet(size);
            sstable.setTrackedBy(this);
        }

        long maxDataAge = -1;
        for (SSTableReader sstable : oldSSTables)
        {
            if (logger.isDebugEnabled())
                logger.debug(String.format("removing %s from list of files tracked for %s.%s",
                                           sstable.descriptor, ksname, cfname));
            boolean removed = sstablesNew.remove(sstable);
            assert removed;
            sstable.markCompacted();
            maxDataAge = Math.max(maxDataAge, sstable.maxDataAge);
            liveSize.addAndGet(-sstable.bytesOnDisk());
        }

        sstables = Collections.unmodifiableSet(sstablesNew);
        updateCacheSizes();
    }

    public synchronized void add(Iterable<SSTableReader> sstables)
    {
        assert sstables != null;
        replace(Collections.<SSTableReader>emptyList(), sstables);
    }

    public synchronized void markCompacted(Collection<SSTableReader> compacted)
    {
        replace(compacted, Collections.<SSTableReader>emptyList());
    }

    /**
     * Resizes the key and row caches based on the current key estimate.
     */
    public synchronized void updateCacheSizes()
    {
        long keys = estimatedKeys();

        if (!keyCache.isCapacitySetManually())
        {
            int keyCacheSize = DatabaseDescriptor.getKeysCachedFor(ksname, cfname, keys);
            if (keyCacheSize != keyCache.getCapacity())
            {
                // update cache size for the new key volume
                if (logger.isDebugEnabled())
                    logger.debug("key cache capacity for " + cfname + " is " + keyCacheSize);
                keyCache.updateCapacity(keyCacheSize);
            }
        }

        if (!rowCache.isCapacitySetManually())
        {
            int rowCacheSize = DatabaseDescriptor.getRowsCachedFor(ksname, cfname, keys);
            if (rowCacheSize != rowCache.getCapacity())
            {
                if (logger.isDebugEnabled())
                    logger.debug("row cache capacity for " + cfname + " is " + rowCacheSize);
                rowCache.updateCapacity(rowCacheSize);
            }
        }
    }

    // the modifiers create new, unmodifiable objects each time; the volatile fences the assignment
    // so we don't need any further synchronization for the common case here
    public Set<SSTableReader> getSSTables()
    {
        return sstables;
    }

    public int size()
    {
        return sstables.size();
    }

    public Iterator<SSTableReader> iterator()
    {
        return sstables.iterator();
    }

    public synchronized void clearUnsafe()
    {
        sstables = Collections.emptySet();
    }

    public JMXInstrumentedCache<DecoratedKey, ColumnFamily> getRowCache()
    {
        return rowCache;
    }

    public long estimatedKeys()
    {
        long n = 0;
        for (SSTableReader sstable : this)
        {
            n += sstable.estimatedKeys();
        }
        return n;
    }

    public long getLiveSize()
    {
        return liveSize.get();
    }

    public long getTotalSize()
    {
        return totalSize.get();
    }

    public void spaceReclaimed(long size)
    {
        totalSize.addAndGet(-size);
    }

    public JMXInstrumentedCache<Pair<Descriptor, DecoratedKey>, Long> getKeyCache()
    {
        return keyCache;
    }
}

