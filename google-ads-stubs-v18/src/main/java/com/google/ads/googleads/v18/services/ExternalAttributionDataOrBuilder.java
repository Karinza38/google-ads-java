// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/conversion_upload_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface ExternalAttributionDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.ExternalAttributionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>optional double external_attribution_credit = 3;</code>
   * @return Whether the externalAttributionCredit field is set.
   */
  boolean hasExternalAttributionCredit();
  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>optional double external_attribution_credit = 3;</code>
   * @return The externalAttributionCredit.
   */
  double getExternalAttributionCredit();

  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>optional string external_attribution_model = 4;</code>
   * @return Whether the externalAttributionModel field is set.
   */
  boolean hasExternalAttributionModel();
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>optional string external_attribution_model = 4;</code>
   * @return The externalAttributionModel.
   */
  java.lang.String getExternalAttributionModel();
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>optional string external_attribution_model = 4;</code>
   * @return The bytes for externalAttributionModel.
   */
  com.google.protobuf.ByteString
      getExternalAttributionModelBytes();
}
