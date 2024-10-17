// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/asset_types.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public interface DynamicFlightsAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.DynamicFlightsAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Destination ID which can be any sequence of letters and digits,
   * and must be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string destination_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The destinationId.
   */
  java.lang.String getDestinationId();
  /**
   * <pre>
   * Required. Destination ID which can be any sequence of letters and digits,
   * and must be unique and match the values of remarketing tag. Required.
   * </pre>
   *
   * <code>string destination_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for destinationId.
   */
  com.google.protobuf.ByteString
      getDestinationIdBytes();

  /**
   * <pre>
   * Origin ID which can be any sequence of letters and digits. The ID sequence
   * (destination ID + origin ID) must be unique.
   * </pre>
   *
   * <code>string origin_id = 2;</code>
   * @return The originId.
   */
  java.lang.String getOriginId();
  /**
   * <pre>
   * Origin ID which can be any sequence of letters and digits. The ID sequence
   * (destination ID + origin ID) must be unique.
   * </pre>
   *
   * <code>string origin_id = 2;</code>
   * @return The bytes for originId.
   */
  com.google.protobuf.ByteString
      getOriginIdBytes();

  /**
   * <pre>
   * Required. Flight description, for example, Book your ticket. Required.
   * </pre>
   *
   * <code>string flight_description = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The flightDescription.
   */
  java.lang.String getFlightDescription();
  /**
   * <pre>
   * Required. Flight description, for example, Book your ticket. Required.
   * </pre>
   *
   * <code>string flight_description = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for flightDescription.
   */
  com.google.protobuf.ByteString
      getFlightDescriptionBytes();

  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 4;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 4;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Destination name, for example, Paris.
   * </pre>
   *
   * <code>string destination_name = 5;</code>
   * @return The destinationName.
   */
  java.lang.String getDestinationName();
  /**
   * <pre>
   * Destination name, for example, Paris.
   * </pre>
   *
   * <code>string destination_name = 5;</code>
   * @return The bytes for destinationName.
   */
  com.google.protobuf.ByteString
      getDestinationNameBytes();

  /**
   * <pre>
   * Origin name, for example, London.
   * </pre>
   *
   * <code>string origin_name = 6;</code>
   * @return The originName.
   */
  java.lang.String getOriginName();
  /**
   * <pre>
   * Origin name, for example, London.
   * </pre>
   *
   * <code>string origin_name = 6;</code>
   * @return The bytes for originName.
   */
  com.google.protobuf.ByteString
      getOriginNameBytes();

  /**
   * <pre>
   * Flight price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 100.00 USD.
   * </pre>
   *
   * <code>string flight_price = 7;</code>
   * @return The flightPrice.
   */
  java.lang.String getFlightPrice();
  /**
   * <pre>
   * Flight price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 100.00 USD.
   * </pre>
   *
   * <code>string flight_price = 7;</code>
   * @return The bytes for flightPrice.
   */
  com.google.protobuf.ByteString
      getFlightPriceBytes();

  /**
   * <pre>
   * Flight sale price which can be number followed by the alphabetic currency
   * code, ISO 4217 standard. Use '.' as the decimal mark, for example, 80.00
   * USD. Must be less than the 'flight_price' field.
   * </pre>
   *
   * <code>string flight_sale_price = 8;</code>
   * @return The flightSalePrice.
   */
  java.lang.String getFlightSalePrice();
  /**
   * <pre>
   * Flight sale price which can be number followed by the alphabetic currency
   * code, ISO 4217 standard. Use '.' as the decimal mark, for example, 80.00
   * USD. Must be less than the 'flight_price' field.
   * </pre>
   *
   * <code>string flight_sale_price = 8;</code>
   * @return The bytes for flightSalePrice.
   */
  com.google.protobuf.ByteString
      getFlightSalePriceBytes();

  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $100.00.
   * </pre>
   *
   * <code>string formatted_price = 9;</code>
   * @return The formattedPrice.
   */
  java.lang.String getFormattedPrice();
  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $100.00.
   * </pre>
   *
   * <code>string formatted_price = 9;</code>
   * @return The bytes for formattedPrice.
   */
  com.google.protobuf.ByteString
      getFormattedPriceBytes();

  /**
   * <pre>
   * Formatted sale price which can be any characters. If set, this attribute
   * will be used instead of 'sale price', for example, On sale for $80.00.
   * </pre>
   *
   * <code>string formatted_sale_price = 10;</code>
   * @return The formattedSalePrice.
   */
  java.lang.String getFormattedSalePrice();
  /**
   * <pre>
   * Formatted sale price which can be any characters. If set, this attribute
   * will be used instead of 'sale price', for example, On sale for $80.00.
   * </pre>
   *
   * <code>string formatted_sale_price = 10;</code>
   * @return The bytes for formattedSalePrice.
   */
  com.google.protobuf.ByteString
      getFormattedSalePriceBytes();

  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 11;</code>
   * @return The androidAppLink.
   */
  java.lang.String getAndroidAppLink();
  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 11;</code>
   * @return The bytes for androidAppLink.
   */
  com.google.protobuf.ByteString
      getAndroidAppLinkBytes();

  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 12;</code>
   * @return The iosAppLink.
   */
  java.lang.String getIosAppLink();
  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 12;</code>
   * @return The bytes for iosAppLink.
   */
  com.google.protobuf.ByteString
      getIosAppLinkBytes();

  /**
   * <pre>
   * iOS app store ID. This is used to check if the user has the app installed
   * on their device before deep linking. If this field is set, then the
   * ios_app_link field must also be present.
   * </pre>
   *
   * <code>int64 ios_app_store_id = 13;</code>
   * @return The iosAppStoreId.
   */
  long getIosAppStoreId();

  /**
   * <pre>
   * Similar destination IDs, for example, PAR,LON.
   * </pre>
   *
   * <code>repeated string similar_destination_ids = 14;</code>
   * @return A list containing the similarDestinationIds.
   */
  java.util.List<java.lang.String>
      getSimilarDestinationIdsList();
  /**
   * <pre>
   * Similar destination IDs, for example, PAR,LON.
   * </pre>
   *
   * <code>repeated string similar_destination_ids = 14;</code>
   * @return The count of similarDestinationIds.
   */
  int getSimilarDestinationIdsCount();
  /**
   * <pre>
   * Similar destination IDs, for example, PAR,LON.
   * </pre>
   *
   * <code>repeated string similar_destination_ids = 14;</code>
   * @param index The index of the element to return.
   * @return The similarDestinationIds at the given index.
   */
  java.lang.String getSimilarDestinationIds(int index);
  /**
   * <pre>
   * Similar destination IDs, for example, PAR,LON.
   * </pre>
   *
   * <code>repeated string similar_destination_ids = 14;</code>
   * @param index The index of the value to return.
   * @return The bytes of the similarDestinationIds at the given index.
   */
  com.google.protobuf.ByteString
      getSimilarDestinationIdsBytes(int index);

  /**
   * <pre>
   * A custom field which can be multiple key to values mapping separated by
   * delimiters (",", "|" and ":"), in the forms of
   * "&lt;KEY_1&gt;: &lt;VALUE_1&gt;, &lt;VALUE_2&gt;, ... ,&lt;VALUE_N&gt; | &lt;KEY_2&gt;: &lt;VALUE_1&gt;, ...
   * ,&lt;VALUE_N&gt; | ... | &lt;KEY_N&gt;: &lt;VALUE_1&gt;, ... ,&lt;VALUE_N&gt;" for example, wifi:
   * most | aircraft: 320, 77W | flights: 42 | legroom: 32".
   * </pre>
   *
   * <code>string custom_mapping = 15;</code>
   * @return The customMapping.
   */
  java.lang.String getCustomMapping();
  /**
   * <pre>
   * A custom field which can be multiple key to values mapping separated by
   * delimiters (",", "|" and ":"), in the forms of
   * "&lt;KEY_1&gt;: &lt;VALUE_1&gt;, &lt;VALUE_2&gt;, ... ,&lt;VALUE_N&gt; | &lt;KEY_2&gt;: &lt;VALUE_1&gt;, ...
   * ,&lt;VALUE_N&gt; | ... | &lt;KEY_N&gt;: &lt;VALUE_1&gt;, ... ,&lt;VALUE_N&gt;" for example, wifi:
   * most | aircraft: 320, 77W | flights: 42 | legroom: 32".
   * </pre>
   *
   * <code>string custom_mapping = 15;</code>
   * @return The bytes for customMapping.
   */
  com.google.protobuf.ByteString
      getCustomMappingBytes();
}
