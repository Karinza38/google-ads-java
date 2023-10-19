// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_set_types.proto

package com.google.ads.googleads.v15.common;

public interface DynamicBusinessProfileLocationGroupFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.DynamicBusinessProfileLocationGroupFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used to filter Business Profile locations by label. Only locations that
   * have any of the listed labels will be in the asset set.
   * Label filters are OR'ed together.
   * </pre>
   *
   * <code>repeated string label_filters = 1;</code>
   * @return A list containing the labelFilters.
   */
  java.util.List<java.lang.String>
      getLabelFiltersList();
  /**
   * <pre>
   * Used to filter Business Profile locations by label. Only locations that
   * have any of the listed labels will be in the asset set.
   * Label filters are OR'ed together.
   * </pre>
   *
   * <code>repeated string label_filters = 1;</code>
   * @return The count of labelFilters.
   */
  int getLabelFiltersCount();
  /**
   * <pre>
   * Used to filter Business Profile locations by label. Only locations that
   * have any of the listed labels will be in the asset set.
   * Label filters are OR'ed together.
   * </pre>
   *
   * <code>repeated string label_filters = 1;</code>
   * @param index The index of the element to return.
   * @return The labelFilters at the given index.
   */
  java.lang.String getLabelFilters(int index);
  /**
   * <pre>
   * Used to filter Business Profile locations by label. Only locations that
   * have any of the listed labels will be in the asset set.
   * Label filters are OR'ed together.
   * </pre>
   *
   * <code>repeated string label_filters = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the labelFilters at the given index.
   */
  com.google.protobuf.ByteString
      getLabelFiltersBytes(int index);

  /**
   * <pre>
   * Used to filter Business Profile locations by business name.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.common.BusinessProfileBusinessNameFilter business_name_filter = 2;</code>
   * @return Whether the businessNameFilter field is set.
   */
  boolean hasBusinessNameFilter();
  /**
   * <pre>
   * Used to filter Business Profile locations by business name.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.common.BusinessProfileBusinessNameFilter business_name_filter = 2;</code>
   * @return The businessNameFilter.
   */
  com.google.ads.googleads.v15.common.BusinessProfileBusinessNameFilter getBusinessNameFilter();
  /**
   * <pre>
   * Used to filter Business Profile locations by business name.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.common.BusinessProfileBusinessNameFilter business_name_filter = 2;</code>
   */
  com.google.ads.googleads.v15.common.BusinessProfileBusinessNameFilterOrBuilder getBusinessNameFilterOrBuilder();

  /**
   * <pre>
   * Used to filter Business Profile locations by listing ids.
   * </pre>
   *
   * <code>repeated int64 listing_id_filters = 3;</code>
   * @return A list containing the listingIdFilters.
   */
  java.util.List<java.lang.Long> getListingIdFiltersList();
  /**
   * <pre>
   * Used to filter Business Profile locations by listing ids.
   * </pre>
   *
   * <code>repeated int64 listing_id_filters = 3;</code>
   * @return The count of listingIdFilters.
   */
  int getListingIdFiltersCount();
  /**
   * <pre>
   * Used to filter Business Profile locations by listing ids.
   * </pre>
   *
   * <code>repeated int64 listing_id_filters = 3;</code>
   * @param index The index of the element to return.
   * @return The listingIdFilters at the given index.
   */
  long getListingIdFilters(int index);
}
