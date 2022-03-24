// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/bidding_seasonality_adjustment_service.proto

package com.google.ads.googleads.v10.services;

public final class BiddingSeasonalityAdjustmentServiceProto {
  private BiddingSeasonalityAdjustmentServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_BiddingSeasonalityAdjustmentOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_BiddingSeasonalityAdjustmentOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/ads/googleads/v10/services/bidd" +
      "ing_seasonality_adjustment_service.proto" +
      "\022!google.ads.googleads.v10.services\032:goo" +
      "gle/ads/googleads/v10/enums/response_con" +
      "tent_type.proto\032Ggoogle/ads/googleads/v1" +
      "0/resources/bidding_seasonality_adjustme" +
      "nt.proto\032\034google/api/annotations.proto\032\027" +
      "google/api/client.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032 google/protobuf/field_mask.proto\032\027g" +
      "oogle/rpc/status.proto\"\305\002\n*MutateBidding" +
      "SeasonalityAdjustmentsRequest\022\030\n\013custome" +
      "r_id\030\001 \001(\tB\003\340A\002\022a\n\noperations\030\002 \003(\0132H.go" +
      "ogle.ads.googleads.v10.services.BiddingS" +
      "easonalityAdjustmentOperationB\003\340A\002\022\027\n\017pa" +
      "rtial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001" +
      "(\010\022j\n\025response_content_type\030\005 \001(\0162K.goog" +
      "le.ads.googleads.v10.enums.ResponseConte" +
      "ntTypeEnum.ResponseContentType\"\333\002\n%Biddi" +
      "ngSeasonalityAdjustmentOperation\022/\n\013upda" +
      "te_mask\030\004 \001(\0132\032.google.protobuf.FieldMas" +
      "k\022R\n\006create\030\001 \001(\0132@.google.ads.googleads" +
      ".v10.resources.BiddingSeasonalityAdjustm" +
      "entH\000\022R\n\006update\030\002 \001(\0132@.google.ads.googl" +
      "eads.v10.resources.BiddingSeasonalityAdj" +
      "ustmentH\000\022L\n\006remove\030\003 \001(\tB:\372A7\n5googlead" +
      "s.googleapis.com/BiddingSeasonalityAdjus" +
      "tmentH\000B\013\n\toperation\"\277\001\n+MutateBiddingSe" +
      "asonalityAdjustmentsResponse\0221\n\025partial_" +
      "failure_error\030\003 \001(\0132\022.google.rpc.Status\022" +
      "]\n\007results\030\002 \003(\0132L.google.ads.googleads." +
      "v10.services.MutateBiddingSeasonalityAdj" +
      "ustmentsResult\"\350\001\n)MutateBiddingSeasonal" +
      "ityAdjustmentsResult\022Q\n\rresource_name\030\001 " +
      "\001(\tB:\372A7\n5googleads.googleapis.com/Biddi" +
      "ngSeasonalityAdjustment\022h\n\036bidding_seaso" +
      "nality_adjustment\030\002 \001(\0132@.google.ads.goo" +
      "gleads.v10.resources.BiddingSeasonalityA" +
      "djustment2\234\003\n#BiddingSeasonalityAdjustme" +
      "ntService\022\255\002\n#MutateBiddingSeasonalityAd" +
      "justments\022M.google.ads.googleads.v10.ser" +
      "vices.MutateBiddingSeasonalityAdjustment" +
      "sRequest\032N.google.ads.googleads.v10.serv" +
      "ices.MutateBiddingSeasonalityAdjustments" +
      "Response\"g\202\323\344\223\002H\"C/v10/customers/{custom" +
      "er_id=*}/biddingSeasonalityAdjustments:m" +
      "utate:\001*\332A\026customer_id,operations\032E\312A\030go" +
      "ogleads.googleapis.com\322A\'https://www.goo" +
      "gleapis.com/auth/adwordsB\224\002\n%com.google." +
      "ads.googleads.v10.servicesB(BiddingSeaso" +
      "nalityAdjustmentServiceProtoP\001ZIgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v10/services;services\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V10.Services\312\002!Google\\Ads" +
      "\\GoogleAds\\V10\\Services\352\002%Google::Ads::G" +
      "oogleAds::V10::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.resources.BiddingSeasonalityAdjustmentProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v10_services_BiddingSeasonalityAdjustmentOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v10_services_BiddingSeasonalityAdjustmentOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_BiddingSeasonalityAdjustmentOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_services_MutateBiddingSeasonalityAdjustmentsResult_descriptor,
        new java.lang.String[] { "ResourceName", "BiddingSeasonalityAdjustment", });
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
    com.google.ads.googleads.v10.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v10.resources.BiddingSeasonalityAdjustmentProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}