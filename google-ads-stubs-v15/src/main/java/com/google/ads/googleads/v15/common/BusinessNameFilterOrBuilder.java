// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/feed_item_set_filter_type_infos.proto

package com.google.ads.googleads.v15.common;

public interface BusinessNameFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.BusinessNameFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Business name string to use for filtering.
   * </pre>
   *
   * <code>string business_name = 1;</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * Business name string to use for filtering.
   * </pre>
   *
   * <code>string business_name = 1;</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * The type of string matching to use when filtering with business_name.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.FeedItemSetStringFilterTypeEnum.FeedItemSetStringFilterType filter_type = 2;</code>
   * @return The enum numeric value on the wire for filterType.
   */
  int getFilterTypeValue();
  /**
   * <pre>
   * The type of string matching to use when filtering with business_name.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.FeedItemSetStringFilterTypeEnum.FeedItemSetStringFilterType filter_type = 2;</code>
   * @return The filterType.
   */
  com.google.ads.googleads.v15.enums.FeedItemSetStringFilterTypeEnum.FeedItemSetStringFilterType getFilterType();
}
