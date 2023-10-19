// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

package com.google.ads.googleads.v15.common;

public interface DiscoveryCarouselCardAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.DiscoveryCarouselCardAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Asset resource name of the associated 1.91:1 marketing image. This and/or
   * square marketing image asset is required.
   * </pre>
   *
   * <code>string marketing_image_asset = 1;</code>
   * @return The marketingImageAsset.
   */
  java.lang.String getMarketingImageAsset();
  /**
   * <pre>
   * Asset resource name of the associated 1.91:1 marketing image. This and/or
   * square marketing image asset is required.
   * </pre>
   *
   * <code>string marketing_image_asset = 1;</code>
   * @return The bytes for marketingImageAsset.
   */
  com.google.protobuf.ByteString
      getMarketingImageAssetBytes();

  /**
   * <pre>
   * Asset resource name of the associated square marketing image. This
   * and/or a marketing image asset is required.
   * </pre>
   *
   * <code>string square_marketing_image_asset = 2;</code>
   * @return The squareMarketingImageAsset.
   */
  java.lang.String getSquareMarketingImageAsset();
  /**
   * <pre>
   * Asset resource name of the associated square marketing image. This
   * and/or a marketing image asset is required.
   * </pre>
   *
   * <code>string square_marketing_image_asset = 2;</code>
   * @return The bytes for squareMarketingImageAsset.
   */
  com.google.protobuf.ByteString
      getSquareMarketingImageAssetBytes();

  /**
   * <pre>
   * Asset resource name of the associated 4:5 portrait marketing image.
   * </pre>
   *
   * <code>string portrait_marketing_image_asset = 3;</code>
   * @return The portraitMarketingImageAsset.
   */
  java.lang.String getPortraitMarketingImageAsset();
  /**
   * <pre>
   * Asset resource name of the associated 4:5 portrait marketing image.
   * </pre>
   *
   * <code>string portrait_marketing_image_asset = 3;</code>
   * @return The bytes for portraitMarketingImageAsset.
   */
  com.google.protobuf.ByteString
      getPortraitMarketingImageAssetBytes();

  /**
   * <pre>
   * Required. Headline of the carousel card.
   * </pre>
   *
   * <code>string headline = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The headline.
   */
  java.lang.String getHeadline();
  /**
   * <pre>
   * Required. Headline of the carousel card.
   * </pre>
   *
   * <code>string headline = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for headline.
   */
  com.google.protobuf.ByteString
      getHeadlineBytes();

  /**
   * <pre>
   * Call to action text.
   * </pre>
   *
   * <code>string call_to_action_text = 5;</code>
   * @return The callToActionText.
   */
  java.lang.String getCallToActionText();
  /**
   * <pre>
   * Call to action text.
   * </pre>
   *
   * <code>string call_to_action_text = 5;</code>
   * @return The bytes for callToActionText.
   */
  com.google.protobuf.ByteString
      getCallToActionTextBytes();
}
