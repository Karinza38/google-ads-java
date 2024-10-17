// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface MaximizeConversionsBiddingStrategyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.MaximizeConversionsBiddingStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The daily target spend in micros to be used for estimation. This
   * value must be greater than zero.
   * </pre>
   *
   * <code>int64 daily_target_spend_micros = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dailyTargetSpendMicros.
   */
  long getDailyTargetSpendMicros();
}
