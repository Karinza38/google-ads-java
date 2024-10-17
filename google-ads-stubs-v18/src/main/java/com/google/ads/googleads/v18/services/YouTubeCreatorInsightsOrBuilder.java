// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/content_creator_insights_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface YouTubeCreatorInsightsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.YouTubeCreatorInsights)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the creator.
   * </pre>
   *
   * <code>string creator_name = 1;</code>
   * @return The creatorName.
   */
  java.lang.String getCreatorName();
  /**
   * <pre>
   * The name of the creator.
   * </pre>
   *
   * <code>string creator_name = 1;</code>
   * @return The bytes for creatorName.
   */
  com.google.protobuf.ByteString
      getCreatorNameBytes();

  /**
   * <pre>
   * The list of YouTube Channels
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeChannelInsights creator_channels = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.YouTubeChannelInsights> 
      getCreatorChannelsList();
  /**
   * <pre>
   * The list of YouTube Channels
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeChannelInsights creator_channels = 2;</code>
   */
  com.google.ads.googleads.v18.services.YouTubeChannelInsights getCreatorChannels(int index);
  /**
   * <pre>
   * The list of YouTube Channels
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeChannelInsights creator_channels = 2;</code>
   */
  int getCreatorChannelsCount();
  /**
   * <pre>
   * The list of YouTube Channels
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeChannelInsights creator_channels = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.YouTubeChannelInsightsOrBuilder> 
      getCreatorChannelsOrBuilderList();
  /**
   * <pre>
   * The list of YouTube Channels
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeChannelInsights creator_channels = 2;</code>
   */
  com.google.ads.googleads.v18.services.YouTubeChannelInsightsOrBuilder getCreatorChannelsOrBuilder(
      int index);
}
