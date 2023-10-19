// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/asset_types.proto

package com.google.ads.googleads.v15.common;

public interface DynamicCustomAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.DynamicCustomAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID which can be any sequence of letters and digits, and must be
   * unique and match the values of remarketing tag, for example, sedan.
   * Required.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Required. ID which can be any sequence of letters and digits, and must be
   * unique and match the values of remarketing tag, for example, sedan.
   * Required.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * ID2 which can be any sequence of letters and digits, for example, red. ID
   * sequence (ID + ID2) must be unique.
   * </pre>
   *
   * <code>string id2 = 2;</code>
   * @return The id2.
   */
  java.lang.String getId2();
  /**
   * <pre>
   * ID2 which can be any sequence of letters and digits, for example, red. ID
   * sequence (ID + ID2) must be unique.
   * </pre>
   *
   * <code>string id2 = 2;</code>
   * @return The bytes for id2.
   */
  com.google.protobuf.ByteString
      getId2Bytes();

  /**
   * <pre>
   * Required. Item title, for example, Mid-size sedan. Required.
   * </pre>
   *
   * <code>string item_title = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The itemTitle.
   */
  java.lang.String getItemTitle();
  /**
   * <pre>
   * Required. Item title, for example, Mid-size sedan. Required.
   * </pre>
   *
   * <code>string item_title = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for itemTitle.
   */
  com.google.protobuf.ByteString
      getItemTitleBytes();

  /**
   * <pre>
   * Item subtitle, for example, At your Mountain View dealership.
   * </pre>
   *
   * <code>string item_subtitle = 4;</code>
   * @return The itemSubtitle.
   */
  java.lang.String getItemSubtitle();
  /**
   * <pre>
   * Item subtitle, for example, At your Mountain View dealership.
   * </pre>
   *
   * <code>string item_subtitle = 4;</code>
   * @return The bytes for itemSubtitle.
   */
  com.google.protobuf.ByteString
      getItemSubtitleBytes();

  /**
   * <pre>
   * Item description, for example, Best selling mid-size car.
   * </pre>
   *
   * <code>string item_description = 5;</code>
   * @return The itemDescription.
   */
  java.lang.String getItemDescription();
  /**
   * <pre>
   * Item description, for example, Best selling mid-size car.
   * </pre>
   *
   * <code>string item_description = 5;</code>
   * @return The bytes for itemDescription.
   */
  com.google.protobuf.ByteString
      getItemDescriptionBytes();

  /**
   * <pre>
   * Item address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403
   * </pre>
   *
   * <code>string item_address = 6;</code>
   * @return The itemAddress.
   */
  java.lang.String getItemAddress();
  /**
   * <pre>
   * Item address which can be specified in one of the following formats.
   * (1) City, state, code, country, for example, Mountain View, CA, USA.
   * (2) Full address, for example, 123 Boulevard St, Mountain View, CA 94043.
   * (3) Latitude-longitude in the DDD format, for example, 41.40338, 2.17403
   * </pre>
   *
   * <code>string item_address = 6;</code>
   * @return The bytes for itemAddress.
   */
  com.google.protobuf.ByteString
      getItemAddressBytes();

  /**
   * <pre>
   * Item category, for example, Sedans.
   * </pre>
   *
   * <code>string item_category = 7;</code>
   * @return The itemCategory.
   */
  java.lang.String getItemCategory();
  /**
   * <pre>
   * Item category, for example, Sedans.
   * </pre>
   *
   * <code>string item_category = 7;</code>
   * @return The bytes for itemCategory.
   */
  com.google.protobuf.ByteString
      getItemCategoryBytes();

  /**
   * <pre>
   * Price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 20,000.00 USD.
   * </pre>
   *
   * <code>string price = 8;</code>
   * @return The price.
   */
  java.lang.String getPrice();
  /**
   * <pre>
   * Price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 20,000.00 USD.
   * </pre>
   *
   * <code>string price = 8;</code>
   * @return The bytes for price.
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <pre>
   * Sale price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 15,000.00 USD.
   * Must be less than the 'price' field.
   * </pre>
   *
   * <code>string sale_price = 9;</code>
   * @return The salePrice.
   */
  java.lang.String getSalePrice();
  /**
   * <pre>
   * Sale price which can be number followed by the alphabetic currency code,
   * ISO 4217 standard. Use '.' as the decimal mark, for example, 15,000.00 USD.
   * Must be less than the 'price' field.
   * </pre>
   *
   * <code>string sale_price = 9;</code>
   * @return The bytes for salePrice.
   */
  com.google.protobuf.ByteString
      getSalePriceBytes();

  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $20,000.00.
   * </pre>
   *
   * <code>string formatted_price = 10;</code>
   * @return The formattedPrice.
   */
  java.lang.String getFormattedPrice();
  /**
   * <pre>
   * Formatted price which can be any characters. If set, this attribute will be
   * used instead of 'price', for example, Starting at $20,000.00.
   * </pre>
   *
   * <code>string formatted_price = 10;</code>
   * @return The bytes for formattedPrice.
   */
  com.google.protobuf.ByteString
      getFormattedPriceBytes();

  /**
   * <pre>
   * Formatted sale price which can be any characters. If set, this attribute
   * will be used instead of 'sale price', for example, On sale for $15,000.00.
   * </pre>
   *
   * <code>string formatted_sale_price = 11;</code>
   * @return The formattedSalePrice.
   */
  java.lang.String getFormattedSalePrice();
  /**
   * <pre>
   * Formatted sale price which can be any characters. If set, this attribute
   * will be used instead of 'sale price', for example, On sale for $15,000.00.
   * </pre>
   *
   * <code>string formatted_sale_price = 11;</code>
   * @return The bytes for formattedSalePrice.
   */
  com.google.protobuf.ByteString
      getFormattedSalePriceBytes();

  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 12;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * Image URL, for example, http://www.example.com/image.png. The image will
   * not be uploaded as image asset.
   * </pre>
   *
   * <code>string image_url = 12;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Contextual keywords, for example, Sedans, 4 door sedans.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 13;</code>
   * @return A list containing the contextualKeywords.
   */
  java.util.List<java.lang.String>
      getContextualKeywordsList();
  /**
   * <pre>
   * Contextual keywords, for example, Sedans, 4 door sedans.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 13;</code>
   * @return The count of contextualKeywords.
   */
  int getContextualKeywordsCount();
  /**
   * <pre>
   * Contextual keywords, for example, Sedans, 4 door sedans.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 13;</code>
   * @param index The index of the element to return.
   * @return The contextualKeywords at the given index.
   */
  java.lang.String getContextualKeywords(int index);
  /**
   * <pre>
   * Contextual keywords, for example, Sedans, 4 door sedans.
   * </pre>
   *
   * <code>repeated string contextual_keywords = 13;</code>
   * @param index The index of the value to return.
   * @return The bytes of the contextualKeywords at the given index.
   */
  com.google.protobuf.ByteString
      getContextualKeywordsBytes(int index);

  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 14;</code>
   * @return The androidAppLink.
   */
  java.lang.String getAndroidAppLink();
  /**
   * <pre>
   * Android deep link, for example,
   * android-app://com.example.android/http/example.com/gizmos?1234.
   * </pre>
   *
   * <code>string android_app_link = 14;</code>
   * @return The bytes for androidAppLink.
   */
  com.google.protobuf.ByteString
      getAndroidAppLinkBytes();

  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 16;</code>
   * @return The iosAppLink.
   */
  java.lang.String getIosAppLink();
  /**
   * <pre>
   * iOS deep link, for example, exampleApp://content/page.
   * </pre>
   *
   * <code>string ios_app_link = 16;</code>
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
   * <code>int64 ios_app_store_id = 17;</code>
   * @return The iosAppStoreId.
   */
  long getIosAppStoreId();

  /**
   * <pre>
   * Similar IDs.
   * </pre>
   *
   * <code>repeated string similar_ids = 15;</code>
   * @return A list containing the similarIds.
   */
  java.util.List<java.lang.String>
      getSimilarIdsList();
  /**
   * <pre>
   * Similar IDs.
   * </pre>
   *
   * <code>repeated string similar_ids = 15;</code>
   * @return The count of similarIds.
   */
  int getSimilarIdsCount();
  /**
   * <pre>
   * Similar IDs.
   * </pre>
   *
   * <code>repeated string similar_ids = 15;</code>
   * @param index The index of the element to return.
   * @return The similarIds at the given index.
   */
  java.lang.String getSimilarIds(int index);
  /**
   * <pre>
   * Similar IDs.
   * </pre>
   *
   * <code>repeated string similar_ids = 15;</code>
   * @param index The index of the value to return.
   * @return The bytes of the similarIds at the given index.
   */
  com.google.protobuf.ByteString
      getSimilarIdsBytes(int index);
}
