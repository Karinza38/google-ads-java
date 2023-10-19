// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_set_types.proto

package com.google.ads.googleads.v15.common;

public interface ChainFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.ChainFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Used to filter chain locations by chain id. Only chain locations
   * that belong to the specified chain will be in the asset set.
   * </pre>
   *
   * <code>int64 chain_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The chainId.
   */
  long getChainId();

  /**
   * <pre>
   * Used to filter chain locations by location attributes.
   * Only chain locations that belong to all of the specified attribute(s) will
   * be in the asset set. If this field is empty, it means no filtering on this
   * field.
   * </pre>
   *
   * <code>repeated string location_attributes = 2;</code>
   * @return A list containing the locationAttributes.
   */
  java.util.List<java.lang.String>
      getLocationAttributesList();
  /**
   * <pre>
   * Used to filter chain locations by location attributes.
   * Only chain locations that belong to all of the specified attribute(s) will
   * be in the asset set. If this field is empty, it means no filtering on this
   * field.
   * </pre>
   *
   * <code>repeated string location_attributes = 2;</code>
   * @return The count of locationAttributes.
   */
  int getLocationAttributesCount();
  /**
   * <pre>
   * Used to filter chain locations by location attributes.
   * Only chain locations that belong to all of the specified attribute(s) will
   * be in the asset set. If this field is empty, it means no filtering on this
   * field.
   * </pre>
   *
   * <code>repeated string location_attributes = 2;</code>
   * @param index The index of the element to return.
   * @return The locationAttributes at the given index.
   */
  java.lang.String getLocationAttributes(int index);
  /**
   * <pre>
   * Used to filter chain locations by location attributes.
   * Only chain locations that belong to all of the specified attribute(s) will
   * be in the asset set. If this field is empty, it means no filtering on this
   * field.
   * </pre>
   *
   * <code>repeated string location_attributes = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the locationAttributes at the given index.
   */
  com.google.protobuf.ByteString
      getLocationAttributesBytes(int index);
}
