// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/shared_set_service.proto

package com.google.ads.googleads.v15.services;

public interface MutateSharedSetResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateSharedSetResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated shared set with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.SharedSet shared_set = 2;</code>
   * @return Whether the sharedSet field is set.
   */
  boolean hasSharedSet();
  /**
   * <pre>
   * The mutated shared set with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.SharedSet shared_set = 2;</code>
   * @return The sharedSet.
   */
  com.google.ads.googleads.v15.resources.SharedSet getSharedSet();
  /**
   * <pre>
   * The mutated shared set with only mutable fields after mutate. The field
   * will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.SharedSet shared_set = 2;</code>
   */
  com.google.ads.googleads.v15.resources.SharedSetOrBuilder getSharedSetOrBuilder();
}
