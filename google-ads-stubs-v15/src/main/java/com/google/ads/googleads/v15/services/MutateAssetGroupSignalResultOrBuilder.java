// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/asset_group_signal_service.proto

package com.google.ads.googleads.v15.services;

public interface MutateAssetGroupSignalResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateAssetGroupSignalResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated AssetGroupSignal with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AssetGroupSignal asset_group_signal = 2;</code>
   * @return Whether the assetGroupSignal field is set.
   */
  boolean hasAssetGroupSignal();
  /**
   * <pre>
   * The mutated AssetGroupSignal with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AssetGroupSignal asset_group_signal = 2;</code>
   * @return The assetGroupSignal.
   */
  com.google.ads.googleads.v15.resources.AssetGroupSignal getAssetGroupSignal();
  /**
   * <pre>
   * The mutated AssetGroupSignal with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AssetGroupSignal asset_group_signal = 2;</code>
   */
  com.google.ads.googleads.v15.resources.AssetGroupSignalOrBuilder getAssetGroupSignalOrBuilder();
}
