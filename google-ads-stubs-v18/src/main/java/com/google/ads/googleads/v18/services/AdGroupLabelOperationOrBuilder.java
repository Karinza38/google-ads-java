// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/ad_group_label_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface AdGroupLabelOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.AdGroupLabelOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupLabel create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupLabel create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.resources.AdGroupLabel getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.AdGroupLabel create = 1;</code>
   */
  com.google.ads.googleads.v18.resources.AdGroupLabelOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the ad group label
   * being removed, in this format:
   *
   * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the ad group label
   * being removed, in this format:
   *
   * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the ad group label
   * being removed, in this format:
   *
   * `customers/{customer_id}/adGroupLabels/{ad_group_id}~{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v18.services.AdGroupLabelOperation.OperationCase getOperationCase();
}
