// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/shared_criterion.proto

package com.google.ads.googleads.v15.resources;

public interface SharedCriterionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.SharedCriterion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the shared criterion.
   * Shared set resource names have the form:
   *
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the shared criterion.
   * Shared set resource names have the form:
   *
   * `customers/{customer_id}/sharedCriteria/{shared_set_id}~{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>optional string shared_set = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the sharedSet field is set.
   */
  boolean hasSharedSet();
  /**
   * <pre>
   * Immutable. The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>optional string shared_set = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The sharedSet.
   */
  java.lang.String getSharedSet();
  /**
   * <pre>
   * Immutable. The shared set to which the shared criterion belongs.
   * </pre>
   *
   * <code>optional string shared_set = 10 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for sharedSet.
   */
  com.google.protobuf.ByteString
      getSharedSetBytes();

  /**
   * <pre>
   * Output only. The ID of the criterion.
   *
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>optional int64 criterion_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the criterionId field is set.
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * Output only. The ID of the criterion.
   *
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>optional int64 criterion_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The criterionId.
   */
  long getCriterionId();

  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CriterionTypeEnum.CriterionType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CriterionTypeEnum.CriterionType type = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v15.enums.CriterionTypeEnum.CriterionType getType();

  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordInfo keyword = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the keyword field is set.
   */
  boolean hasKeyword();
  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordInfo keyword = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The keyword.
   */
  com.google.ads.googleads.v15.common.KeywordInfo getKeyword();
  /**
   * <pre>
   * Immutable. Keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.KeywordInfo keyword = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.KeywordInfoOrBuilder getKeywordOrBuilder();

  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeVideoInfo youtube_video = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeVideo field is set.
   */
  boolean hasYoutubeVideo();
  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeVideoInfo youtube_video = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeVideo.
   */
  com.google.ads.googleads.v15.common.YouTubeVideoInfo getYoutubeVideo();
  /**
   * <pre>
   * Immutable. YouTube Video.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeVideoInfo youtube_video = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.YouTubeVideoInfoOrBuilder getYoutubeVideoOrBuilder();

  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the youtubeChannel field is set.
   */
  boolean hasYoutubeChannel();
  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The youtubeChannel.
   */
  com.google.ads.googleads.v15.common.YouTubeChannelInfo getYoutubeChannel();
  /**
   * <pre>
   * Immutable. YouTube Channel.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.YouTubeChannelInfo youtube_channel = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.YouTubeChannelInfoOrBuilder getYoutubeChannelOrBuilder();

  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the placement field is set.
   */
  boolean hasPlacement();
  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The placement.
   */
  com.google.ads.googleads.v15.common.PlacementInfo getPlacement();
  /**
   * <pre>
   * Immutable. Placement.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PlacementInfo placement = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.PlacementInfoOrBuilder getPlacementOrBuilder();

  /**
   * <pre>
   * Immutable. Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileAppCategoryInfo mobile_app_category = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mobileAppCategory field is set.
   */
  boolean hasMobileAppCategory();
  /**
   * <pre>
   * Immutable. Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileAppCategoryInfo mobile_app_category = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mobileAppCategory.
   */
  com.google.ads.googleads.v15.common.MobileAppCategoryInfo getMobileAppCategory();
  /**
   * <pre>
   * Immutable. Mobile App Category.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileAppCategoryInfo mobile_app_category = 8 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.MobileAppCategoryInfoOrBuilder getMobileAppCategoryOrBuilder();

  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileApplicationInfo mobile_application = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the mobileApplication field is set.
   */
  boolean hasMobileApplication();
  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileApplicationInfo mobile_application = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The mobileApplication.
   */
  com.google.ads.googleads.v15.common.MobileApplicationInfo getMobileApplication();
  /**
   * <pre>
   * Immutable. Mobile application.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MobileApplicationInfo mobile_application = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.MobileApplicationInfoOrBuilder getMobileApplicationOrBuilder();

  /**
   * <pre>
   * Immutable. Brand.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.BrandInfo brand = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the brand field is set.
   */
  boolean hasBrand();
  /**
   * <pre>
   * Immutable. Brand.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.BrandInfo brand = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The brand.
   */
  com.google.ads.googleads.v15.common.BrandInfo getBrand();
  /**
   * <pre>
   * Immutable. Brand.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.BrandInfo brand = 12 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v15.common.BrandInfoOrBuilder getBrandOrBuilder();

  com.google.ads.googleads.v15.resources.SharedCriterion.CriterionCase getCriterionCase();
}
