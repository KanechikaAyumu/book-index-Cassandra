/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.cassandra.avro;

@SuppressWarnings("all")
public class AuthenticationRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = org.apache.avro.Schema.parse("{\"type\":\"record\",\"name\":\"AuthenticationRequest\",\"namespace\":\"org.apache.cassandra.avro\",\"fields\":[{\"name\":\"credentials\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> credentials;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return credentials;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: credentials = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
}
