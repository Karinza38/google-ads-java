// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/bidding.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public interface MaximizeConversionValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.MaximizeConversionValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The target return on ad spend (ROAS) option. If set, the bid strategy will
   * maximize revenue while averaging the target return on ad spend. If the
   * target ROAS is high, the bid strategy may not be able to spend the full
   * budget. If the target ROAS is not set, the bid strategy will aim to
   * achieve the highest possible ROAS for the budget.
   * </pre>
   *
   * <code>double target_roas = 2;</code>
   * @return The targetRoas.
   */
  double getTargetRoas();

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * Mutable for portfolio bidding strategies only.
   * </pre>
   *
   * <code>int64 cpc_bid_ceiling_micros = 3;</code>
   * @return The cpcBidCeilingMicros.
   */
  long getCpcBidCeilingMicros();

  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * Mutable for portfolio bidding strategies only.
   * </pre>
   *
   * <code>int64 cpc_bid_floor_micros = 4;</code>
   * @return The cpcBidFloorMicros.
   */
  long getCpcBidFloorMicros();
}
