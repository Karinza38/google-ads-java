// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/smart_campaign_setting_service.proto

package com.google.ads.googleads.v15.services;

public interface SmartCampaignRemovedDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.SmartCampaignRemovedDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The timestamp of when the campaign was removed.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string removed_date_time = 1;</code>
   * @return Whether the removedDateTime field is set.
   */
  boolean hasRemovedDateTime();
  /**
   * <pre>
   * The timestamp of when the campaign was removed.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string removed_date_time = 1;</code>
   * @return The removedDateTime.
   */
  java.lang.String getRemovedDateTime();
  /**
   * <pre>
   * The timestamp of when the campaign was removed.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string removed_date_time = 1;</code>
   * @return The bytes for removedDateTime.
   */
  com.google.protobuf.ByteString
      getRemovedDateTimeBytes();
}
