// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/ad_parameter.proto

package com.google.ads.googleads.v15.resources;

public final class AdParameterProto {
  private AdParameterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AdParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AdParameter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v15/resources/ad_" +
      "parameter.proto\022\"google.ads.googleads.v1" +
      "5.resources\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\"\247\003\n\013AdPa" +
      "rameter\022D\n\rresource_name\030\001 \001(\tB-\342A\001\005\372A&\n" +
      "$googleads.googleapis.com/AdParameter\022S\n" +
      "\022ad_group_criterion\030\005 \001(\tB2\342A\001\005\372A+\n)goog" +
      "leads.googleapis.com/AdGroupCriterionH\000\210" +
      "\001\001\022\"\n\017parameter_index\030\006 \001(\003B\004\342A\001\005H\001\210\001\001\022\033" +
      "\n\016insertion_text\030\007 \001(\tH\002\210\001\001:~\352A{\n$google" +
      "ads.googleapis.com/AdParameter\022Scustomer" +
      "s/{customer_id}/adParameters/{ad_group_i" +
      "d}~{criterion_id}~{parameter_index}B\025\n\023_" +
      "ad_group_criterionB\022\n\020_parameter_indexB\021" +
      "\n\017_insertion_textB\202\002\n&com.google.ads.goo" +
      "gleads.v15.resourcesB\020AdParameterProtoP\001" +
      "ZKgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v15/resources;resources\242\002\003" +
      "GAA\252\002\"Google.Ads.GoogleAds.V15.Resources" +
      "\312\002\"Google\\Ads\\GoogleAds\\V15\\Resources\352\002&" +
      "Google::Ads::GoogleAds::V15::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_AdParameter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_AdParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AdParameter_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "ParameterIndex", "InsertionText", "AdGroupCriterion", "ParameterIndex", "InsertionText", });
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
