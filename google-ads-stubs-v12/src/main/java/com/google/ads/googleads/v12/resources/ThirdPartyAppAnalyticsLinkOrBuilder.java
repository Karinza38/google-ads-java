// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/third_party_app_analytics_link.proto

package com.google.ads.googleads.v12.resources;

public interface ThirdPartyAppAnalyticsLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.ThirdPartyAppAnalyticsLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the third party app analytics link.
   * Third party app analytics link resource names have the form:
   * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the third party app analytics link.
   * Third party app analytics link resource names have the form:
   * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The shareable link ID that should be provided to the third party when
   * setting up app analytics. This is able to be regenerated using regenerate
   * method in the ThirdPartyAppAnalyticsLinkService.
   * </pre>
   *
   * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the shareableLinkId field is set.
   */
  boolean hasShareableLinkId();
  /**
   * <pre>
   * Output only. The shareable link ID that should be provided to the third party when
   * setting up app analytics. This is able to be regenerated using regenerate
   * method in the ThirdPartyAppAnalyticsLinkService.
   * </pre>
   *
   * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The shareableLinkId.
   */
  java.lang.String getShareableLinkId();
  /**
   * <pre>
   * Output only. The shareable link ID that should be provided to the third party when
   * setting up app analytics. This is able to be regenerated using regenerate
   * method in the ThirdPartyAppAnalyticsLinkService.
   * </pre>
   *
   * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for shareableLinkId.
   */
  com.google.protobuf.ByteString
      getShareableLinkIdBytes();
}
