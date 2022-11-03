// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/conversion_goal_campaign_config_service.proto

package com.google.ads.googleads.v12.services;

public interface ConversionGoalCampaignConfigOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.ConversionGoalCampaignConfigOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Update operation: The conversion goal campaign config is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionGoalCampaignConfig update = 1;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The conversion goal campaign config is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionGoalCampaignConfig update = 1;</code>
   * @return The update.
   */
  com.google.ads.googleads.v12.resources.ConversionGoalCampaignConfig getUpdate();
  /**
   * <pre>
   * Update operation: The conversion goal campaign config is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.ConversionGoalCampaignConfig update = 1;</code>
   */
  com.google.ads.googleads.v12.resources.ConversionGoalCampaignConfigOrBuilder getUpdateOrBuilder();

  public com.google.ads.googleads.v12.services.ConversionGoalCampaignConfigOperation.OperationCase getOperationCase();
}
