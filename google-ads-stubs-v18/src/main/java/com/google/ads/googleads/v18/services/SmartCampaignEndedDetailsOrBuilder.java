// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/smart_campaign_setting_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface SmartCampaignEndedDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.SmartCampaignEndedDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The timestamp of when the campaign ended.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string end_date_time = 1;</code>
   * @return Whether the endDateTime field is set.
   */
  boolean hasEndDateTime();
  /**
   * <pre>
   * The timestamp of when the campaign ended.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string end_date_time = 1;</code>
   * @return The endDateTime.
   */
  java.lang.String getEndDateTime();
  /**
   * <pre>
   * The timestamp of when the campaign ended.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string end_date_time = 1;</code>
   * @return The bytes for endDateTime.
   */
  com.google.protobuf.ByteString
      getEndDateTimeBytes();
}
