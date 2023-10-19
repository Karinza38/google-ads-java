// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/audience_insights_service.proto

package com.google.ads.googleads.v15.services;

public interface BasicInsightsAudienceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.BasicInsightsAudience)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.LocationInfo> 
      getCountryLocationList();
  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.common.LocationInfo getCountryLocation(int index);
  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getCountryLocationCount();
  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.LocationInfoOrBuilder> 
      getCountryLocationOrBuilderList();
  /**
   * <pre>
   * Required. The countries for this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo country_location = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.common.LocationInfoOrBuilder getCountryLocationOrBuilder(
      int index);

  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo sub_country_locations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.LocationInfo> 
      getSubCountryLocationsList();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo sub_country_locations = 2;</code>
   */
  com.google.ads.googleads.v15.common.LocationInfo getSubCountryLocations(int index);
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo sub_country_locations = 2;</code>
   */
  int getSubCountryLocationsCount();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo sub_country_locations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.LocationInfoOrBuilder> 
      getSubCountryLocationsOrBuilderList();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.LocationInfo sub_country_locations = 2;</code>
   */
  com.google.ads.googleads.v15.common.LocationInfoOrBuilder getSubCountryLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 3;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 3;</code>
   * @return The gender.
   */
  com.google.ads.googleads.v15.common.GenderInfo getGender();
  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.GenderInfo gender = 3;</code>
   */
  com.google.ads.googleads.v15.common.GenderInfoOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AgeRangeInfo> 
      getAgeRangesList();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 4;</code>
   */
  com.google.ads.googleads.v15.common.AgeRangeInfo getAgeRanges(int index);
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 4;</code>
   */
  int getAgeRangesCount();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AgeRangeInfoOrBuilder> 
      getAgeRangesOrBuilderList();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AgeRangeInfo age_ranges = 4;</code>
   */
  com.google.ads.googleads.v15.common.AgeRangeInfoOrBuilder getAgeRangesOrBuilder(
      int index);

  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserInterestInfo user_interests = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.UserInterestInfo> 
      getUserInterestsList();
  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserInterestInfo user_interests = 5;</code>
   */
  com.google.ads.googleads.v15.common.UserInterestInfo getUserInterests(int index);
  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserInterestInfo user_interests = 5;</code>
   */
  int getUserInterestsCount();
  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserInterestInfo user_interests = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.UserInterestInfoOrBuilder> 
      getUserInterestsOrBuilderList();
  /**
   * <pre>
   * User interests defining this audience.  Affinity and In-Market audiences
   * are supported.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.UserInterestInfo user_interests = 5;</code>
   */
  com.google.ads.googleads.v15.common.UserInterestInfoOrBuilder getUserInterestsOrBuilder(
      int index);

  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsTopic topics = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.AudienceInsightsTopic> 
      getTopicsList();
  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsTopic topics = 6;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsTopic getTopics(int index);
  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsTopic topics = 6;</code>
   */
  int getTopicsCount();
  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsTopic topics = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.AudienceInsightsTopicOrBuilder> 
      getTopicsOrBuilderList();
  /**
   * <pre>
   * Topics, represented by Knowledge Graph entities and/or Product &amp; Service
   * categories, that this audience is interested in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.AudienceInsightsTopic topics = 6;</code>
   */
  com.google.ads.googleads.v15.services.AudienceInsightsTopicOrBuilder getTopicsOrBuilder(
      int index);
}
