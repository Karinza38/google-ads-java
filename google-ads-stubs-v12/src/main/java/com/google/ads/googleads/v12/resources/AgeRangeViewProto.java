// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/age_range_view.proto

package com.google.ads.googleads.v12.resources;

public final class AgeRangeViewProto {
  private AgeRangeViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_AgeRangeView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_AgeRangeView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v12/resources/age" +
      "_range_view.proto\022\"google.ads.googleads." +
      "v12.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\304\001\n\014Ag" +
      "eRangeView\022D\n\rresource_name\030\001 \001(\tB-\340A\003\372A" +
      "\'\n%googleads.googleapis.com/AgeRangeView" +
      ":n\352Ak\n%googleads.googleapis.com/AgeRange" +
      "View\022Bcustomers/{customer_id}/ageRangeVi" +
      "ews/{ad_group_id}~{criterion_id}B\203\002\n&com" +
      ".google.ads.googleads.v12.resourcesB\021Age" +
      "RangeViewProtoP\001ZKgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v12/resour" +
      "ces;resources\242\002\003GAA\252\002\"Google.Ads.GoogleA" +
      "ds.V12.Resources\312\002\"Google\\Ads\\GoogleAds\\" +
      "V12\\Resources\352\002&Google::Ads::GoogleAds::" +
      "V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_AgeRangeView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_AgeRangeView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_AgeRangeView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
