// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/asset_set_asset.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface AssetSetAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.AssetSetAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the asset set asset.
   * Asset set asset resource names have the form:
   *
   * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the asset set asset.
   * Asset set asset resource names have the form:
   *
   * `customers/{customer_id}/assetSetAssets/{asset_set_id}~{asset_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The asset set which this asset set asset is linking to.
   * </pre>
   *
   * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetSet.
   */
  java.lang.String getAssetSet();
  /**
   * <pre>
   * Immutable. The asset set which this asset set asset is linking to.
   * </pre>
   *
   * <code>string asset_set = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetSet.
   */
  com.google.protobuf.ByteString
      getAssetSetBytes();

  /**
   * <pre>
   * Immutable. The asset which this asset set asset is linking to.
   * </pre>
   *
   * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   * <pre>
   * Immutable. The asset which this asset set asset is linking to.
   * </pre>
   *
   * <code>string asset = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString
      getAssetBytes();

  /**
   * <pre>
   * Output only. The status of the asset set asset. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the asset set asset. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v18.enums.AssetSetAssetStatusEnum.AssetSetAssetStatus getStatus();
}
