// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/recommendation_subscription_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface RecommendationSubscriptionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.RecommendationSubscriptionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. FieldMask that determines which resource fields are modified in
   * an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. FieldMask that determines which resource fields are modified in
   * an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. FieldMask that determines which resource fields are modified in
   * an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new subscription.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.RecommendationSubscription create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new subscription.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.RecommendationSubscription create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.resources.RecommendationSubscription getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new subscription.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.RecommendationSubscription create = 1;</code>
   */
  com.google.ads.googleads.v18.resources.RecommendationSubscriptionOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The subscription is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.RecommendationSubscription update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The subscription is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.RecommendationSubscription update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v18.resources.RecommendationSubscription getUpdate();
  /**
   * <pre>
   * Update operation: The subscription is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.RecommendationSubscription update = 2;</code>
   */
  com.google.ads.googleads.v18.resources.RecommendationSubscriptionOrBuilder getUpdateOrBuilder();

  com.google.ads.googleads.v18.services.RecommendationSubscriptionOperation.OperationCase getOperationCase();
}
