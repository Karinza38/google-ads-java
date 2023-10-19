// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/audience_insights_service.proto

package com.google.ads.googleads.v15.services;

public interface TargetingSuggestionMetricsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.TargetingSuggestionMetrics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Suggested location targeting.  These attributes all have dimension
   * GEO_TARGET_COUNTRY or SUB_COUNTRY_LOCATION
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata locations = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata> 
      getLocationsList();
  /**
   * <pre>
   * Suggested location targeting.  These attributes all have dimension
   * GEO_TARGET_COUNTRY or SUB_COUNTRY_LOCATION
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata locations = 1;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata getLocations(int index);
  /**
   * <pre>
   * Suggested location targeting.  These attributes all have dimension
   * GEO_TARGET_COUNTRY or SUB_COUNTRY_LOCATION
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata locations = 1;</code>
   */
  int getLocationsCount();
  /**
   * <pre>
   * Suggested location targeting.  These attributes all have dimension
   * GEO_TARGET_COUNTRY or SUB_COUNTRY_LOCATION
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata locations = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.AudienceInsightsAttributeMetadataOrBuilder> 
      getLocationsOrBuilderList();
  /**
   * <pre>
   * Suggested location targeting.  These attributes all have dimension
   * GEO_TARGET_COUNTRY or SUB_COUNTRY_LOCATION
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata locations = 1;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsAttributeMetadataOrBuilder getLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * Suggested age targeting; may be empty indicating no age targeting.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AgeRangeInfo> 
      getAgeRangesList();
  /**
   * <pre>
   * Suggested age targeting; may be empty indicating no age targeting.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 2;</code>
   */
  com.google.ads.googleads.v15.common.AgeRangeInfo getAgeRanges(int index);
  /**
   * <pre>
   * Suggested age targeting; may be empty indicating no age targeting.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 2;</code>
   */
  int getAgeRangesCount();
  /**
   * <pre>
   * Suggested age targeting; may be empty indicating no age targeting.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AgeRangeInfoOrBuilder> 
      getAgeRangesOrBuilderList();
  /**
   * <pre>
   * Suggested age targeting; may be empty indicating no age targeting.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 2;</code>
   */
  com.google.ads.googleads.v15.common.AgeRangeInfoOrBuilder getAgeRangesOrBuilder(
      int index);

  /**
   * <pre>
   * Suggested gender targeting.  If present, this attribute has dimension
   * GENDER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 3;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <pre>
   * Suggested gender targeting.  If present, this attribute has dimension
   * GENDER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 3;</code>
   * @return The gender.
   */
  com.google.ads.googleads.v15.common.GenderInfo getGender();
  /**
   * <pre>
   * Suggested gender targeting.  If present, this attribute has dimension
   * GENDER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 3;</code>
   */
  com.google.ads.googleads.v15.common.GenderInfoOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Suggested audience segments to target.  These attributes all have dimension
   * AFFINITY_USER_INTEREST or IN_MARKET_USER_INTEREST
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata user_interests = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata> 
      getUserInterestsList();
  /**
   * <pre>
   * Suggested audience segments to target.  These attributes all have dimension
   * AFFINITY_USER_INTEREST or IN_MARKET_USER_INTEREST
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata user_interests = 4;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata getUserInterests(int index);
  /**
   * <pre>
   * Suggested audience segments to target.  These attributes all have dimension
   * AFFINITY_USER_INTEREST or IN_MARKET_USER_INTEREST
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata user_interests = 4;</code>
   */
  int getUserInterestsCount();
  /**
   * <pre>
   * Suggested audience segments to target.  These attributes all have dimension
   * AFFINITY_USER_INTEREST or IN_MARKET_USER_INTEREST
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata user_interests = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.AudienceInsightsAttributeMetadataOrBuilder> 
      getUserInterestsOrBuilderList();
  /**
   * <pre>
   * Suggested audience segments to target.  These attributes all have dimension
   * AFFINITY_USER_INTEREST or IN_MARKET_USER_INTEREST
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsAttributeMetadata user_interests = 4;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsAttributeMetadataOrBuilder getUserInterestsOrBuilder(
      int index);

  /**
   * <pre>
   * The fraction (from 0 to 1 inclusive) of the requested audience that can be
   * reached using the suggested targeting.
   * </pre>
   *
   * <code>double coverage = 5;</code>
   * @return The coverage.
   */
  double getCoverage();

  /**
   * <pre>
   * The ratio of coverage to the coverage of the baseline audience or zero if
   * this ratio is undefined or is not meaningful.
   * </pre>
   *
   * <code>double index = 6;</code>
   * @return The index.
   */
  double getIndex();

  /**
   * <pre>
   * The approximate estimated number of people that can be reached on YouTube
   * using this targeting.
   * </pre>
   *
   * <code>int64 potential_youtube_reach = 7;</code>
   * @return The potentialYoutubeReach.
   */
  long getPotentialYoutubeReach();
}
