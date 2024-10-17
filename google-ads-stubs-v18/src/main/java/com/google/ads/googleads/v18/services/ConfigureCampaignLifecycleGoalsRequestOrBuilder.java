// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/campaign_lifecycle_goal_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface ConfigureCampaignLifecycleGoalsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.ConfigureCampaignLifecycleGoalsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer performing the upload.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer performing the upload.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The operation to perform campaign lifecycle goal update.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CampaignLifecycleGoalOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Required. The operation to perform campaign lifecycle goal update.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CampaignLifecycleGoalOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  com.google.ads.googleads.v18.services.CampaignLifecycleGoalOperation getOperation();
  /**
   * <pre>
   * Required. The operation to perform campaign lifecycle goal update.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CampaignLifecycleGoalOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v18.services.CampaignLifecycleGoalOperationOrBuilder getOperationOrBuilder();

  /**
   * <pre>
   * Optional. If true, the request is validated but not executed. Only errors
   * are returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
