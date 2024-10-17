// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/travel_asset_suggestion_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface SuggestTravelAssetsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.SuggestTravelAssetsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The language specifications in BCP 47 format (for example, en-US,
   * zh-CN, etc.) for the asset suggestions. Text will be in this language.
   * Usually matches one of the campaign target languages.
   * </pre>
   *
   * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The languageOption.
   */
  java.lang.String getLanguageOption();
  /**
   * <pre>
   * Required. The language specifications in BCP 47 format (for example, en-US,
   * zh-CN, etc.) for the asset suggestions. Text will be in this language.
   * Usually matches one of the campaign target languages.
   * </pre>
   *
   * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for languageOption.
   */
  com.google.protobuf.ByteString
      getLanguageOptionBytes();

  /**
   * <pre>
   * The Google Maps Place IDs of hotels for which assets are requested. See
   * https://developers.google.com/places/web-service/place-id for more
   * information.
   * </pre>
   *
   * <code>repeated string place_ids = 4;</code>
   * @return A list containing the placeIds.
   */
  java.util.List<java.lang.String>
      getPlaceIdsList();
  /**
   * <pre>
   * The Google Maps Place IDs of hotels for which assets are requested. See
   * https://developers.google.com/places/web-service/place-id for more
   * information.
   * </pre>
   *
   * <code>repeated string place_ids = 4;</code>
   * @return The count of placeIds.
   */
  int getPlaceIdsCount();
  /**
   * <pre>
   * The Google Maps Place IDs of hotels for which assets are requested. See
   * https://developers.google.com/places/web-service/place-id for more
   * information.
   * </pre>
   *
   * <code>repeated string place_ids = 4;</code>
   * @param index The index of the element to return.
   * @return The placeIds at the given index.
   */
  java.lang.String getPlaceIds(int index);
  /**
   * <pre>
   * The Google Maps Place IDs of hotels for which assets are requested. See
   * https://developers.google.com/places/web-service/place-id for more
   * information.
   * </pre>
   *
   * <code>repeated string place_ids = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the placeIds at the given index.
   */
  com.google.protobuf.ByteString
      getPlaceIdsBytes(int index);
}
