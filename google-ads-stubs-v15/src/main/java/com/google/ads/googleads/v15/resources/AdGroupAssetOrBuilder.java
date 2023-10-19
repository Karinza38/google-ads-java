// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/ad_group_asset.proto

package com.google.ads.googleads.v15.resources;

public interface AdGroupAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.AdGroupAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group asset.
   * AdGroupAsset resource names have the form:
   *
   * `customers/{customer_id}/adGroupAssets/{ad_group_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group asset.
   * AdGroupAsset resource names have the form:
   *
   * `customers/{customer_id}/adGroupAssets/{ad_group_id}~{asset_id}~{field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Required. Immutable. The ad group to which the asset is linked.
   * </pre>
   *
   * <code>string ad_group = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroup.
   */
  java.lang.String getAdGroup();
  /**
   * <pre>
   * Required. Immutable. The ad group to which the asset is linked.
   * </pre>
   *
   * <code>string ad_group = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroup.
   */
  com.google.protobuf.ByteString
      getAdGroupBytes();

  /**
   * <pre>
   * Required. Immutable. The asset which is linked to the ad group.
   * </pre>
   *
   * <code>string asset = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Required. Immutable. The asset which is linked to the ad group.
   * </pre>
   *
   * <code>string asset = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Required. Immutable. Role that the asset takes under the linked ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetFieldTypeEnum.AssetFieldType field_type = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Required. Immutable. Role that the asset takes under the linked ad group.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetFieldTypeEnum.AssetFieldType field_type = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The fieldType.
   */
  com.google.ads.googleads.v15.enums.AssetFieldTypeEnum.AssetFieldType getFieldType();

  /**
   * <pre>
   * Output only. Source of the adgroup asset link.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetSourceEnum.AssetSource source = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for source.
   */
  int getSourceValue();
  /**
   * <pre>
   * Output only. Source of the adgroup asset link.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetSourceEnum.AssetSource source = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The source.
   */
  com.google.ads.googleads.v15.enums.AssetSourceEnum.AssetSource getSource();

  /**
   * <pre>
   * Status of the ad group asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetLinkStatusEnum.AssetLinkStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the ad group asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetLinkStatusEnum.AssetLinkStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v15.enums.AssetLinkStatusEnum.AssetLinkStatus getStatus();

  /**
   * <pre>
   * Output only. Provides the PrimaryStatus of this asset link.
   * Primary status is meant essentially to differentiate between the plain
   * "status" field, which has advertiser set values of enabled, paused, or
   * removed.  The primary status takes into account other signals (for assets
   * its mainly policy and quality approvals) to come up with a more
   * comprehensive status to indicate its serving state.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus primary_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for primaryStatus.
   */
  int getPrimaryStatusValue();
  /**
   * <pre>
   * Output only. Provides the PrimaryStatus of this asset link.
   * Primary status is meant essentially to differentiate between the plain
   * "status" field, which has advertiser set values of enabled, paused, or
   * removed.  The primary status takes into account other signals (for assets
   * its mainly policy and quality approvals) to come up with a more
   * comprehensive status to indicate its serving state.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus primary_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The primaryStatus.
   */
  com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusEnum.AssetLinkPrimaryStatus getPrimaryStatus();

  /**
   * <pre>
   * Output only. Provides the details of the primary status and its associated
   * reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetails primary_status_details = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetails> 
      getPrimaryStatusDetailsList();
  /**
   * <pre>
   * Output only. Provides the details of the primary status and its associated
   * reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetails primary_status_details = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetails getPrimaryStatusDetails(int index);
  /**
   * <pre>
   * Output only. Provides the details of the primary status and its associated
   * reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetails primary_status_details = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getPrimaryStatusDetailsCount();
  /**
   * <pre>
   * Output only. Provides the details of the primary status and its associated
   * reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetails primary_status_details = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetailsOrBuilder> 
      getPrimaryStatusDetailsOrBuilderList();
  /**
   * <pre>
   * Output only. Provides the details of the primary status and its associated
   * reasons.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetails primary_status_details = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v15.common.AssetLinkPrimaryStatusDetailsOrBuilder getPrimaryStatusDetailsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Provides a list of reasons for why an asset is not serving or
   * not serving at full capacity.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason primary_status_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the primaryStatusReasons.
   */
  java.util.List<com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason> getPrimaryStatusReasonsList();
  /**
   * <pre>
   * Output only. Provides a list of reasons for why an asset is not serving or
   * not serving at full capacity.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason primary_status_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of primaryStatusReasons.
   */
  int getPrimaryStatusReasonsCount();
  /**
   * <pre>
   * Output only. Provides a list of reasons for why an asset is not serving or
   * not serving at full capacity.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason primary_status_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The primaryStatusReasons at the given index.
   */
  com.google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason getPrimaryStatusReasons(int index);
  /**
   * <pre>
   * Output only. Provides a list of reasons for why an asset is not serving or
   * not serving at full capacity.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason primary_status_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the enum numeric values on the wire for primaryStatusReasons.
   */
  java.util.List<java.lang.Integer>
  getPrimaryStatusReasonsValueList();
  /**
   * <pre>
   * Output only. Provides a list of reasons for why an asset is not serving or
   * not serving at full capacity.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.enums.AssetLinkPrimaryStatusReasonEnum.AssetLinkPrimaryStatusReason primary_status_reasons = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of primaryStatusReasons at the given index.
   */
  int getPrimaryStatusReasonsValue(int index);
}
