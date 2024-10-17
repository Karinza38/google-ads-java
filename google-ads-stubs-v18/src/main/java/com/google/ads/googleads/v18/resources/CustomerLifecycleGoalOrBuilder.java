// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/customer_lifecycle_goal.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface CustomerLifecycleGoalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.CustomerLifecycleGoal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the customer lifecycle goal.
   * Customer lifecycle resource names have the form:
   *
   * `customers/{customer_id}/customerLifecycleGoal`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the customer lifecycle goal.
   * Customer lifecycle resource names have the form:
   *
   * `customers/{customer_id}/customerLifecycleGoal`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Customer acquisition goal customer level value settings.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.LifecycleGoalValueSettings customer_acquisition_goal_value_settings = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the customerAcquisitionGoalValueSettings field is set.
   */
  boolean hasCustomerAcquisitionGoalValueSettings();
  /**
   * <pre>
   * Output only. Customer acquisition goal customer level value settings.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.LifecycleGoalValueSettings customer_acquisition_goal_value_settings = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The customerAcquisitionGoalValueSettings.
   */
  com.google.ads.googleads.v18.common.LifecycleGoalValueSettings getCustomerAcquisitionGoalValueSettings();
  /**
   * <pre>
   * Output only. Customer acquisition goal customer level value settings.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.LifecycleGoalValueSettings customer_acquisition_goal_value_settings = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v18.common.LifecycleGoalValueSettingsOrBuilder getCustomerAcquisitionGoalValueSettingsOrBuilder();
}
