// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/feed_mapping_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public final class FeedMappingServiceProto {
  private FeedMappingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateFeedMappingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_FeedMappingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_FeedMappingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateFeedMappingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateFeedMappingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v18/services/feed" +
      "_mapping_service.proto\022!google.ads.googl" +
      "eads.v18.services\032:google/ads/googleads/" +
      "v18/enums/response_content_type.proto\0325g" +
      "oogle/ads/googleads/v18/resources/feed_m" +
      "apping.proto\032\034google/api/annotations.pro" +
      "to\032\027google/api/client.proto\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032\027google/rpc/status.proto\"\243\002\n\031Mut" +
      "ateFeedMappingsRequest\022\030\n\013customer_id\030\001 " +
      "\001(\tB\003\340A\002\022P\n\noperations\030\002 \003(\01327.google.ad" +
      "s.googleads.v18.services.FeedMappingOper" +
      "ationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rv" +
      "alidate_only\030\004 \001(\010\022j\n\025response_content_t" +
      "ype\030\005 \001(\0162K.google.ads.googleads.v18.enu" +
      "ms.ResponseContentTypeEnum.ResponseConte" +
      "ntType\"\243\001\n\024FeedMappingOperation\022A\n\006creat" +
      "e\030\001 \001(\0132/.google.ads.googleads.v18.resou" +
      "rces.FeedMappingH\000\022;\n\006remove\030\003 \001(\tB)\372A&\n" +
      "$googleads.googleapis.com/FeedMappingH\000B" +
      "\013\n\toperation\"\234\001\n\032MutateFeedMappingsRespo" +
      "nse\0221\n\025partial_failure_error\030\003 \001(\0132\022.goo" +
      "gle.rpc.Status\022K\n\007results\030\002 \003(\0132:.google" +
      ".ads.googleads.v18.services.MutateFeedMa" +
      "ppingResult\"\242\001\n\027MutateFeedMappingResult\022" +
      "@\n\rresource_name\030\001 \001(\tB)\372A&\n$googleads.g" +
      "oogleapis.com/FeedMapping\022E\n\014feed_mappin" +
      "g\030\002 \001(\0132/.google.ads.googleads.v18.resou" +
      "rces.FeedMapping2\307\002\n\022FeedMappingService\022" +
      "\351\001\n\022MutateFeedMappings\022<.google.ads.goog" +
      "leads.v18.services.MutateFeedMappingsReq" +
      "uest\032=.google.ads.googleads.v18.services" +
      ".MutateFeedMappingsResponse\"V\332A\026customer" +
      "_id,operations\202\323\344\223\0027\"2/v18/customers/{cu" +
      "stomer_id=*}/feedMappings:mutate:\001*\032E\312A\030" +
      "googleads.googleapis.com\322A\'https://www.g" +
      "oogleapis.com/auth/adwordsB\203\002\n%com.googl" +
      "e.ads.googleads.v18.servicesB\027FeedMappin" +
      "gServiceProtoP\001ZIgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v18/service" +
      "s;services\242\002\003GAA\252\002!Google.Ads.GoogleAds." +
      "V18.Services\312\002!Google\\Ads\\GoogleAds\\V18\\" +
      "Services\352\002%Google::Ads::GoogleAds::V18::" +
      "Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.resources.FeedMappingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateFeedMappingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v18_services_FeedMappingOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_FeedMappingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_FeedMappingOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateFeedMappingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_MutateFeedMappingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateFeedMappingResult_descriptor,
        new java.lang.String[] { "ResourceName", "FeedMapping", });
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
    com.google.ads.googleads.v18.resources.FeedMappingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
