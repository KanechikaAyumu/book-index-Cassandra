/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.cassandra.avro;

@SuppressWarnings("all")
public class TokenRange extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"TokenRange\",\"namespace\":\"org.apache.cassandra.avro\",\"fields\":[{\"name\":\"start_token\",\"type\":\"string\"},{\"name\":\"end_token\",\"type\":\"string\"},{\"name\":\"endpoints\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}");
  public java.lang.CharSequence start_token;
  public java.lang.CharSequence end_token;
  public java.util.List<java.lang.CharSequence> endpoints;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return start_token;
    case 1: return end_token;
    case 2: return endpoints;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: start_token = (java.lang.CharSequence)value$; break;
    case 1: end_token = (java.lang.CharSequence)value$; break;
    case 2: endpoints = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
