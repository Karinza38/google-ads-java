// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/ad_group_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

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
    internal_static_google_ads_googleads_v18_services_MutateAdGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateAdGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_AdGroupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_AdGroupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateAdGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateAdGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateAdGroupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateAdGroupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v18/services/ad_g" +
      "roup_service.proto\022!google.ads.googleads" +
      ".v18.services\032:google/ads/googleads/v18/" +
      "enums/response_content_type.proto\0321googl" +
      "e/ads/googleads/v18/resources/ad_group.p" +
      "roto\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      " google/protobuf/field_mask.proto\032\027googl" +
      "e/rpc/status.proto\"\233\002\n\025MutateAdGroupsReq" +
      "uest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022L\n\noperat" +
      "ions\030\002 \003(\01323.google.ads.googleads.v18.se" +
      "rvices.AdGroupOperationB\003\340A\002\022\027\n\017partial_" +
      "failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025" +
      "response_content_type\030\005 \001(\0162K.google.ads" +
      ".googleads.v18.enums.ResponseContentType" +
      "Enum.ResponseContentType\"\207\002\n\020AdGroupOper" +
      "ation\022/\n\013update_mask\030\004 \001(\0132\032.google.prot" +
      "obuf.FieldMask\022=\n\006create\030\001 \001(\0132+.google." +
      "ads.googleads.v18.resources.AdGroupH\000\022=\n" +
      "\006update\030\002 \001(\0132+.google.ads.googleads.v18" +
      ".resources.AdGroupH\000\0227\n\006remove\030\003 \001(\tB%\372A" +
      "\"\n googleads.googleapis.com/AdGroupH\000B\013\n" +
      "\toperation\"\224\001\n\026MutateAdGroupsResponse\0221\n" +
      "\025partial_failure_error\030\003 \001(\0132\022.google.rp" +
      "c.Status\022G\n\007results\030\002 \003(\01326.google.ads.g" +
      "oogleads.v18.services.MutateAdGroupResul" +
      "t\"\222\001\n\023MutateAdGroupResult\022<\n\rresource_na" +
      "me\030\001 \001(\tB%\372A\"\n googleads.googleapis.com/" +
      "AdGroup\022=\n\010ad_group\030\002 \001(\0132+.google.ads.g" +
      "oogleads.v18.resources.AdGroup2\263\002\n\016AdGro" +
      "upService\022\331\001\n\016MutateAdGroups\0228.google.ad" +
      "s.googleads.v18.services.MutateAdGroupsR" +
      "equest\0329.google.ads.googleads.v18.servic" +
      "es.MutateAdGroupsResponse\"R\332A\026customer_i" +
      "d,operations\202\323\344\223\0023\"./v18/customers/{cust" +
      "omer_id=*}/adGroups:mutate:\001*\032E\312A\030google" +
      "ads.googleapis.com\322A\'https://www.googlea" +
      "pis.com/auth/adwordsB\377\001\n%com.google.ads." +
      "googleads.v18.servicesB\023AdGroupServicePr" +
      "otoP\001ZIgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v18/services;services" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V18.Servic" +
      "es\312\002!Google\\Ads\\GoogleAds\\V18\\Services\352\002" +
      "%Google::Ads::GoogleAds::V18::Servicesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.resources.AdGroupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_MutateAdGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_MutateAdGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateAdGroupsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v18_services_AdGroupOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_AdGroupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_AdGroupOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v18_services_MutateAdGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_MutateAdGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateAdGroupsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v18_services_MutateAdGroupResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_MutateAdGroupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateAdGroupResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v18.resources.AdGroupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
