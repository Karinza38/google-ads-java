// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/ad_type_infos.proto

package com.google.ads.googleads.v15.common;

public interface VideoBumperInStreamAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.VideoBumperInStreamAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AdImageAsset companion_banner = 3;</code>
   * @return Whether the companionBanner field is set.
   */
  boolean hasCompanionBanner();
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AdImageAsset companion_banner = 3;</code>
   * @return The companionBanner.
   */
  com.google.ads.googleads.v15.common.AdImageAsset getCompanionBanner();
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AdImageAsset companion_banner = 3;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAssetOrBuilder getCompanionBannerOrBuilder();

  /**
   * <pre>
   * Label on the "Call To Action" button taking the user to the video ad's
   * final URL.
   * </pre>
   *
   * <code>string action_button_label = 4;</code>
   * @return The actionButtonLabel.
   */
  java.lang.String getActionButtonLabel();
  /**
   * <pre>
   * Label on the "Call To Action" button taking the user to the video ad's
   * final URL.
   * </pre>
   *
   * <code>string action_button_label = 4;</code>
   * @return The bytes for actionButtonLabel.
   */
  com.google.protobuf.ByteString
      getActionButtonLabelBytes();

  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>string action_headline = 5;</code>
   * @return The actionHeadline.
   */
  java.lang.String getActionHeadline();
  /**
   * <pre>
   * Additional text displayed with the CTA (call-to-action) button to give
   * context and encourage clicking on the button.
   * </pre>
   *
   * <code>string action_headline = 5;</code>
   * @return The bytes for actionHeadline.
   */
  com.google.protobuf.ByteString
      getActionHeadlineBytes();
}
