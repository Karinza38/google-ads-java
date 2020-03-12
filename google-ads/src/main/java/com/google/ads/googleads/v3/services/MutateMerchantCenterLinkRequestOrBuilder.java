// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/merchant_center_link_service.proto

package com.google.ads.googleads.v3.services;

public interface MutateMerchantCenterLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.MutateMerchantCenterLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The operation to perform on the link
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.MerchantCenterLinkOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasOperation();
  /**
   * <pre>
   * Required. The operation to perform on the link
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.MerchantCenterLinkOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.services.MerchantCenterLinkOperation getOperation();
  /**
   * <pre>
   * Required. The operation to perform on the link
   * </pre>
   *
   * <code>.google.ads.googleads.v3.services.MerchantCenterLinkOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.services.MerchantCenterLinkOperationOrBuilder getOperationOrBuilder();
}