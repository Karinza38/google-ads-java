// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/customizer_value.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public final class CustomizerValueProto {
  private CustomizerValueProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_common_CustomizerValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_common_CustomizerValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v18/common/custom" +
      "izer_value.proto\022\037google.ads.googleads.v" +
      "18.common\032>google/ads/googleads/v18/enum" +
      "s/customizer_attribute_type.proto\032\037googl" +
      "e/api/field_behavior.proto\"\224\001\n\017Customize" +
      "rValue\022f\n\004type\030\001 \001(\0162S.google.ads.google" +
      "ads.v18.enums.CustomizerAttributeTypeEnu" +
      "m.CustomizerAttributeTypeB\003\340A\002\022\031\n\014string" +
      "_value\030\002 \001(\tB\003\340A\002B\364\001\n#com.google.ads.goo" +
      "gleads.v18.commonB\024CustomizerValueProtoP" +
      "\001ZEgoogle.golang.org/genproto/googleapis" +
      "/ads/googleads/v18/common;common\242\002\003GAA\252\002" +
      "\037Google.Ads.GoogleAds.V18.Common\312\002\037Googl" +
      "e\\Ads\\GoogleAds\\V18\\Common\352\002#Google::Ads" +
      "::GoogleAds::V18::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.CustomizerAttributeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_common_CustomizerValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_common_CustomizerValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_common_CustomizerValue_descriptor,
        new java.lang.String[] { "Type", "StringValue", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.CustomizerAttributeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
