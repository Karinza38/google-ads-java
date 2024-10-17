// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface CampaignToForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.CampaignToForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of resource names of languages to be targeted. The resource name
   * is of the format "languageConstants/{criterion_id}". See
   * https://developers.google.com/google-ads/api/data/codes-formats#languages
   * for the list of language criterion codes.
   * </pre>
   *
   * <code>repeated string language_constants = 1;</code>
   * @return A list containing the languageConstants.
   */
  java.util.List<java.lang.String>
      getLanguageConstantsList();
  /**
   * <pre>
   * The list of resource names of languages to be targeted. The resource name
   * is of the format "languageConstants/{criterion_id}". See
   * https://developers.google.com/google-ads/api/data/codes-formats#languages
   * for the list of language criterion codes.
   * </pre>
   *
   * <code>repeated string language_constants = 1;</code>
   * @return The count of languageConstants.
   */
  int getLanguageConstantsCount();
  /**
   * <pre>
   * The list of resource names of languages to be targeted. The resource name
   * is of the format "languageConstants/{criterion_id}". See
   * https://developers.google.com/google-ads/api/data/codes-formats#languages
   * for the list of language criterion codes.
   * </pre>
   *
   * <code>repeated string language_constants = 1;</code>
   * @param index The index of the element to return.
   * @return The languageConstants at the given index.
   */
  java.lang.String getLanguageConstants(int index);
  /**
   * <pre>
   * The list of resource names of languages to be targeted. The resource name
   * is of the format "languageConstants/{criterion_id}". See
   * https://developers.google.com/google-ads/api/data/codes-formats#languages
   * for the list of language criterion codes.
   * </pre>
   *
   * <code>repeated string language_constants = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the languageConstants at the given index.
   */
  com.google.protobuf.ByteString
      getLanguageConstantsBytes(int index);

  /**
   * <pre>
   * Locations to be targeted. Locations must be unique.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.CriterionBidModifier geo_modifiers = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.CriterionBidModifier> 
      getGeoModifiersList();
  /**
   * <pre>
   * Locations to be targeted. Locations must be unique.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.CriterionBidModifier geo_modifiers = 2;</code>
   */
  com.google.ads.googleads.v18.services.CriterionBidModifier getGeoModifiers(int index);
  /**
   * <pre>
   * Locations to be targeted. Locations must be unique.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.CriterionBidModifier geo_modifiers = 2;</code>
   */
  int getGeoModifiersCount();
  /**
   * <pre>
   * Locations to be targeted. Locations must be unique.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.CriterionBidModifier geo_modifiers = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.CriterionBidModifierOrBuilder> 
      getGeoModifiersOrBuilderList();
  /**
   * <pre>
   * Locations to be targeted. Locations must be unique.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.CriterionBidModifier geo_modifiers = 2;</code>
   */
  com.google.ads.googleads.v18.services.CriterionBidModifierOrBuilder getGeoModifiersOrBuilder(
      int index);

  /**
   * <pre>
   * Required. The network used for targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for keywordPlanNetwork.
   */
  int getKeywordPlanNetworkValue();
  /**
   * <pre>
   * Required. The network used for targeting.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork keyword_plan_network = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The keywordPlanNetwork.
   */
  com.google.ads.googleads.v18.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork getKeywordPlanNetwork();

  /**
   * <pre>
   * The list of negative keywords to be used in the campaign when doing the
   * forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.KeywordInfo negative_keywords = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.KeywordInfo> 
      getNegativeKeywordsList();
  /**
   * <pre>
   * The list of negative keywords to be used in the campaign when doing the
   * forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.KeywordInfo negative_keywords = 4;</code>
   */
  com.google.ads.googleads.v18.common.KeywordInfo getNegativeKeywords(int index);
  /**
   * <pre>
   * The list of negative keywords to be used in the campaign when doing the
   * forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.KeywordInfo negative_keywords = 4;</code>
   */
  int getNegativeKeywordsCount();
  /**
   * <pre>
   * The list of negative keywords to be used in the campaign when doing the
   * forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.KeywordInfo negative_keywords = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.KeywordInfoOrBuilder> 
      getNegativeKeywordsOrBuilderList();
  /**
   * <pre>
   * The list of negative keywords to be used in the campaign when doing the
   * forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.KeywordInfo negative_keywords = 4;</code>
   */
  com.google.ads.googleads.v18.common.KeywordInfoOrBuilder getNegativeKeywordsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. The bidding strategy for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CampaignToForecast.CampaignBiddingStrategy bidding_strategy = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the biddingStrategy field is set.
   */
  boolean hasBiddingStrategy();
  /**
   * <pre>
   * Required. The bidding strategy for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CampaignToForecast.CampaignBiddingStrategy bidding_strategy = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The biddingStrategy.
   */
  com.google.ads.googleads.v18.services.CampaignToForecast.CampaignBiddingStrategy getBiddingStrategy();
  /**
   * <pre>
   * Required. The bidding strategy for the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.services.CampaignToForecast.CampaignBiddingStrategy bidding_strategy = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v18.services.CampaignToForecast.CampaignBiddingStrategyOrBuilder getBiddingStrategyOrBuilder();

  /**
   * <pre>
   * The expected conversion rate (number of conversions divided by number of
   * total clicks) as defined by the user. This value is expressed as a decimal
   * value, so an expected conversion rate of 2% should be entered as 0.02. If
   * left empty, an estimated conversion rate will be used.
   * </pre>
   *
   * <code>optional double conversion_rate = 6;</code>
   * @return Whether the conversionRate field is set.
   */
  boolean hasConversionRate();
  /**
   * <pre>
   * The expected conversion rate (number of conversions divided by number of
   * total clicks) as defined by the user. This value is expressed as a decimal
   * value, so an expected conversion rate of 2% should be entered as 0.02. If
   * left empty, an estimated conversion rate will be used.
   * </pre>
   *
   * <code>optional double conversion_rate = 6;</code>
   * @return The conversionRate.
   */
  double getConversionRate();

  /**
   * <pre>
   * The ad groups in the new campaign to forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ForecastAdGroup ad_groups = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.ForecastAdGroup> 
      getAdGroupsList();
  /**
   * <pre>
   * The ad groups in the new campaign to forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ForecastAdGroup ad_groups = 7;</code>
   */
  com.google.ads.googleads.v18.services.ForecastAdGroup getAdGroups(int index);
  /**
   * <pre>
   * The ad groups in the new campaign to forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ForecastAdGroup ad_groups = 7;</code>
   */
  int getAdGroupsCount();
  /**
   * <pre>
   * The ad groups in the new campaign to forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ForecastAdGroup ad_groups = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.ForecastAdGroupOrBuilder> 
      getAdGroupsOrBuilderList();
  /**
   * <pre>
   * The ad groups in the new campaign to forecast.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ForecastAdGroup ad_groups = 7;</code>
   */
  com.google.ads.googleads.v18.services.ForecastAdGroupOrBuilder getAdGroupsOrBuilder(
      int index);
}
