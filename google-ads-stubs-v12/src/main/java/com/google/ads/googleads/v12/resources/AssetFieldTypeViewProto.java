// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/asset_field_type_view.proto

package com.google.ads.googleads.v12.resources;

public final class AssetFieldTypeViewProto {
  private AssetFieldTypeViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_AssetFieldTypeView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_AssetFieldTypeView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v12/resources/ass" +
      "et_field_type_view.proto\022\"google.ads.goo" +
      "gleads.v12.resources\0325google/ads/googlea" +
      "ds/v12/enums/asset_field_type.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\"\250\002\n\022AssetFieldTypeView\022J" +
      "\n\rresource_name\030\001 \001(\tB3\340A\003\372A-\n+googleads" +
      ".googleapis.com/AssetFieldTypeView\022Z\n\nfi" +
      "eld_type\030\003 \001(\0162A.google.ads.googleads.v1" +
      "2.enums.AssetFieldTypeEnum.AssetFieldTyp" +
      "eB\003\340A\003:j\352Ag\n+googleads.googleapis.com/As" +
      "setFieldTypeView\0228customers/{customer_id" +
      "}/assetFieldTypeViews/{field_type}B\211\002\n&c" +
      "om.google.ads.googleads.v12.resourcesB\027A" +
      "ssetFieldTypeViewProtoP\001ZKgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "2/resources;resources\242\002\003GAA\252\002\"Google.Ads" +
      ".GoogleAds.V12.Resources\312\002\"Google\\Ads\\Go" +
      "ogleAds\\V12\\Resources\352\002&Google::Ads::Goo" +
      "gleAds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_AssetFieldTypeView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_AssetFieldTypeView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_AssetFieldTypeView_descriptor,
        new java.lang.String[] { "ResourceName", "FieldType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.enums.AssetFieldTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
