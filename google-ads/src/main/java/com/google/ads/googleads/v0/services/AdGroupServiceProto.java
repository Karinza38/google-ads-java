// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/ad_group_service.proto

package com.google.ads.googleads.v0.services;

public final class AdGroupServiceProto {
  private AdGroupServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetAdGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetAdGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_AdGroupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_AdGroupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v0/services/ad_gr" +
      "oup_service.proto\022 google.ads.googleads." +
      "v0.services\0320google/ads/googleads/v0/res" +
      "ources/ad_group.proto\032\034google/api/annota" +
      "tions.proto\032 google/protobuf/field_mask." +
      "proto\"*\n\021GetAdGroupRequest\022\025\n\rresource_n" +
      "ame\030\001 \001(\t\"t\n\025MutateAdGroupsRequest\022\023\n\013cu" +
      "stomer_id\030\001 \001(\t\022F\n\noperations\030\002 \003(\01322.go" +
      "ogle.ads.googleads.v0.services.AdGroupOp" +
      "eration\"\336\001\n\020AdGroupOperation\022/\n\013update_m" +
      "ask\030\004 \001(\0132\032.google.protobuf.FieldMask\022<\n" +
      "\006create\030\001 \001(\0132*.google.ads.googleads.v0." +
      "resources.AdGroupH\000\022<\n\006update\030\002 \001(\0132*.go" +
      "ogle.ads.googleads.v0.resources.AdGroupH" +
      "\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"`\n\026Muta" +
      "teAdGroupsResponse\022F\n\007results\030\002 \003(\01325.go" +
      "ogle.ads.googleads.v0.services.MutateAdG" +
      "roupResult\",\n\023MutateAdGroupResult\022\025\n\rres" +
      "ource_name\030\001 \001(\t2\364\002\n\016AdGroupService\022\241\001\n\n" +
      "GetAdGroup\0223.google.ads.googleads.v0.ser" +
      "vices.GetAdGroupRequest\032*.google.ads.goo" +
      "gleads.v0.resources.AdGroup\"2\202\323\344\223\002,\022*/v0" +
      "/{resource_name=customers/*/adGroups/*}\022" +
      "\275\001\n\016MutateAdGroups\0227.google.ads.googlead" +
      "s.v0.services.MutateAdGroupsRequest\0328.go" +
      "ogle.ads.googleads.v0.services.MutateAdG" +
      "roupsResponse\"8\202\323\344\223\0022\"-/v0/customers/{cu" +
      "stomer_id=*}/adGroups:mutate:\001*B\323\001\n$com." +
      "google.ads.googleads.v0.servicesB\023AdGrou" +
      "pServiceProtoP\001ZHgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v0/services" +
      ";services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V" +
      "0.Services\312\002 Google\\Ads\\GoogleAds\\V0\\Ser" +
      "vicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.resources.AdGroupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetAdGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetAdGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetAdGroupRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v0_services_AdGroupOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_AdGroupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_AdGroupOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.AdGroupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}