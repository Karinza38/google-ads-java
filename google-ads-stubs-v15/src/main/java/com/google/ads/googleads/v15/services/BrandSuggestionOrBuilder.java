// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/brand_suggestion_service.proto

package com.google.ads.googleads.v15.services;

public interface BrandSuggestionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.BrandSuggestion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id for the brand. It would be CKG MID for verified/global scoped brands.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Id for the brand. It would be CKG MID for verified/global scoped brands.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Name of the brand.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the brand.
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Urls which uniquely identify the brand.
   * </pre>
   *
   * <code>repeated string urls = 3;</code>
   * @return A list containing the urls.
   */
  java.util.List<java.lang.String>
      getUrlsList();
  /**
   * <pre>
   * Urls which uniquely identify the brand.
   * </pre>
   *
   * <code>repeated string urls = 3;</code>
   * @return The count of urls.
   */
  int getUrlsCount();
  /**
   * <pre>
   * Urls which uniquely identify the brand.
   * </pre>
   *
   * <code>repeated string urls = 3;</code>
   * @param index The index of the element to return.
   * @return The urls at the given index.
   */
  java.lang.String getUrls(int index);
  /**
   * <pre>
   * Urls which uniquely identify the brand.
   * </pre>
   *
   * <code>repeated string urls = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the urls at the given index.
   */
  com.google.protobuf.ByteString
      getUrlsBytes(int index);

  /**
   * <pre>
   * Current state of the brand.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BrandStateEnum.BrandState state = 4;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Current state of the brand.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BrandStateEnum.BrandState state = 4;</code>
   * @return The state.
   */
  com.google.ads.googleads.v15.enums.BrandStateEnum.BrandState getState();
}
