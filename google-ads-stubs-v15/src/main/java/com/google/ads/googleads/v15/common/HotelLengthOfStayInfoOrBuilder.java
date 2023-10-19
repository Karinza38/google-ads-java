// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/criteria.proto

package com.google.ads.googleads.v15.common;

public interface HotelLengthOfStayInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.HotelLengthOfStayInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Low end of the number of nights in the stay.
   * </pre>
   *
   * <code>optional int64 min_nights = 3;</code>
   * @return Whether the minNights field is set.
   */
  boolean hasMinNights();
  /**
   * <pre>
   * Low end of the number of nights in the stay.
   * </pre>
   *
   * <code>optional int64 min_nights = 3;</code>
   * @return The minNights.
   */
  long getMinNights();

  /**
   * <pre>
   * High end of the number of nights in the stay.
   * </pre>
   *
   * <code>optional int64 max_nights = 4;</code>
   * @return Whether the maxNights field is set.
   */
  boolean hasMaxNights();
  /**
   * <pre>
   * High end of the number of nights in the stay.
   * </pre>
   *
   * <code>optional int64 max_nights = 4;</code>
   * @return The maxNights.
   */
  long getMaxNights();
}
