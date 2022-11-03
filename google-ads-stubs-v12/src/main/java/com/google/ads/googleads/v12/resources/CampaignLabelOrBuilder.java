// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/campaign_label.proto

package com.google.ads.googleads.v12.resources;

public interface CampaignLabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.CampaignLabel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Name of the resource.
   * Campaign label resource names have the form:
   * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Name of the resource.
   * Campaign label resource names have the form:
   * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The campaign to which the label is attached.
   * </pre>
   *
   * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the label is attached.
   * </pre>
   *
   * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Immutable. The campaign to which the label is attached.
   * </pre>
   *
   * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Immutable. The label assigned to the campaign.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the campaign.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the campaign.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();
}
