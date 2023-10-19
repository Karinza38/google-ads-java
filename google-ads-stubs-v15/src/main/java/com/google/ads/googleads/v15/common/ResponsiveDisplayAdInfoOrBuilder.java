// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/ad_type_infos.proto

package com.google.ads.googleads.v15.common;

public interface ResponsiveDisplayAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.ResponsiveDisplayAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). At least one `marketing_image` is required. Combined
   * with `square_marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset marketing_images = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdImageAsset> 
      getMarketingImagesList();
  /**
   * <pre>
   * Marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). At least one `marketing_image` is required. Combined
   * with `square_marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset marketing_images = 1;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAsset getMarketingImages(int index);
  /**
   * <pre>
   * Marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). At least one `marketing_image` is required. Combined
   * with `square_marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset marketing_images = 1;</code>
   */
  int getMarketingImagesCount();
  /**
   * <pre>
   * Marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). At least one `marketing_image` is required. Combined
   * with `square_marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset marketing_images = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdImageAssetOrBuilder> 
      getMarketingImagesOrBuilderList();
  /**
   * <pre>
   * Marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 600x314 and the aspect ratio must
   * be 1.91:1 (+-1%). At least one `marketing_image` is required. Combined
   * with `square_marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset marketing_images = 1;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAssetOrBuilder getMarketingImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Square marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). At least one square `marketing_image` is required. Combined
   * with `marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_marketing_images = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdImageAsset> 
      getSquareMarketingImagesList();
  /**
   * <pre>
   * Square marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). At least one square `marketing_image` is required. Combined
   * with `marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_marketing_images = 2;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAsset getSquareMarketingImages(int index);
  /**
   * <pre>
   * Square marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). At least one square `marketing_image` is required. Combined
   * with `marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_marketing_images = 2;</code>
   */
  int getSquareMarketingImagesCount();
  /**
   * <pre>
   * Square marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). At least one square `marketing_image` is required. Combined
   * with `marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_marketing_images = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdImageAssetOrBuilder> 
      getSquareMarketingImagesOrBuilderList();
  /**
   * <pre>
   * Square marketing images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 300x300 and the aspect ratio must
   * be 1:1 (+-1%). At least one square `marketing_image` is required. Combined
   * with `marketing_images`, the maximum is 15.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_marketing_images = 2;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAssetOrBuilder getSquareMarketingImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 512x128 and the aspect ratio must
   * be 4:1 (+-1%). Combined with `square_logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset logo_images = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdImageAsset> 
      getLogoImagesList();
  /**
   * <pre>
   * Logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 512x128 and the aspect ratio must
   * be 4:1 (+-1%). Combined with `square_logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset logo_images = 3;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAsset getLogoImages(int index);
  /**
   * <pre>
   * Logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 512x128 and the aspect ratio must
   * be 4:1 (+-1%). Combined with `square_logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset logo_images = 3;</code>
   */
  int getLogoImagesCount();
  /**
   * <pre>
   * Logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 512x128 and the aspect ratio must
   * be 4:1 (+-1%). Combined with `square_logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset logo_images = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdImageAssetOrBuilder> 
      getLogoImagesOrBuilderList();
  /**
   * <pre>
   * Logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 512x128 and the aspect ratio must
   * be 4:1 (+-1%). Combined with `square_logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset logo_images = 3;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAssetOrBuilder getLogoImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Square logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must
   * be 1:1 (+-1%). Combined with `logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_logo_images = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdImageAsset> 
      getSquareLogoImagesList();
  /**
   * <pre>
   * Square logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must
   * be 1:1 (+-1%). Combined with `logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_logo_images = 4;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAsset getSquareLogoImages(int index);
  /**
   * <pre>
   * Square logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must
   * be 1:1 (+-1%). Combined with `logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_logo_images = 4;</code>
   */
  int getSquareLogoImagesCount();
  /**
   * <pre>
   * Square logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must
   * be 1:1 (+-1%). Combined with `logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_logo_images = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdImageAssetOrBuilder> 
      getSquareLogoImagesOrBuilderList();
  /**
   * <pre>
   * Square logo images to be used in the ad. Valid image types are GIF,
   * JPEG, and PNG. The minimum size is 128x128 and the aspect ratio must
   * be 1:1 (+-1%). Combined with `logo_images`, the maximum is 5.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdImageAsset square_logo_images = 4;</code>
   */
  com.google.ads.googleads.v15.common.AdImageAssetOrBuilder getSquareLogoImagesOrBuilder(
      int index);

  /**
   * <pre>
   * Short format headlines for the ad. The maximum length is 30 characters.
   * At least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdTextAsset> 
      getHeadlinesList();
  /**
   * <pre>
   * Short format headlines for the ad. The maximum length is 30 characters.
   * At least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 5;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAsset getHeadlines(int index);
  /**
   * <pre>
   * Short format headlines for the ad. The maximum length is 30 characters.
   * At least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 5;</code>
   */
  int getHeadlinesCount();
  /**
   * <pre>
   * Short format headlines for the ad. The maximum length is 30 characters.
   * At least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdTextAssetOrBuilder> 
      getHeadlinesOrBuilderList();
  /**
   * <pre>
   * Short format headlines for the ad. The maximum length is 30 characters.
   * At least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset headlines = 5;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAssetOrBuilder getHeadlinesOrBuilder(
      int index);

  /**
   * <pre>
   * A required long format headline. The maximum length is 90 characters.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AdTextAsset long_headline = 6;</code>
   * @return Whether the longHeadline field is set.
   */
  boolean hasLongHeadline();
  /**
   * <pre>
   * A required long format headline. The maximum length is 90 characters.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AdTextAsset long_headline = 6;</code>
   * @return The longHeadline.
   */
  com.google.ads.googleads.v15.common.AdTextAsset getLongHeadline();
  /**
   * <pre>
   * A required long format headline. The maximum length is 90 characters.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.AdTextAsset long_headline = 6;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAssetOrBuilder getLongHeadlineOrBuilder();

  /**
   * <pre>
   * Descriptive texts for the ad. The maximum length is 90 characters. At
   * least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdTextAsset> 
      getDescriptionsList();
  /**
   * <pre>
   * Descriptive texts for the ad. The maximum length is 90 characters. At
   * least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 7;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAsset getDescriptions(int index);
  /**
   * <pre>
   * Descriptive texts for the ad. The maximum length is 90 characters. At
   * least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 7;</code>
   */
  int getDescriptionsCount();
  /**
   * <pre>
   * Descriptive texts for the ad. The maximum length is 90 characters. At
   * least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdTextAssetOrBuilder> 
      getDescriptionsOrBuilderList();
  /**
   * <pre>
   * Descriptive texts for the ad. The maximum length is 90 characters. At
   * least 1 and max 5 headlines can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdTextAsset descriptions = 7;</code>
   */
  com.google.ads.googleads.v15.common.AdTextAssetOrBuilder getDescriptionsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional YouTube videos for the ad. A maximum of 5 videos can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 8;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AdVideoAsset> 
      getYoutubeVideosList();
  /**
   * <pre>
   * Optional YouTube videos for the ad. A maximum of 5 videos can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 8;</code>
   */
  com.google.ads.googleads.v15.common.AdVideoAsset getYoutubeVideos(int index);
  /**
   * <pre>
   * Optional YouTube videos for the ad. A maximum of 5 videos can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 8;</code>
   */
  int getYoutubeVideosCount();
  /**
   * <pre>
   * Optional YouTube videos for the ad. A maximum of 5 videos can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 8;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AdVideoAssetOrBuilder> 
      getYoutubeVideosOrBuilderList();
  /**
   * <pre>
   * Optional YouTube videos for the ad. A maximum of 5 videos can be specified.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AdVideoAsset youtube_videos = 8;</code>
   */
  com.google.ads.googleads.v15.common.AdVideoAssetOrBuilder getYoutubeVideosOrBuilder(
      int index);

  /**
   * <pre>
   * The advertiser/brand name. Maximum display width is 25.
   * </pre>
   *
   * <code>optional string business_name = 17;</code>
   * @return Whether the businessName field is set.
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * The advertiser/brand name. Maximum display width is 25.
   * </pre>
   *
   * <code>optional string business_name = 17;</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * The advertiser/brand name. Maximum display width is 25.
   * </pre>
   *
   * <code>optional string business_name = 17;</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * The main color of the ad in hexadecimal, for example, #ffffff for white.
   * If one of `main_color` and `accent_color` is set, the other is required as
   * well.
   * </pre>
   *
   * <code>optional string main_color = 18;</code>
   * @return Whether the mainColor field is set.
   */
  boolean hasMainColor();
  /**
   * <pre>
   * The main color of the ad in hexadecimal, for example, #ffffff for white.
   * If one of `main_color` and `accent_color` is set, the other is required as
   * well.
   * </pre>
   *
   * <code>optional string main_color = 18;</code>
   * @return The mainColor.
   */
  java.lang.String getMainColor();
  /**
   * <pre>
   * The main color of the ad in hexadecimal, for example, #ffffff for white.
   * If one of `main_color` and `accent_color` is set, the other is required as
   * well.
   * </pre>
   *
   * <code>optional string main_color = 18;</code>
   * @return The bytes for mainColor.
   */
  com.google.protobuf.ByteString
      getMainColorBytes();

  /**
   * <pre>
   * The accent color of the ad in hexadecimal, for example, #ffffff for white.
   * If one of `main_color` and `accent_color` is set, the other is required as
   * well.
   * </pre>
   *
   * <code>optional string accent_color = 19;</code>
   * @return Whether the accentColor field is set.
   */
  boolean hasAccentColor();
  /**
   * <pre>
   * The accent color of the ad in hexadecimal, for example, #ffffff for white.
   * If one of `main_color` and `accent_color` is set, the other is required as
   * well.
   * </pre>
   *
   * <code>optional string accent_color = 19;</code>
   * @return The accentColor.
   */
  java.lang.String getAccentColor();
  /**
   * <pre>
   * The accent color of the ad in hexadecimal, for example, #ffffff for white.
   * If one of `main_color` and `accent_color` is set, the other is required as
   * well.
   * </pre>
   *
   * <code>optional string accent_color = 19;</code>
   * @return The bytes for accentColor.
   */
  com.google.protobuf.ByteString
      getAccentColorBytes();

  /**
   * <pre>
   * Advertiser's consent to allow flexible color. When true, the ad may be
   * served with different color if necessary. When false, the ad will be served
   * with the specified colors or a neutral color.
   * The default value is `true`.
   * Must be true if `main_color` and `accent_color` are not set.
   * </pre>
   *
   * <code>optional bool allow_flexible_color = 20;</code>
   * @return Whether the allowFlexibleColor field is set.
   */
  boolean hasAllowFlexibleColor();
  /**
   * <pre>
   * Advertiser's consent to allow flexible color. When true, the ad may be
   * served with different color if necessary. When false, the ad will be served
   * with the specified colors or a neutral color.
   * The default value is `true`.
   * Must be true if `main_color` and `accent_color` are not set.
   * </pre>
   *
   * <code>optional bool allow_flexible_color = 20;</code>
   * @return The allowFlexibleColor.
   */
  boolean getAllowFlexibleColor();

  /**
   * <pre>
   * The call-to-action text for the ad. Maximum display width is 30.
   * </pre>
   *
   * <code>optional string call_to_action_text = 21;</code>
   * @return Whether the callToActionText field is set.
   */
  boolean hasCallToActionText();
  /**
   * <pre>
   * The call-to-action text for the ad. Maximum display width is 30.
   * </pre>
   *
   * <code>optional string call_to_action_text = 21;</code>
   * @return The callToActionText.
   */
  java.lang.String getCallToActionText();
  /**
   * <pre>
   * The call-to-action text for the ad. Maximum display width is 30.
   * </pre>
   *
   * <code>optional string call_to_action_text = 21;</code>
   * @return The bytes for callToActionText.
   */
  com.google.protobuf.ByteString
      getCallToActionTextBytes();

  /**
   * <pre>
   * Prefix before price. For example, 'as low as'.
   * </pre>
   *
   * <code>optional string price_prefix = 22;</code>
   * @return Whether the pricePrefix field is set.
   */
  boolean hasPricePrefix();
  /**
   * <pre>
   * Prefix before price. For example, 'as low as'.
   * </pre>
   *
   * <code>optional string price_prefix = 22;</code>
   * @return The pricePrefix.
   */
  java.lang.String getPricePrefix();
  /**
   * <pre>
   * Prefix before price. For example, 'as low as'.
   * </pre>
   *
   * <code>optional string price_prefix = 22;</code>
   * @return The bytes for pricePrefix.
   */
  com.google.protobuf.ByteString
      getPricePrefixBytes();

  /**
   * <pre>
   * Promotion text used for dynamic formats of responsive ads. For example
   * 'Free two-day shipping'.
   * </pre>
   *
   * <code>optional string promo_text = 23;</code>
   * @return Whether the promoText field is set.
   */
  boolean hasPromoText();
  /**
   * <pre>
   * Promotion text used for dynamic formats of responsive ads. For example
   * 'Free two-day shipping'.
   * </pre>
   *
   * <code>optional string promo_text = 23;</code>
   * @return The promoText.
   */
  java.lang.String getPromoText();
  /**
   * <pre>
   * Promotion text used for dynamic formats of responsive ads. For example
   * 'Free two-day shipping'.
   * </pre>
   *
   * <code>optional string promo_text = 23;</code>
   * @return The bytes for promoText.
   */
  com.google.protobuf.ByteString
      getPromoTextBytes();

  /**
   * <pre>
   * Specifies which format the ad will be served in. Default is ALL_FORMATS.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.DisplayAdFormatSettingEnum.DisplayAdFormatSetting format_setting = 16;</code>
   * @return The enum numeric value on the wire for formatSetting.
   */
  int getFormatSettingValue();
  /**
   * <pre>
   * Specifies which format the ad will be served in. Default is ALL_FORMATS.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.DisplayAdFormatSettingEnum.DisplayAdFormatSetting format_setting = 16;</code>
   * @return The formatSetting.
   */
  com.google.ads.googleads.v15.enums.DisplayAdFormatSettingEnum.DisplayAdFormatSetting getFormatSetting();

  /**
   * <pre>
   * Specification for various creative controls.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ResponsiveDisplayAdControlSpec control_spec = 24;</code>
   * @return Whether the controlSpec field is set.
   */
  boolean hasControlSpec();
  /**
   * <pre>
   * Specification for various creative controls.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ResponsiveDisplayAdControlSpec control_spec = 24;</code>
   * @return The controlSpec.
   */
  com.google.ads.googleads.v15.common.ResponsiveDisplayAdControlSpec getControlSpec();
  /**
   * <pre>
   * Specification for various creative controls.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.ResponsiveDisplayAdControlSpec control_spec = 24;</code>
   */
  com.google.ads.googleads.v15.common.ResponsiveDisplayAdControlSpecOrBuilder getControlSpecOrBuilder();
}
