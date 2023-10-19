// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/audience_insights_service.proto

package com.google.ads.googleads.v15.services;

public interface AudienceInsightsAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.AudienceInsightsAttribute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An audience attribute defined by an age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AgeRangeInfo age_range = 1;</code>
   * @return Whether the ageRange field is set.
   */
  boolean hasAgeRange();
  /**
   * <pre>
   * An audience attribute defined by an age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AgeRangeInfo age_range = 1;</code>
   * @return The ageRange.
   */
  com.google.ads.googleads.v15.common.AgeRangeInfo getAgeRange();
  /**
   * <pre>
   * An audience attribute defined by an age range.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AgeRangeInfo age_range = 1;</code>
   */
  com.google.ads.googleads.v15.common.AgeRangeInfoOrBuilder getAgeRangeOrBuilder();

  /**
   * <pre>
   * An audience attribute defined by a gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 2;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <pre>
   * An audience attribute defined by a gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 2;</code>
   * @return The gender.
   */
  com.google.ads.googleads.v15.common.GenderInfo getGender();
  /**
   * <pre>
   * An audience attribute defined by a gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 2;</code>
   */
  com.google.ads.googleads.v15.common.GenderInfoOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * An audience attribute defined by a geographic location.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.LocationInfo location = 3;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * An audience attribute defined by a geographic location.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.LocationInfo location = 3;</code>
   * @return The location.
   */
  com.google.ads.googleads.v15.common.LocationInfo getLocation();
  /**
   * <pre>
   * An audience attribute defined by a geographic location.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.LocationInfo location = 3;</code>
   */
  com.google.ads.googleads.v15.common.LocationInfoOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * An Affinity or In-Market audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.UserInterestInfo user_interest = 4;</code>
   * @return Whether the userInterest field is set.
   */
  boolean hasUserInterest();
  /**
   * <pre>
   * An Affinity or In-Market audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.UserInterestInfo user_interest = 4;</code>
   * @return The userInterest.
   */
  com.google.ads.googleads.v15.common.UserInterestInfo getUserInterest();
  /**
   * <pre>
   * An Affinity or In-Market audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.UserInterestInfo user_interest = 4;</code>
   */
  com.google.ads.googleads.v15.common.UserInterestInfoOrBuilder getUserInterestOrBuilder();

  /**
   * <pre>
   * An audience attribute defined by interest in a topic represented by a
   * Knowledge Graph entity.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsEntity entity = 5;</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <pre>
   * An audience attribute defined by interest in a topic represented by a
   * Knowledge Graph entity.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsEntity entity = 5;</code>
   * @return The entity.
   */
  com.google.ads.googleads.v15.services.AudienceInsightsEntity getEntity();
  /**
   * <pre>
   * An audience attribute defined by interest in a topic represented by a
   * Knowledge Graph entity.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsEntity entity = 5;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsEntityOrBuilder getEntityOrBuilder();

  /**
   * <pre>
   * An audience attribute defined by interest in a Product &amp; Service
   * category.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsCategory category = 6;</code>
   * @return Whether the category field is set.
   */
  boolean hasCategory();
  /**
   * <pre>
   * An audience attribute defined by interest in a Product &amp; Service
   * category.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsCategory category = 6;</code>
   * @return The category.
   */
  com.google.ads.googleads.v15.services.AudienceInsightsCategory getCategory();
  /**
   * <pre>
   * An audience attribute defined by interest in a Product &amp; Service
   * category.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsCategory category = 6;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsCategoryOrBuilder getCategoryOrBuilder();

  /**
   * <pre>
   * A YouTube Dynamic Lineup
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsDynamicLineup dynamic_lineup = 7;</code>
   * @return Whether the dynamicLineup field is set.
   */
  boolean hasDynamicLineup();
  /**
   * <pre>
   * A YouTube Dynamic Lineup
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsDynamicLineup dynamic_lineup = 7;</code>
   * @return The dynamicLineup.
   */
  com.google.ads.googleads.v15.services.AudienceInsightsDynamicLineup getDynamicLineup();
  /**
   * <pre>
   * A YouTube Dynamic Lineup
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.AudienceInsightsDynamicLineup dynamic_lineup = 7;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsDynamicLineupOrBuilder getDynamicLineupOrBuilder();

  /**
   * <pre>
   * A Parental Status value (parent, or not a parent).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ParentalStatusInfo parental_status = 8;</code>
   * @return Whether the parentalStatus field is set.
   */
  boolean hasParentalStatus();
  /**
   * <pre>
   * A Parental Status value (parent, or not a parent).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ParentalStatusInfo parental_status = 8;</code>
   * @return The parentalStatus.
   */
  com.google.ads.googleads.v15.common.ParentalStatusInfo getParentalStatus();
  /**
   * <pre>
   * A Parental Status value (parent, or not a parent).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ParentalStatusInfo parental_status = 8;</code>
   */
  com.google.ads.googleads.v15.common.ParentalStatusInfoOrBuilder getParentalStatusOrBuilder();

  /**
   * <pre>
   * A household income percentile range.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.IncomeRangeInfo income_range = 9;</code>
   * @return Whether the incomeRange field is set.
   */
  boolean hasIncomeRange();
  /**
   * <pre>
   * A household income percentile range.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.IncomeRangeInfo income_range = 9;</code>
   * @return The incomeRange.
   */
  com.google.ads.googleads.v15.common.IncomeRangeInfo getIncomeRange();
  /**
   * <pre>
   * A household income percentile range.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.IncomeRangeInfo income_range = 9;</code>
   */
  com.google.ads.googleads.v15.common.IncomeRangeInfoOrBuilder getIncomeRangeOrBuilder();

  /**
   * <pre>
   * A YouTube channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 10;</code>
   * @return Whether the youtubeChannel field is set.
   */
  boolean hasYoutubeChannel();
  /**
   * <pre>
   * A YouTube channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 10;</code>
   * @return The youtubeChannel.
   */
  com.google.ads.googleads.v15.common.YouTubeChannelInfo getYoutubeChannel();
  /**
   * <pre>
   * A YouTube channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 10;</code>
   */
  com.google.ads.googleads.v15.common.YouTubeChannelInfoOrBuilder getYoutubeChannelOrBuilder();

  com.google.ads.googleads.v15.services.AudienceInsightsAttribute.AttributeCase getAttributeCase();
}
