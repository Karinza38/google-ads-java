// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/user_lists.proto

package com.google.ads.googleads.v15.common;

public interface SimilarUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.SimilarUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Seed UserList from which this list is derived.
   * </pre>
   *
   * <code>optional string seed_user_list = 2;</code>
   * @return Whether the seedUserList field is set.
   */
  boolean hasSeedUserList();
  /**
   * <pre>
   * Seed UserList from which this list is derived.
   * </pre>
   *
   * <code>optional string seed_user_list = 2;</code>
   * @return The seedUserList.
   */
  java.lang.String getSeedUserList();
  /**
   * <pre>
   * Seed UserList from which this list is derived.
   * </pre>
   *
   * <code>optional string seed_user_list = 2;</code>
   * @return The bytes for seedUserList.
   */
  com.google.protobuf.ByteString
      getSeedUserListBytes();
}
