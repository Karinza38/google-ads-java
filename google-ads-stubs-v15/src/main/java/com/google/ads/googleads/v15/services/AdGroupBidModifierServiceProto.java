// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/ad_group_bid_modifier_service.proto

package com.google.ads.googleads.v15.services;

public final class AdGroupBidModifierServiceProto {
  private AdGroupBidModifierServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_AdGroupBidModifierOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_AdGroupBidModifierOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifierResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifierResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v15/services/ad_g" +
      "roup_bid_modifier_service.proto\022!google." +
      "ads.googleads.v15.services\032:google/ads/g" +
      "oogleads/v15/enums/response_content_type" +
      ".proto\032>google/ads/googleads/v15/resourc" +
      "es/ad_group_bid_modifier.proto\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032 google/protob" +
      "uf/field_mask.proto\032\027google/rpc/status.p" +
      "roto\"\263\002\n MutateAdGroupBidModifiersReques" +
      "t\022\031\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022X\n\noperatio" +
      "ns\030\002 \003(\0132>.google.ads.googleads.v15.serv" +
      "ices.AdGroupBidModifierOperationB\004\342A\001\002\022\027" +
      "\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_only" +
      "\030\004 \001(\010\022j\n\025response_content_type\030\005 \001(\0162K." +
      "google.ads.googleads.v15.enums.ResponseC" +
      "ontentTypeEnum.ResponseContentType\"\263\002\n\033A" +
      "dGroupBidModifierOperation\022/\n\013update_mas" +
      "k\030\004 \001(\0132\032.google.protobuf.FieldMask\022H\n\006c" +
      "reate\030\001 \001(\01326.google.ads.googleads.v15.r" +
      "esources.AdGroupBidModifierH\000\022H\n\006update\030" +
      "\002 \001(\01326.google.ads.googleads.v15.resourc" +
      "es.AdGroupBidModifierH\000\022B\n\006remove\030\003 \001(\tB" +
      "0\372A-\n+googleads.googleapis.com/AdGroupBi" +
      "dModifierH\000B\013\n\toperation\"\252\001\n!MutateAdGro" +
      "upBidModifiersResponse\0221\n\025partial_failur" +
      "e_error\030\003 \001(\0132\022.google.rpc.Status\022R\n\007res" +
      "ults\030\002 \003(\0132A.google.ads.googleads.v15.se" +
      "rvices.MutateAdGroupBidModifierResult\"\300\001" +
      "\n\036MutateAdGroupBidModifierResult\022G\n\rreso" +
      "urce_name\030\001 \001(\tB0\372A-\n+googleads.googleap" +
      "is.com/AdGroupBidModifier\022U\n\025ad_group_bi" +
      "d_modifier\030\002 \001(\01326.google.ads.googleads." +
      "v15.resources.AdGroupBidModifier2\352\002\n\031AdG" +
      "roupBidModifierService\022\205\002\n\031MutateAdGroup" +
      "BidModifiers\022C.google.ads.googleads.v15." +
      "services.MutateAdGroupBidModifiersReques" +
      "t\032D.google.ads.googleads.v15.services.Mu" +
      "tateAdGroupBidModifiersResponse\"]\332A\026cust" +
      "omer_id,operations\202\323\344\223\002>\"9/v15/customers" +
      "/{customer_id=*}/adGroupBidModifiers:mut" +
      "ate:\001*\032E\312A\030googleads.googleapis.com\322A\'ht" +
      "tps://www.googleapis.com/auth/adwordsB\212\002" +
      "\n%com.google.ads.googleads.v15.servicesB" +
      "\036AdGroupBidModifierServiceProtoP\001ZIgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v15/services;services\242\002\003GAA\252\002!Goo" +
      "gle.Ads.GoogleAds.V15.Services\312\002!Google\\" +
      "Ads\\GoogleAds\\V15\\Services\352\002%Google::Ads" +
      "::GoogleAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.AdGroupBidModifierProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v15_services_AdGroupBidModifierOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_AdGroupBidModifierOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_AdGroupBidModifierOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifiersResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifierResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifierResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateAdGroupBidModifierResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupBidModifier", });
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
    com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v15.resources.AdGroupBidModifierProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
