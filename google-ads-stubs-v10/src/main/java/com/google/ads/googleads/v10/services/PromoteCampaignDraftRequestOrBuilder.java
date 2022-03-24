// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/campaign_draft_service.proto

package com.google.ads.googleads.v10.services;

public interface PromoteCampaignDraftRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v10.services.PromoteCampaignDraftRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name of the campaign draft to promote.
   * </pre>
   *
   * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The campaignDraft.
   */
  java.lang.String getCampaignDraft();
  /**
   * <pre>
   * Required. The resource name of the campaign draft to promote.
   * </pre>
   *
   * <code>string campaign_draft = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaignDraft.
   */
  com.google.protobuf.ByteString
      getCampaignDraftBytes();

  /**
   * <pre>
   * If true, the request is validated but no Long Running Operation is created.
   * Only errors are returned.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}