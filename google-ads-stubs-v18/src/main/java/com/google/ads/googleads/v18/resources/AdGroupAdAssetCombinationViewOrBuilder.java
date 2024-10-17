// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/ad_group_ad_asset_combination_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface AdGroupAdAssetCombinationViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.AdGroupAdAssetCombinationView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the ad group ad asset combination view.
   * The combination ID is 128 bits long, where the upper 64 bits are stored in
   * asset_combination_id_high, and the lower 64 bits are stored in
   * asset_combination_id_low.
   * AdGroupAd Asset Combination view resource names have the form:
   * `customers/{customer_id}/adGroupAdAssetCombinationViews/{AdGroupAd.ad_group_id}~{AdGroupAd.ad.ad_id}~{AssetCombination.asset_combination_id_low}~{AssetCombination.asset_combination_id_high}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the ad group ad asset combination view.
   * The combination ID is 128 bits long, where the upper 64 bits are stored in
   * asset_combination_id_high, and the lower 64 bits are stored in
   * asset_combination_id_low.
   * AdGroupAd Asset Combination view resource names have the form:
   * `customers/{customer_id}/adGroupAdAssetCombinationViews/{AdGroupAd.ad_group_id}~{AdGroupAd.ad.ad_id}~{AssetCombination.asset_combination_id_low}~{AssetCombination.asset_combination_id_high}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Served assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AssetUsage served_assets = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.AssetUsage> 
      getServedAssetsList();
  /**
   * <pre>
   * Output only. Served assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AssetUsage served_assets = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v18.common.AssetUsage getServedAssets(int index);
  /**
   * <pre>
   * Output only. Served assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AssetUsage served_assets = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getServedAssetsCount();
  /**
   * <pre>
   * Output only. Served assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AssetUsage served_assets = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.AssetUsageOrBuilder> 
      getServedAssetsOrBuilderList();
  /**
   * <pre>
   * Output only. Served assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AssetUsage served_assets = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v18.common.AssetUsageOrBuilder getServedAssetsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The status between the asset combination and the latest
   * version of the ad. If true, the asset combination is linked to the latest
   * version of the ad. If false, it means the link once existed but has been
   * removed and is no longer present in the latest version of the ad.
   * </pre>
   *
   * <code>optional bool enabled = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * Output only. The status between the asset combination and the latest
   * version of the ad. If true, the asset combination is linked to the latest
   * version of the ad. If false, it means the link once existed but has been
   * removed and is no longer present in the latest version of the ad.
   * </pre>
   *
   * <code>optional bool enabled = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enabled.
   */
  boolean getEnabled();
}
