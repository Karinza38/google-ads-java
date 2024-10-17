// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/shareable_preview_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public final class ShareablePreviewServiceProto {
  private ShareablePreviewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_ShareablePreview_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_ShareablePreview_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_AssetGroupIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_AssetGroupIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_ShareablePreviewOrError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_ShareablePreviewOrError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_ShareablePreviewResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_ShareablePreviewResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v18/services/shar" +
      "eable_preview_service.proto\022!google.ads." +
      "googleads.v18.services\032\034google/api/annot" +
      "ations.proto\032\027google/api/client.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\027google/r" +
      "pc/status.proto\"\222\001\n GenerateShareablePre" +
      "viewsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022T" +
      "\n\022shareable_previews\030\002 \003(\01323.google.ads." +
      "googleads.v18.services.ShareablePreviewB" +
      "\003\340A\002\"p\n\020ShareablePreview\022\\\n\026asset_group_" +
      "identifier\030\001 \001(\01327.google.ads.googleads." +
      "v18.services.AssetGroupIdentifierB\003\340A\002\"3" +
      "\n\024AssetGroupIdentifier\022\033\n\016asset_group_id" +
      "\030\001 \001(\003B\003\340A\002\"r\n!GenerateShareablePreviews" +
      "Response\022M\n\tresponses\030\001 \003(\0132:.google.ads" +
      ".googleads.v18.services.ShareablePreview" +
      "OrError\"\255\002\n\027ShareablePreviewOrError\022W\n\026a" +
      "sset_group_identifier\030\003 \001(\01327.google.ads" +
      ".googleads.v18.services.AssetGroupIdenti" +
      "fier\022]\n\030shareable_preview_result\030\001 \001(\01329" +
      ".google.ads.googleads.v18.services.Share" +
      "ablePreviewResultH\000\0223\n\025partial_failure_e" +
      "rror\030\002 \001(\0132\022.google.rpc.StatusH\000B%\n#gene" +
      "rate_shareable_preview_response\"U\n\026Share" +
      "ablePreviewResult\022\035\n\025shareable_preview_u" +
      "rl\030\001 \001(\t\022\034\n\024expiration_date_time\030\002 \001(\t2\357" +
      "\002\n\027ShareablePreviewService\022\214\002\n\031GenerateS" +
      "hareablePreviews\022C.google.ads.googleads." +
      "v18.services.GenerateShareablePreviewsRe" +
      "quest\032D.google.ads.googleads.v18.service" +
      "s.GenerateShareablePreviewsResponse\"d\332A\036" +
      "customer_id,shareable_previews\202\323\344\223\002=\"8/v" +
      "18/customers/{customer_id=*}:generateSha" +
      "reablePreviews:\001*\032E\312A\030googleads.googleap" +
      "is.com\322A\'https://www.googleapis.com/auth" +
      "/adwordsB\210\002\n%com.google.ads.googleads.v1" +
      "8.servicesB\034ShareablePreviewServiceProto" +
      "P\001ZIgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v18/services;services\242\002\003" +
      "GAA\252\002!Google.Ads.GoogleAds.V18.Services\312" +
      "\002!Google\\Ads\\GoogleAds\\V18\\Services\352\002%Go" +
      "ogle::Ads::GoogleAds::V18::Servicesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "ShareablePreviews", });
    internal_static_google_ads_googleads_v18_services_ShareablePreview_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_ShareablePreview_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_ShareablePreview_descriptor,
        new java.lang.String[] { "AssetGroupIdentifier", });
    internal_static_google_ads_googleads_v18_services_AssetGroupIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_AssetGroupIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_AssetGroupIdentifier_descriptor,
        new java.lang.String[] { "AssetGroupId", });
    internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_GenerateShareablePreviewsResponse_descriptor,
        new java.lang.String[] { "Responses", });
    internal_static_google_ads_googleads_v18_services_ShareablePreviewOrError_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v18_services_ShareablePreviewOrError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_ShareablePreviewOrError_descriptor,
        new java.lang.String[] { "AssetGroupIdentifier", "ShareablePreviewResult", "PartialFailureError", "GenerateShareablePreviewResponse", });
    internal_static_google_ads_googleads_v18_services_ShareablePreviewResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v18_services_ShareablePreviewResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_ShareablePreviewResult_descriptor,
        new java.lang.String[] { "ShareablePreviewUrl", "ExpirationDateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
