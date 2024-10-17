// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/audiences.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public interface AgeSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.AgeSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Minimum age to include. A minimum age must be specified and must be at
   * least 18. Allowed values are 18, 25, 35, 45, 55, and 65.
   * </pre>
   *
   * <code>optional int32 min_age = 1;</code>
   * @return Whether the minAge field is set.
   */
  boolean hasMinAge();
  /**
   * <pre>
   * Minimum age to include. A minimum age must be specified and must be at
   * least 18. Allowed values are 18, 25, 35, 45, 55, and 65.
   * </pre>
   *
   * <code>optional int32 min_age = 1;</code>
   * @return The minAge.
   */
  int getMinAge();

  /**
   * <pre>
   * Maximum age to include. A maximum age need not be specified. If specified,
   * max_age must be greater than min_age, and allowed values are 24, 34, 44,
   * 54, and 64.
   * </pre>
   *
   * <code>optional int32 max_age = 2;</code>
   * @return Whether the maxAge field is set.
   */
  boolean hasMaxAge();
  /**
   * <pre>
   * Maximum age to include. A maximum age need not be specified. If specified,
   * max_age must be greater than min_age, and allowed values are 24, 34, 44,
   * 54, and 64.
   * </pre>
   *
   * <code>optional int32 max_age = 2;</code>
   * @return The maxAge.
   */
  int getMaxAge();
}
