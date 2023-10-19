// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/criterion_category_availability.proto

package com.google.ads.googleads.v15.common;

public interface CriterionCategoryLocaleAvailabilityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.CriterionCategoryLocaleAvailability)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
   * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
   * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
   * be set).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
   * @return The enum numeric value on the wire for availabilityMode.
   */
  int getAvailabilityModeValue();
  /**
   * <pre>
   * Format of the locale availability. Can be LAUNCHED_TO_ALL (both country and
   * language will be empty), COUNTRY (only country will be set), LANGUAGE (only
   * language wil be set), COUNTRY_AND_LANGUAGE (both country and language will
   * be set).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode availability_mode = 1;</code>
   * @return The availabilityMode.
   */
  com.google.ads.googleads.v15.enums.CriterionCategoryLocaleAvailabilityModeEnum.CriterionCategoryLocaleAvailabilityMode getAvailabilityMode();

  /**
   * <pre>
   * The ISO-3166-1 alpha-2 country code associated with the category.
   * </pre>
   *
   * <code>optional string country_code = 4;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * The ISO-3166-1 alpha-2 country code associated with the category.
   * </pre>
   *
   * <code>optional string country_code = 4;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * The ISO-3166-1 alpha-2 country code associated with the category.
   * </pre>
   *
   * <code>optional string country_code = 4;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * ISO 639-1 code of the language associated with the category.
   * </pre>
   *
   * <code>optional string language_code = 5;</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * ISO 639-1 code of the language associated with the category.
   * </pre>
   *
   * <code>optional string language_code = 5;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * ISO 639-1 code of the language associated with the category.
   * </pre>
   *
   * <code>optional string language_code = 5;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();
}
