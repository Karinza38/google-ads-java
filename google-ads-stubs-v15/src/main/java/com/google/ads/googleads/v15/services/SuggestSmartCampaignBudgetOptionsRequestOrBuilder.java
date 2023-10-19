// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/smart_campaign_suggest_service.proto

package com.google.ads.googleads.v15.services;

public interface SuggestSmartCampaignBudgetOptionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.SuggestSmartCampaignBudgetOptionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose budget options are to be suggested.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose budget options are to be suggested.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The resource name of the campaign to get suggestion for.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * Required. The resource name of the campaign to get suggestion for.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * Required. The resource name of the campaign to get suggestion for.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Required. Information needed to get budget options
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SmartCampaignSuggestionInfo suggestion_info = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the suggestionInfo field is set.
   */
  boolean hasSuggestionInfo();
  /**
   * <pre>
   * Required. Information needed to get budget options
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SmartCampaignSuggestionInfo suggestion_info = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The suggestionInfo.
   */
  com.google.ads.googleads.v15.services.SmartCampaignSuggestionInfo getSuggestionInfo();
  /**
   * <pre>
   * Required. Information needed to get budget options
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.SmartCampaignSuggestionInfo suggestion_info = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.services.SmartCampaignSuggestionInfoOrBuilder getSuggestionInfoOrBuilder();

  com.google.ads.googleads.v15.services.SuggestSmartCampaignBudgetOptionsRequest.SuggestionDataCase getSuggestionDataCase();
}
