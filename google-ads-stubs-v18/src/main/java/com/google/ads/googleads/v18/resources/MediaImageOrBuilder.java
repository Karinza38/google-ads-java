// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/media_file.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface MediaImageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.MediaImage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Raw image data.
   * </pre>
   *
   * <code>optional bytes data = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * Immutable. Raw image data.
   * </pre>
   *
   * <code>optional bytes data = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * Output only. The url to the full size version of the image.
   * </pre>
   *
   * <code>optional string full_size_image_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the fullSizeImageUrl field is set.
   */
  boolean hasFullSizeImageUrl();
  /**
   * <pre>
   * Output only. The url to the full size version of the image.
   * </pre>
   *
   * <code>optional string full_size_image_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fullSizeImageUrl.
   */
  java.lang.String getFullSizeImageUrl();
  /**
   * <pre>
   * Output only. The url to the full size version of the image.
   * </pre>
   *
   * <code>optional string full_size_image_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for fullSizeImageUrl.
   */
  com.google.protobuf.ByteString
      getFullSizeImageUrlBytes();

  /**
   * <pre>
   * Output only. The url to the preview size version of the image.
   * </pre>
   *
   * <code>optional string preview_size_image_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the previewSizeImageUrl field is set.
   */
  boolean hasPreviewSizeImageUrl();
  /**
   * <pre>
   * Output only. The url to the preview size version of the image.
   * </pre>
   *
   * <code>optional string preview_size_image_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The previewSizeImageUrl.
   */
  java.lang.String getPreviewSizeImageUrl();
  /**
   * <pre>
   * Output only. The url to the preview size version of the image.
   * </pre>
   *
   * <code>optional string preview_size_image_url = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for previewSizeImageUrl.
   */
  com.google.protobuf.ByteString
      getPreviewSizeImageUrlBytes();
}
