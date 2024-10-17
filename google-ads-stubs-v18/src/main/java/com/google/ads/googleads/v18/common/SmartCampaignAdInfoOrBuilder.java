// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/ad_type_infos.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public interface SmartCampaignAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.SmartCampaignAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of text assets, each of which corresponds to a headline when the ad
   * serves. This list consists of a minimum of 3 and up to 15 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset headlines = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.AdTextAsset> 
      getHeadlinesList();
  /**
   * <pre>
   * List of text assets, each of which corresponds to a headline when the ad
   * serves. This list consists of a minimum of 3 and up to 15 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset headlines = 1;</code>
   */
  com.google.ads.googleads.v18.common.AdTextAsset getHeadlines(int index);
  /**
   * <pre>
   * List of text assets, each of which corresponds to a headline when the ad
   * serves. This list consists of a minimum of 3 and up to 15 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset headlines = 1;</code>
   */
  int getHeadlinesCount();
  /**
   * <pre>
   * List of text assets, each of which corresponds to a headline when the ad
   * serves. This list consists of a minimum of 3 and up to 15 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset headlines = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.AdTextAssetOrBuilder> 
      getHeadlinesOrBuilderList();
  /**
   * <pre>
   * List of text assets, each of which corresponds to a headline when the ad
   * serves. This list consists of a minimum of 3 and up to 15 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset headlines = 1;</code>
   */
  com.google.ads.googleads.v18.common.AdTextAssetOrBuilder getHeadlinesOrBuilder(
      int index);

  /**
   * <pre>
   * List of text assets, each of which corresponds to a description when the ad
   * serves. This list consists of a minimum of 2 and up to 4 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset descriptions = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.AdTextAsset> 
      getDescriptionsList();
  /**
   * <pre>
   * List of text assets, each of which corresponds to a description when the ad
   * serves. This list consists of a minimum of 2 and up to 4 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset descriptions = 2;</code>
   */
  com.google.ads.googleads.v18.common.AdTextAsset getDescriptions(int index);
  /**
   * <pre>
   * List of text assets, each of which corresponds to a description when the ad
   * serves. This list consists of a minimum of 2 and up to 4 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset descriptions = 2;</code>
   */
  int getDescriptionsCount();
  /**
   * <pre>
   * List of text assets, each of which corresponds to a description when the ad
   * serves. This list consists of a minimum of 2 and up to 4 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset descriptions = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.AdTextAssetOrBuilder> 
      getDescriptionsOrBuilderList();
  /**
   * <pre>
   * List of text assets, each of which corresponds to a description when the ad
   * serves. This list consists of a minimum of 2 and up to 4 text assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AdTextAsset descriptions = 2;</code>
   */
  com.google.ads.googleads.v18.common.AdTextAssetOrBuilder getDescriptionsOrBuilder(
      int index);
}
