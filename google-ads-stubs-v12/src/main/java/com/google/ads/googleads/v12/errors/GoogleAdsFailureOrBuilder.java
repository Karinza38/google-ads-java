// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/errors.proto

package com.google.ads.googleads.v12.errors;

public interface GoogleAdsFailureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.errors.GoogleAdsFailure)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.errors.GoogleAdsError errors = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v12.errors.GoogleAdsError> 
      getErrorsList();
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.errors.GoogleAdsError errors = 1;</code>
   */
  com.google.ads.googleads.v12.errors.GoogleAdsError getErrors(int index);
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.errors.GoogleAdsError errors = 1;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.errors.GoogleAdsError errors = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.errors.GoogleAdsErrorOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * The list of errors that occurred.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.errors.GoogleAdsError errors = 1;</code>
   */
  com.google.ads.googleads.v12.errors.GoogleAdsErrorOrBuilder getErrorsOrBuilder(
      int index);

  /**
   * <pre>
   * The unique ID of the request that is used for debugging purposes.
   * </pre>
   *
   * <code>string request_id = 2;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * The unique ID of the request that is used for debugging purposes.
   * </pre>
   *
   * <code>string request_id = 2;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
