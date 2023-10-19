// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/geographic_view.proto

package com.google.ads.googleads.v15.resources;

public interface GeographicViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.GeographicView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the geographic view.
   * Geographic view resource names have the form:
   *
   * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the geographic view.
   * Geographic view resource names have the form:
   *
   * `customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Type of the geo targeting of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for locationType.
   */
  int getLocationTypeValue();
  /**
   * <pre>
   * Output only. Type of the geo targeting of the campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GeoTargetingTypeEnum.GeoTargetingType location_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The locationType.
   */
  com.google.ads.googleads.v15.enums.GeoTargetingTypeEnum.GeoTargetingType getLocationType();

  /**
   * <pre>
   * Output only. Criterion Id for the country.
   * </pre>
   *
   * <code>optional int64 country_criterion_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCriterionId field is set.
   */
  boolean hasCountryCriterionId();
  /**
   * <pre>
   * Output only. Criterion Id for the country.
   * </pre>
   *
   * <code>optional int64 country_criterion_id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCriterionId.
   */
  long getCountryCriterionId();
}
