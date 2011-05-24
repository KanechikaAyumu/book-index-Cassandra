/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra;

import org.apache.cassandra.config.CFMetaData;
import org.apache.cassandra.config.ConfigurationException;
import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.config.KSMetaData;
import org.junit.BeforeClass;

public class SchemaLoader
{
    // todo: when xml is fully deprecated, this method should be changed to manually load a few table definitions into
    // the definitions keyspace.
    @BeforeClass
    public static void loadSchemaFromYaml()
    {
        try
        {
            for (KSMetaData ksm : DatabaseDescriptor.readTablesFromYaml())
            {
                for (CFMetaData cfm : ksm.cfMetaData().values())
                    CFMetaData.map(cfm);
                DatabaseDescriptor.setTableDefinition(ksm, DatabaseDescriptor.getDefsVersion());
            }
        }
        catch (ConfigurationException e)
        {
            throw new RuntimeException(e);
        }
    }
}
