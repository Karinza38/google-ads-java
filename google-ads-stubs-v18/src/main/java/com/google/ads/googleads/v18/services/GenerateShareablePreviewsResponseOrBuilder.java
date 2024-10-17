// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/shareable_preview_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface GenerateShareablePreviewsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.GenerateShareablePreviewsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of generate shareable preview results.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ShareablePreviewOrError responses = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.ShareablePreviewOrError> 
      getResponsesList();
  /**
   * <pre>
   * List of generate shareable preview results.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ShareablePreviewOrError responses = 1;</code>
   */
  com.google.ads.googleads.v18.services.ShareablePreviewOrError getResponses(int index);
  /**
   * <pre>
   * List of generate shareable preview results.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ShareablePreviewOrError responses = 1;</code>
   */
  int getResponsesCount();
  /**
   * <pre>
   * List of generate shareable preview results.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ShareablePreviewOrError responses = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.ShareablePreviewOrErrorOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <pre>
   * List of generate shareable preview results.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.ShareablePreviewOrError responses = 1;</code>
   */
  com.google.ads.googleads.v18.services.ShareablePreviewOrErrorOrBuilder getResponsesOrBuilder(
      int index);
}
