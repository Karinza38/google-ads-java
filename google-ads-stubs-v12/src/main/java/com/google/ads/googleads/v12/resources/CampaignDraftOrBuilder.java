// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/campaign_draft.proto

package com.google.ads.googleads.v12.resources;

public interface CampaignDraftOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.CampaignDraft)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the campaign draft.
   * Campaign draft resource names have the form:
   * `customers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the campaign draft.
   * Campaign draft resource names have the form:
   * `customers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the draft.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 draft_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the draftId field is set.
   */
  boolean hasDraftId();
  /**
   * <pre>
   * Output only. The ID of the draft.
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 draft_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The draftId.
   */
  long getDraftId();

  /**
   * <pre>
   * Immutable. The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>optional string base_campaign = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the baseCampaign field is set.
   */
  boolean hasBaseCampaign();
  /**
   * <pre>
   * Immutable. The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>optional string base_campaign = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The baseCampaign.
   */
  java.lang.String getBaseCampaign();
  /**
   * <pre>
   * Immutable. The base campaign to which the draft belongs.
   * </pre>
   *
   * <code>optional string base_campaign = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for baseCampaign.
   */
  com.google.protobuf.ByteString
      getBaseCampaignBytes();

  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>optional string name = 11;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>optional string name = 11;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the campaign draft.
   * This field is required and should not be empty when creating new
   * campaign drafts.
   * It must not contain any null (code point 0x0), NL line feed
   * (code point 0xA) or carriage return (code point 0xD) characters.
   * </pre>
   *
   * <code>optional string name = 11;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>optional string draft_campaign = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the draftCampaign field is set.
   */
  boolean hasDraftCampaign();
  /**
   * <pre>
   * Output only. Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>optional string draft_campaign = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The draftCampaign.
   */
  java.lang.String getDraftCampaign();
  /**
   * <pre>
   * Output only. Resource name of the Campaign that results from overlaying the draft
   * changes onto the base campaign.
   * This field is read-only.
   * </pre>
   *
   * <code>optional string draft_campaign = 12 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for draftCampaign.
   */
  com.google.protobuf.ByteString
      getDraftCampaignBytes();

  /**
   * <pre>
   * Output only. The status of the campaign draft. This field is read-only.
   * When a new campaign draft is added, the status defaults to PROPOSED.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CampaignDraftStatusEnum.CampaignDraftStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the campaign draft. This field is read-only.
   * When a new campaign draft is added, the status defaults to PROPOSED.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CampaignDraftStatusEnum.CampaignDraftStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v12.enums.CampaignDraftStatusEnum.CampaignDraftStatus getStatus();

  /**
   * <pre>
   * Output only. Whether there is an experiment based on this draft currently serving.
   * </pre>
   *
   * <code>optional bool has_experiment_running = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the hasExperimentRunning field is set.
   */
  boolean hasHasExperimentRunning();
  /**
   * <pre>
   * Output only. Whether there is an experiment based on this draft currently serving.
   * </pre>
   *
   * <code>optional bool has_experiment_running = 13 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hasExperimentRunning.
   */
  boolean getHasExperimentRunning();

  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>optional string long_running_operation = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the longRunningOperation field is set.
   */
  boolean hasLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>optional string long_running_operation = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The longRunningOperation.
   */
  java.lang.String getLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be used to poll
   * for completion of draft promotion. This is only set if the draft promotion
   * is in progress or finished.
   * </pre>
   *
   * <code>optional string long_running_operation = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for longRunningOperation.
   */
  com.google.protobuf.ByteString
      getLongRunningOperationBytes();
}