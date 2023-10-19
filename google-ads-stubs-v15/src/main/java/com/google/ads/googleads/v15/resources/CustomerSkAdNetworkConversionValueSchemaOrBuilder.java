// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/customer_sk_ad_network_conversion_value_schema.proto

package com.google.ads.googleads.v15.resources;

public interface CustomerSkAdNetworkConversionValueSchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.CustomerSkAdNetworkConversionValueSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the schema.
   * CustomerSkAdNetworkConversionValueSchema resource names have the form:
   * customers/{customer_id}/customerSkAdNetworkConversionValueSchemas/{account_link_id}
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the schema.
   * CustomerSkAdNetworkConversionValueSchema resource names have the form:
   * customers/{customer_id}/customerSkAdNetworkConversionValueSchemas/{account_link_id}
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The schema for the specified resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerSkAdNetworkConversionValueSchema.SkAdNetworkConversionValueSchema schema = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   * <pre>
   * Output only. The schema for the specified resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerSkAdNetworkConversionValueSchema.SkAdNetworkConversionValueSchema schema = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The schema.
   */
  com.google.ads.googleads.v15.resources.CustomerSkAdNetworkConversionValueSchema.SkAdNetworkConversionValueSchema getSchema();
  /**
   * <pre>
   * Output only. The schema for the specified resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerSkAdNetworkConversionValueSchema.SkAdNetworkConversionValueSchema schema = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v15.resources.CustomerSkAdNetworkConversionValueSchema.SkAdNetworkConversionValueSchemaOrBuilder getSchemaOrBuilder();
}
