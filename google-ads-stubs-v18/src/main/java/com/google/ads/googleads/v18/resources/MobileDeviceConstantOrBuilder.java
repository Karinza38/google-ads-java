// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/mobile_device_constant.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public interface MobileDeviceConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.resources.MobileDeviceConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the mobile device constant.
   * Mobile device constant resource names have the form:
   *
   * `mobileDeviceConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the mobile device constant.
   * Mobile device constant resource names have the form:
   *
   * `mobileDeviceConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the mobile device constant.
   * </pre>
   *
   * <code>optional int64 id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the mobile device constant.
   * </pre>
   *
   * <code>optional int64 id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The name of the mobile device.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The name of the mobile device.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the mobile device.
   * </pre>
   *
   * <code>optional string name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The manufacturer of the mobile device.
   * </pre>
   *
   * <code>optional string manufacturer_name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the manufacturerName field is set.
   */
  boolean hasManufacturerName();
  /**
   * <pre>
   * Output only. The manufacturer of the mobile device.
   * </pre>
   *
   * <code>optional string manufacturer_name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The manufacturerName.
   */
  java.lang.String getManufacturerName();
  /**
   * <pre>
   * Output only. The manufacturer of the mobile device.
   * </pre>
   *
   * <code>optional string manufacturer_name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for manufacturerName.
   */
  com.google.protobuf.ByteString
      getManufacturerNameBytes();

  /**
   * <pre>
   * Output only. The operating system of the mobile device.
   * </pre>
   *
   * <code>optional string operating_system_name = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the operatingSystemName field is set.
   */
  boolean hasOperatingSystemName();
  /**
   * <pre>
   * Output only. The operating system of the mobile device.
   * </pre>
   *
   * <code>optional string operating_system_name = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operatingSystemName.
   */
  java.lang.String getOperatingSystemName();
  /**
   * <pre>
   * Output only. The operating system of the mobile device.
   * </pre>
   *
   * <code>optional string operating_system_name = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for operatingSystemName.
   */
  com.google.protobuf.ByteString
      getOperatingSystemNameBytes();

  /**
   * <pre>
   * Output only. The type of mobile device.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.MobileDeviceTypeEnum.MobileDeviceType type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of mobile device.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.MobileDeviceTypeEnum.MobileDeviceType type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v18.enums.MobileDeviceTypeEnum.MobileDeviceType getType();
}
