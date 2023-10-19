// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_service.proto

package com.google.ads.googleads.v15.services;

public interface MutateCustomerResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateCustomerResult)
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
   * The mutated customer with only mutable fields after mutate. The fields will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Customer customer = 2;</code>
   * @return Whether the customer field is set.
   */
  boolean hasCustomer();
  /**
   * <pre>
   * The mutated customer with only mutable fields after mutate. The fields will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Customer customer = 2;</code>
   * @return The customer.
   */
  com.google.ads.googleads.v15.resources.Customer getCustomer();
  /**
   * <pre>
   * The mutated customer with only mutable fields after mutate. The fields will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Customer customer = 2;</code>
   */
  com.google.ads.googleads.v15.resources.CustomerOrBuilder getCustomerOrBuilder();
}
