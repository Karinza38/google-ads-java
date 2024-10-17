// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/product_link.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface MerchantCenterIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.MerchantCenterIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The customer ID of the Google Merchant Center account.
   * This field is required and should not be empty when creating a new
   * Merchant Center link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional int64 merchant_center_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the merchantCenterId field is set.
   */
  boolean hasMerchantCenterId();
  /**
   * <pre>
   * Immutable. The customer ID of the Google Merchant Center account.
   * This field is required and should not be empty when creating a new
   * Merchant Center link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional int64 merchant_center_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The merchantCenterId.
   */
  long getMerchantCenterId();
}
