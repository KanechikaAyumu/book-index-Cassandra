/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.cassandra.avro;

@SuppressWarnings("all")
public class IndexExpression extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"IndexExpression\",\"namespace\":\"org.apache.cassandra.avro\",\"fields\":[{\"name\":\"column_name\",\"type\":\"bytes\"},{\"name\":\"op\",\"type\":{\"type\":\"enum\",\"name\":\"IndexOperator\",\"symbols\":[\"EQ\",\"GTE\",\"GT\",\"LTE\",\"LT\"]}},{\"name\":\"value\",\"type\":\"bytes\"}]}");
  public java.nio.ByteBuffer column_name;
  public org.apache.cassandra.avro.IndexOperator op;
  public java.nio.ByteBuffer value;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return column_name;
    case 1: return op;
    case 2: return value;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: column_name = (java.nio.ByteBuffer)value$; break;
    case 1: op = (org.apache.cassandra.avro.IndexOperator)value$; break;
    case 2: value = (java.nio.ByteBuffer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}