// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/shared_set_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public final class SharedSetServiceProto {
  private SharedSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateSharedSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateSharedSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_SharedSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_SharedSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateSharedSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateSharedSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateSharedSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateSharedSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v18/services/shar" +
      "ed_set_service.proto\022!google.ads.googlea" +
      "ds.v18.services\032:google/ads/googleads/v1" +
      "8/enums/response_content_type.proto\0323goo" +
      "gle/ads/googleads/v18/resources/shared_s" +
      "et.proto\032\034google/api/annotations.proto\032\027" +
      "google/api/client.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032 google/protobuf/field_mask.proto\032\027g" +
      "oogle/rpc/status.proto\"\237\002\n\027MutateSharedS" +
      "etsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022N\n\n" +
      "operations\030\002 \003(\01325.google.ads.googleads." +
      "v18.services.SharedSetOperationB\003\340A\002\022\027\n\017" +
      "partial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004" +
      " \001(\010\022j\n\025response_content_type\030\005 \001(\0162K.go" +
      "ogle.ads.googleads.v18.enums.ResponseCon" +
      "tentTypeEnum.ResponseContentType\"\217\002\n\022Sha" +
      "redSetOperation\022/\n\013update_mask\030\004 \001(\0132\032.g" +
      "oogle.protobuf.FieldMask\022?\n\006create\030\001 \001(\013" +
      "2-.google.ads.googleads.v18.resources.Sh" +
      "aredSetH\000\022?\n\006update\030\002 \001(\0132-.google.ads.g" +
      "oogleads.v18.resources.SharedSetH\000\0229\n\006re" +
      "move\030\003 \001(\tB\'\372A$\n\"googleads.googleapis.co" +
      "m/SharedSetH\000B\013\n\toperation\"\230\001\n\030MutateSha" +
      "redSetsResponse\0221\n\025partial_failure_error" +
      "\030\003 \001(\0132\022.google.rpc.Status\022I\n\007results\030\002 " +
      "\003(\01328.google.ads.googleads.v18.services." +
      "MutateSharedSetResult\"\232\001\n\025MutateSharedSe" +
      "tResult\022>\n\rresource_name\030\001 \001(\tB\'\372A$\n\"goo" +
      "gleads.googleapis.com/SharedSet\022A\n\nshare" +
      "d_set\030\002 \001(\0132-.google.ads.googleads.v18.r" +
      "esources.SharedSet2\275\002\n\020SharedSetService\022" +
      "\341\001\n\020MutateSharedSets\022:.google.ads.google" +
      "ads.v18.services.MutateSharedSetsRequest" +
      "\032;.google.ads.googleads.v18.services.Mut" +
      "ateSharedSetsResponse\"T\332A\026customer_id,op" +
      "erations\202\323\344\223\0025\"0/v18/customers/{customer" +
      "_id=*}/sharedSets:mutate:\001*\032E\312A\030googlead" +
      "s.googleapis.com\322A\'https://www.googleapi" +
      "s.com/auth/adwordsB\201\002\n%com.google.ads.go" +
      "ogleads.v18.servicesB\025SharedSetServicePr" +
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
          com.google.ads.googleads.v18.resources.SharedSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_MutateSharedSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_MutateSharedSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateSharedSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v18_services_SharedSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_SharedSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_SharedSetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v18_services_MutateSharedSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_MutateSharedSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateSharedSetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v18_services_MutateSharedSetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_MutateSharedSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateSharedSetResult_descriptor,
        new java.lang.String[] { "ResourceName", "SharedSet", });
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
    com.google.ads.googleads.v18.resources.SharedSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
