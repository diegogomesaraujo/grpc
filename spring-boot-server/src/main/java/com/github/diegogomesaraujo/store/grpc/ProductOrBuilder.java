// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shopping.proto

package com.github.diegogomesaraujo.store.grpc;

public interface ProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.diegogomesaraujo.store.grpc.Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string price = 4;</code>
   */
  java.lang.String getPrice();
  /**
   * <code>string price = 4;</code>
   */
  com.google.protobuf.ByteString
      getPriceBytes();
}