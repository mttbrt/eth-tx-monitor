// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethtx.proto

package com.mttbrt.ethtxmon.grpc.model;

public final class Ethtx {
  private Ethtx() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestTx_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestTx_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Address_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Tx_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Tx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013ethtx.proto\"\033\n\010Response\022\017\n\007isError\030\001 \001" +
      "(\010\"5\n\tRequestTx\022\031\n\007address\030\001 \001(\0132\010.Addre" +
      "ss\022\r\n\005limit\030\002 \001(\r\"\027\n\007Address\022\014\n\004hash\030\001 \001" +
      "(\014\"\222\001\n\002Tx\022\014\n\004hash\030\001 \001(\014\022\021\n\ttimestamp\030\002 \001" +
      "(\004\022\026\n\004from\030\003 \001(\0132\010.Address\022\024\n\002to\030\004 \001(\0132\010" +
      ".Address\022\r\n\005value\030\005 \001(\004\022\013\n\003gas\030\006 \001(\004\022\020\n\010" +
      "gasPrice\030\007 \001(\004\022\017\n\007isError\030\010 \001(\0102\261\001\n\014EthT" +
      "xService\022)\n\020MonitorAddressTx\022\010.Address\032\t" +
      ".Response\"\000\022-\n\022MonitorAddressesTx\022\010.Addr" +
      "ess\032\t.Response\"\000(\001\022\034\n\005GetTx\022\n.RequestTx\032" +
      "\003.Tx\"\0000\001\022)\n\022LatestTxForAddress\022\010.Address" +
      "\032\003.Tx\"\000(\0010\001B\"\n\036com.mttbrt.ethtxmon.grpc." +
      "modelP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Response_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Response_descriptor,
        new java.lang.String[] { "IsError", });
    internal_static_RequestTx_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RequestTx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestTx_descriptor,
        new java.lang.String[] { "Address", "Limit", });
    internal_static_Address_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Address_descriptor,
        new java.lang.String[] { "Hash", });
    internal_static_Tx_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Tx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Tx_descriptor,
        new java.lang.String[] { "Hash", "Timestamp", "From", "To", "Value", "Gas", "GasPrice", "IsError", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
