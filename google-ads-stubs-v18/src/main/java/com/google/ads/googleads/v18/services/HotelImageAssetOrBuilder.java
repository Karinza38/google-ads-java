// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/travel_asset_suggestion_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface HotelImageAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.HotelImageAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URI for the image.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * URI for the image.
   * </pre>
   *
   * <code>string uri = 1;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * The Image asset type. For example, MARKETING_IMAGE,
   * PORTRAIT_MARKETING_IMAGE, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
   * @return The enum numeric value on the wire for assetFieldType.
   */
  int getAssetFieldTypeValue();
  /**
   * <pre>
   * The Image asset type. For example, MARKETING_IMAGE,
   * PORTRAIT_MARKETING_IMAGE, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 2;</code>
   * @return The assetFieldType.
   */
  com.google.ads.googleads.v18.enums.AssetFieldTypeEnum.AssetFieldType getAssetFieldType();
}
