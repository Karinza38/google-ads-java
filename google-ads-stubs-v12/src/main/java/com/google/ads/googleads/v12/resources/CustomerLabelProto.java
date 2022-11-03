// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/customer_label.proto

package com.google.ads.googleads.v12.resources;

public final class CustomerLabelProto {
  private CustomerLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_CustomerLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_CustomerLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v12/resources/cus" +
      "tomer_label.proto\022\"google.ads.googleads." +
      "v12.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\313\002\n\rCu" +
      "stomerLabel\022E\n\rresource_name\030\001 \001(\tB.\340A\005\372" +
      "A(\n&googleads.googleapis.com/CustomerLab" +
      "el\022@\n\010customer\030\004 \001(\tB)\340A\003\372A#\n!googleads." +
      "googleapis.com/CustomerH\000\210\001\001\022:\n\005label\030\005 " +
      "\001(\tB&\340A\003\372A \n\036googleads.googleapis.com/La" +
      "belH\001\210\001\001:^\352A[\n&googleads.googleapis.com/" +
      "CustomerLabel\0221customers/{customer_id}/c" +
      "ustomerLabels/{label_id}B\013\n\t_customerB\010\n" +
      "\006_labelB\204\002\n&com.google.ads.googleads.v12" +
      ".resourcesB\022CustomerLabelProtoP\001ZKgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v12/resources;resources\242\002\003GAA\252\002\"Go" +
      "ogle.Ads.GoogleAds.V12.Resources\312\002\"Googl" +
      "e\\Ads\\GoogleAds\\V12\\Resources\352\002&Google::" +
      "Ads::GoogleAds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_CustomerLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_CustomerLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_CustomerLabel_descriptor,
        new java.lang.String[] { "ResourceName", "Customer", "Label", "Customer", "Label", });
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
