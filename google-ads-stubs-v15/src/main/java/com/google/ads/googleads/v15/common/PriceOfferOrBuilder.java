// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/extensions.proto

package com.google.ads.googleads.v15.common;

public interface PriceOfferOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.PriceOffer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Header text of this offer.
   * </pre>
   *
   * <code>optional string header = 7;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Header text of this offer.
   * </pre>
   *
   * <code>optional string header = 7;</code>
   * @return The header.
   */
  java.lang.String getHeader();
  /**
   * <pre>
   * Header text of this offer.
   * </pre>
   *
   * <code>optional string header = 7;</code>
   * @return The bytes for header.
   */
  com.google.protobuf.ByteString
      getHeaderBytes();

  /**
   * <pre>
   * Description text of this offer.
   * </pre>
   *
   * <code>optional string description = 8;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Description text of this offer.
   * </pre>
   *
   * <code>optional string description = 8;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description text of this offer.
   * </pre>
   *
   * <code>optional string description = 8;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Price value of this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.Money price = 3;</code>
   * @return Whether the price field is set.
   */
  boolean hasPrice();
  /**
   * <pre>
   * Price value of this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.Money price = 3;</code>
   * @return The price.
   */
  com.google.ads.googleads.v15.common.Money getPrice();
  /**
   * <pre>
   * Price value of this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.Money price = 3;</code>
   */
  com.google.ads.googleads.v15.common.MoneyOrBuilder getPriceOrBuilder();

  /**
   * <pre>
   * Price unit for this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit unit = 4;</code>
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   * <pre>
   * Price unit for this offer.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit unit = 4;</code>
   * @return The unit.
   */
  com.google.ads.googleads.v15.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit getUnit();

  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 9;</code>
   * @return A list containing the finalUrls.
   */
  java.util.List<java.lang.String>
      getFinalUrlsList();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 9;</code>
   * @return The count of finalUrls.
   */
  int getFinalUrlsCount();
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 9;</code>
   * @param index The index of the element to return.
   * @return The finalUrls at the given index.
   */
  java.lang.String getFinalUrls(int index);
  /**
   * <pre>
   * A list of possible final URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_urls = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalUrlsBytes(int index);

  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 10;</code>
   * @return A list containing the finalMobileUrls.
   */
  java.util.List<java.lang.String>
      getFinalMobileUrlsList();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 10;</code>
   * @return The count of finalMobileUrls.
   */
  int getFinalMobileUrlsCount();
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 10;</code>
   * @param index The index of the element to return.
   * @return The finalMobileUrls at the given index.
   */
  java.lang.String getFinalMobileUrls(int index);
  /**
   * <pre>
   * A list of possible final mobile URLs after all cross domain redirects.
   * </pre>
   *
   * <code>repeated string final_mobile_urls = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the finalMobileUrls at the given index.
   */
  com.google.protobuf.ByteString
      getFinalMobileUrlsBytes(int index);
}
