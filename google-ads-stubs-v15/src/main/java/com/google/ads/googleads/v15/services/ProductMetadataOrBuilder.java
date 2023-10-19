// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

package com.google.ads.googleads.v15.services;

public interface ProductMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.ProductMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The code associated with the ad product (for example: BUMPER,
   * TRUEVIEW_IN_STREAM).
   * To list the available plannable product codes use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v15.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>optional string plannable_product_code = 4;</code>
   * @return Whether the plannableProductCode field is set.
   */
  boolean hasPlannableProductCode();
  /**
   * <pre>
   * The code associated with the ad product (for example: BUMPER,
   * TRUEVIEW_IN_STREAM).
   * To list the available plannable product codes use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v15.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>optional string plannable_product_code = 4;</code>
   * @return The plannableProductCode.
   */
  java.lang.String getPlannableProductCode();
  /**
   * <pre>
   * The code associated with the ad product (for example: BUMPER,
   * TRUEVIEW_IN_STREAM).
   * To list the available plannable product codes use
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v15.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>optional string plannable_product_code = 4;</code>
   * @return The bytes for plannableProductCode.
   */
  com.google.protobuf.ByteString
      getPlannableProductCodeBytes();

  /**
   * <pre>
   * The name associated with the ad product.
   * </pre>
   *
   * <code>string plannable_product_name = 3;</code>
   * @return The plannableProductName.
   */
  java.lang.String getPlannableProductName();
  /**
   * <pre>
   * The name associated with the ad product.
   * </pre>
   *
   * <code>string plannable_product_name = 3;</code>
   * @return The bytes for plannableProductName.
   */
  com.google.protobuf.ByteString
      getPlannableProductNameBytes();

  /**
   * <pre>
   * The allowed plannable targeting for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.PlannableTargeting plannable_targeting = 2;</code>
   * @return Whether the plannableTargeting field is set.
   */
  boolean hasPlannableTargeting();
  /**
   * <pre>
   * The allowed plannable targeting for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.PlannableTargeting plannable_targeting = 2;</code>
   * @return The plannableTargeting.
   */
  com.google.ads.googleads.v15.services.PlannableTargeting getPlannableTargeting();
  /**
   * <pre>
   * The allowed plannable targeting for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.PlannableTargeting plannable_targeting = 2;</code>
   */
  com.google.ads.googleads.v15.services.PlannableTargetingOrBuilder getPlannableTargetingOrBuilder();
}
