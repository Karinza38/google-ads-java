// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/ad_group_ad_asset_view.proto

package com.google.ads.googleads.v15.resources;

public interface AdGroupAdAssetViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.AdGroupAdAssetView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the ad group ad asset view.
   * Ad group ad asset view resource names have the form (Before V4):
   *
   * `customers/{customer_id}/adGroupAdAssets/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.field_type}`
   *
   * Ad group ad asset view resource names have the form (Beginning from V4):
   *
   * `customers/{customer_id}/adGroupAdAssetViews/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the ad group ad asset view.
   * Ad group ad asset view resource names have the form (Before V4):
   *
   * `customers/{customer_id}/adGroupAdAssets/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.field_type}`
   *
   * Ad group ad asset view resource names have the form (Beginning from V4):
   *
   * `customers/{customer_id}/adGroupAdAssetViews/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>optional string ad_group_ad = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupAd field is set.
   */
  boolean hasAdGroupAd();
  /**
   * <pre>
   * Output only. The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>optional string ad_group_ad = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupAd.
   */
  java.lang.String getAdGroupAd();
  /**
   * <pre>
   * Output only. The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>optional string ad_group_ad = 9 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupAd.
   */
  com.google.protobuf.ByteString
      getAdGroupAdBytes();

  /**
   * <pre>
   * Output only. The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>optional string asset = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the asset field is set.
   */
  boolean hasAsset();
  /**
   * <pre>
   * Output only. The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>optional string asset = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Output only. The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>optional string asset = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Output only. Role that the asset takes in the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetFieldTypeEnum.AssetFieldType field_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Output only. Role that the asset takes in the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetFieldTypeEnum.AssetFieldType field_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldType.
   */
  com.google.ads.googleads.v15.enums.AssetFieldTypeEnum.AssetFieldType getFieldType();

  /**
   * <pre>
   * Output only. The status between the asset and the latest version of the ad.
   * If true, the asset is linked to the latest version of the ad. If false, it
   * means the link once existed but has been removed and is no longer present
   * in the latest version of the ad.
   * </pre>
   *
   * <code>optional bool enabled = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * Output only. The status between the asset and the latest version of the ad.
   * If true, the asset is linked to the latest version of the ad. If false, it
   * means the link once existed but has been removed and is no longer present
   * in the latest version of the ad.
   * </pre>
   *
   * <code>optional bool enabled = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * Output only. Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AdGroupAdAssetPolicySummary policy_summary = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the policySummary field is set.
   */
  boolean hasPolicySummary();
  /**
   * <pre>
   * Output only. Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AdGroupAdAssetPolicySummary policy_summary = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The policySummary.
   */
  com.google.ads.googleads.v15.resources.AdGroupAdAssetPolicySummary getPolicySummary();
  /**
   * <pre>
   * Output only. Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AdGroupAdAssetPolicySummary policy_summary = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v15.resources.AdGroupAdAssetPolicySummaryOrBuilder getPolicySummaryOrBuilder();

  /**
   * <pre>
   * Output only. Performance of an asset linkage.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel performance_label = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for performanceLabel.
   */
  int getPerformanceLabelValue();
  /**
   * <pre>
   * Output only. Performance of an asset linkage.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel performance_label = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The performanceLabel.
   */
  com.google.ads.googleads.v15.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel getPerformanceLabel();

  /**
   * <pre>
   * Output only. Pinned field.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType pinned_field = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for pinnedField.
   */
  int getPinnedFieldValue();
  /**
   * <pre>
   * Output only. Pinned field.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType pinned_field = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The pinnedField.
   */
  com.google.ads.googleads.v15.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType getPinnedField();

  /**
   * <pre>
   * Output only. Source of the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetSourceEnum.AssetSource source = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <pre>
   * Output only. Source of the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetSourceEnum.AssetSource source = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The source.
   */
  com.google.ads.googleads.v15.enums.AssetSourceEnum.AssetSource getSource();
}
