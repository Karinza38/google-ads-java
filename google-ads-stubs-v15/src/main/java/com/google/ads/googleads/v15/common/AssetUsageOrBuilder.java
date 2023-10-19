// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_usage.proto

package com.google.ads.googleads.v15.common;

public interface AssetUsageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.AssetUsage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the asset.
   * </pre>
   *
   * <code>string asset = 1;</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Resource name of the asset.
   * </pre>
   *
   * <code>string asset = 1;</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * The served field type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
   * @return The enum numeric value on the wire for servedAssetFieldType.
   */
  int getServedAssetFieldTypeValue();
  /**
   * <pre>
   * The served field type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
   * @return The servedAssetFieldType.
   */
  com.google.ads.googleads.v15.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType getServedAssetFieldType();
}
