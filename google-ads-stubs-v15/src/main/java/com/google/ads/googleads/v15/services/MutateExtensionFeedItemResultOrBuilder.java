// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/extension_feed_item_service.proto

package com.google.ads.googleads.v15.services;

public interface MutateExtensionFeedItemResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateExtensionFeedItemResult)
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
   * The mutated extension feed item with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.ExtensionFeedItem extension_feed_item = 2;</code>
   * @return Whether the extensionFeedItem field is set.
   */
  boolean hasExtensionFeedItem();
  /**
   * <pre>
   * The mutated extension feed item with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.ExtensionFeedItem extension_feed_item = 2;</code>
   * @return The extensionFeedItem.
   */
  com.google.ads.googleads.v15.resources.ExtensionFeedItem getExtensionFeedItem();
  /**
   * <pre>
   * The mutated extension feed item with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.ExtensionFeedItem extension_feed_item = 2;</code>
   */
  com.google.ads.googleads.v15.resources.ExtensionFeedItemOrBuilder getExtensionFeedItemOrBuilder();
}
