// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/campaign_customizer_service.proto

package com.google.ads.googleads.v12.services;

public interface MutateCampaignCustomizerResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.MutateCampaignCustomizerResult)
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
   * The mutated CampaignCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignCustomizer campaign_customizer = 2;</code>
   * @return Whether the campaignCustomizer field is set.
   */
  boolean hasCampaignCustomizer();
  /**
   * <pre>
   * The mutated CampaignCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignCustomizer campaign_customizer = 2;</code>
   * @return The campaignCustomizer.
   */
  com.google.ads.googleads.v12.resources.CampaignCustomizer getCampaignCustomizer();
  /**
   * <pre>
   * The mutated CampaignCustomizer with only mutable fields after mutate.
   * The field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.resources.CampaignCustomizer campaign_customizer = 2;</code>
   */
  com.google.ads.googleads.v12.resources.CampaignCustomizerOrBuilder getCampaignCustomizerOrBuilder();
}
