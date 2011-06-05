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

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.*;

import org.apache.cassandra.avro.Column;
import org.apache.cassandra.avro.ColumnOrSuperColumn;
import org.apache.cassandra.avro.Mutation;
import org.apache.cassandra.hadoop.ColumnFamilyOutputFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.cassandra.db.IColumn;
import org.apache.cassandra.hadoop.ColumnFamilyInputFormat;
import org.apache.cassandra.hadoop.ConfigHelper;
import org.apache.cassandra.thrift.SlicePredicate;
import org.apache.cassandra.utils.ByteBufferUtil;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.Counter;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/**
 * This counts the occurrences of words in ColumnFamily Standard1, that has a single column (that we care about)
 * "text" containing a sequence of words.
 *
 * For each word, we output the total number of occurrences across all texts.
 *
 * When outputting to Cassandra, we write the word counts as a {word, count} column/value pair,
 * with a row key equal to the name of the source column we read the words from.
 */
public class First extends Configured implements Tool
{
    private static final Logger logger = LoggerFactory.getLogger(First.class);

    static final String KEYSPACE = "app";
    static final String COLUMN_FAMILY = "output_words";

    static final String OUTPUT_REDUCER_VAR = "output_reducer";
    static final String OUTPUT_COLUMN_FAMILY = "First";
    private static final String OUTPUT_PATH_PREFIX = "/work1/kane/tmp/app";

    private static final String CONF_COLUMN_NAME = "columnname";

	private static int instant = 0;
    public static void main(String[] args) throws Exception
    {
        // Let ToolRunner handle generic command-line options
        ToolRunner.run(new Configuration(), new First(), args);
        System.exit(0);
    }

    public static class TokenizerMapper extends Mapper<ByteBuffer, SortedMap<ByteBuffer, IColumn>, Text, IntWritable>
    {
        private  static IntWritable one = new IntWritable(1);
        private Text word = new Text();
        private ByteBuffer sourceColumn;

        protected void setup(org.apache.hadoop.mapreduce.Mapper.Context context)
        throws IOException, InterruptedException
        {
            sourceColumn = ByteBuffer.wrap(context.getConfiguration().get(CONF_COLUMN_NAME).getBytes());
        }

        public void map(ByteBuffer key, SortedMap<ByteBuffer, IColumn> columns, Context context) throws IOException, InterruptedException
        {
           // Counter counter = context.getCounter("MyCounters","NUM_TOKENS");

            IColumn column = columns.get(sourceColumn);
            if (column == null)
                return;
            String value = ByteBufferUtil.string(column.value());
            logger.debug("read " + key + ":" + value + " from " + context.getInputSplit());

            StringTokenizer itr = new StringTokenizer(value);
            while (itr.hasMoreTokens())
            {
                String[] s = new String[3];
                s = itr.nextToken().split("/");
//		instant++;
                int i = Integer.parseInt(s[2]);  		
		one = new IntWritable(i);
                word.set(s[0]);
                context.write(word, one);
	//	counter.increment(1);
	//	counter.increment(1);
            }
        }
    }

    public static class ReducerToFilesystem extends Reducer<Text, IntWritable, Text, IntWritable>
    {
        public void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException
        {
            int sum = 0;
            for (IntWritable val : values)
                sum += val.get();
            context.write(key, new IntWritable(sum));
        }
    }

    public static class ReducerToCassandra extends Reducer<Text, IntWritable, ByteBuffer, List<Mutation>>
    {
        private ByteBuffer outputKey;

        protected void setup(org.apache.hadoop.mapreduce.Reducer.Context context)
        throws IOException, InterruptedException
        {
            outputKey = ByteBuffer.wrap(context.getConfiguration().get(CONF_COLUMN_NAME).getBytes());
        }

        public void reduce(Text word, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException
        {
/*            String  sum = null;
            ArrayList Listsort = new ArrayList();
            for (IntWritable val : values){
		Listsort.add(val.get());
	    }
            sum=String.valueOf(Listsort.get(0));
            for(int i=1;i<Listsort.size();i++){
               sum+=","+String.valueOf(Listsort.get(i));
            }*/

            int sum = 0;
            for(IntWritable val : values)
             sum += val.get();
            context.write(outputKey, Collections.singletonList(getMutation(word, sum)));
        }

        private static Mutation getMutation(Text word, int sum)
        {
            Column c = new Column();
            c.name = ByteBuffer.wrap(Arrays.copyOf(word.getBytes(), word.getLength()));
            c.value = ByteBuffer.wrap(String.valueOf(sum).getBytes());
//	    c.value = ByteBuffer.wrap(sum.getBytes());			
            c.timestamp = System.currentTimeMillis() * 1000;

            Mutation m = new Mutation();
            m.column_or_supercolumn = new ColumnOrSuperColumn();
            m.column_or_supercolumn.column = c;
            return m;
        }
    }

    public int run(String[] args) throws Exception
    {
        String outputReducerType = "filesystem";
        if (args != null && args[0].startsWith(OUTPUT_REDUCER_VAR))
        {
            String[] s = args[0].split("=");
            if (s != null && s.length == 2)
                outputReducerType = s[1];
        }
        logger.info("output reducer type: " + outputReducerType);

        for (int i = 2000; i < 2012; i++)
        {
            String columnName = Integer.toString(i);
            getConf().set(CONF_COLUMN_NAME, columnName);

            Job job = new Job(getConf(), "app");
            job.setJarByClass(First.class);
            job.setMapperClass(TokenizerMapper.class);

            if (outputReducerType.equalsIgnoreCase("filesystem"))
            {
                job.setCombinerClass(ReducerToFilesystem.class);
                job.setReducerClass(ReducerToFilesystem.class);
                job.setOutputKeyClass(Text.class);
                job.setOutputValueClass(IntWritable.class);
                FileOutputFormat.setOutputPath(job, new Path(OUTPUT_PATH_PREFIX + i));
            }
            else
            {
                job.setReducerClass(ReducerToCassandra.class);

                job.setMapOutputKeyClass(Text.class);
                job.setMapOutputValueClass(IntWritable.class);
                job.setOutputKeyClass(ByteBuffer.class);
                job.setOutputValueClass(List.class);

                job.setOutputFormatClass(ColumnFamilyOutputFormat.class);

                ConfigHelper.setOutputColumnFamily(job.getConfiguration(), KEYSPACE, OUTPUT_COLUMN_FAMILY);
            }

            job.setInputFormatClass(ColumnFamilyInputFormat.class);


            ConfigHelper.setRpcPort(job.getConfiguration(), "9160");
            ConfigHelper.setInitialAddress(job.getConfiguration(), "localhost");
            ConfigHelper.setPartitioner(job.getConfiguration(), "org.apache.cassandra.dht.RandomPartitioner");
            ConfigHelper.setInputColumnFamily(job.getConfiguration(), KEYSPACE, COLUMN_FAMILY);
            SlicePredicate predicate = new SlicePredicate().setColumn_names(Arrays.asList(ByteBuffer.wrap(columnName.getBytes())));
            ConfigHelper.setInputSlicePredicate(job.getConfiguration(), predicate);

            job.waitForCompletion(true);
        }
        return 0;
    }
}
