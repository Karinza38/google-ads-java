// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/bidding_seasonality_adjustment_service.proto

package com.google.ads.googleads.v15.services;

public interface MutateBiddingSeasonalityAdjustmentsResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateBiddingSeasonalityAdjustmentsResult)
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
   * The mutated bidding seasonality adjustment with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
   * @return Whether the biddingSeasonalityAdjustment field is set.
   */
  boolean hasBiddingSeasonalityAdjustment();
  /**
   * <pre>
   * The mutated bidding seasonality adjustment with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
   * @return The biddingSeasonalityAdjustment.
   */
  com.google.ads.googleads.v15.resources.BiddingSeasonalityAdjustment getBiddingSeasonalityAdjustment();
  /**
   * <pre>
   * The mutated bidding seasonality adjustment with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.BiddingSeasonalityAdjustment bidding_seasonality_adjustment = 2;</code>
   */
  com.google.ads.googleads.v15.resources.BiddingSeasonalityAdjustmentOrBuilder getBiddingSeasonalityAdjustmentOrBuilder();
}
