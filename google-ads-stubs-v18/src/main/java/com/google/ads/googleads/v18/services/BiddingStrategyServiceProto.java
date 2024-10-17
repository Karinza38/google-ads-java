// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/bidding_strategy_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public final class BiddingStrategyServiceProto {
  private BiddingStrategyServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_BiddingStrategyOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_BiddingStrategyOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategyResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateBiddingStrategyResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v18/services/bidd" +
      "ing_strategy_service.proto\022!google.ads.g" +
      "oogleads.v18.services\032:google/ads/google" +
      "ads/v18/enums/response_content_type.prot" +
      "o\0329google/ads/googleads/v18/resources/bi" +
      "dding_strategy.proto\032\034google/api/annotat" +
      "ions.proto\032\027google/api/client.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032 google/protobuf/field_m" +
      "ask.proto\032\027google/rpc/status.proto\"\254\002\n\036M" +
      "utateBiddingStrategiesRequest\022\030\n\013custome" +
      "r_id\030\001 \001(\tB\003\340A\002\022T\n\noperations\030\002 \003(\0132;.go" +
      "ogle.ads.googleads.v18.services.BiddingS" +
      "trategyOperationB\003\340A\002\022\027\n\017partial_failure" +
      "\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025respons" +
      "e_content_type\030\005 \001(\0162K.google.ads.google" +
      "ads.v18.enums.ResponseContentTypeEnum.Re" +
      "sponseContentType\"\247\002\n\030BiddingStrategyOpe" +
      "ration\022/\n\013update_mask\030\004 \001(\0132\032.google.pro" +
      "tobuf.FieldMask\022E\n\006create\030\001 \001(\01323.google" +
      ".ads.googleads.v18.resources.BiddingStra" +
      "tegyH\000\022E\n\006update\030\002 \001(\01323.google.ads.goog" +
      "leads.v18.resources.BiddingStrategyH\000\022?\n" +
      "\006remove\030\003 \001(\tB-\372A*\n(googleads.googleapis" +
      ".com/BiddingStrategyH\000B\013\n\toperation\"\245\001\n\037" +
      "MutateBiddingStrategiesResponse\0221\n\025parti" +
      "al_failure_error\030\003 \001(\0132\022.google.rpc.Stat" +
      "us\022O\n\007results\030\002 \003(\0132>.google.ads.googlea" +
      "ds.v18.services.MutateBiddingStrategyRes" +
      "ult\"\262\001\n\033MutateBiddingStrategyResult\022D\n\rr" +
      "esource_name\030\001 \001(\tB-\372A*\n(googleads.googl" +
      "eapis.com/BiddingStrategy\022M\n\020bidding_str" +
      "ategy\030\002 \001(\01323.google.ads.googleads.v18.r" +
      "esources.BiddingStrategy2\337\002\n\026BiddingStra" +
      "tegyService\022\375\001\n\027MutateBiddingStrategies\022" +
      "A.google.ads.googleads.v18.services.Muta" +
      "teBiddingStrategiesRequest\032B.google.ads." +
      "googleads.v18.services.MutateBiddingStra" +
      "tegiesResponse\"[\332A\026customer_id,operation" +
      "s\202\323\344\223\002<\"7/v18/customers/{customer_id=*}/" +
      "biddingStrategies:mutate:\001*\032E\312A\030googlead" +
      "s.googleapis.com\322A\'https://www.googleapi" +
      "s.com/auth/adwordsB\207\002\n%com.google.ads.go" +
      "ogleads.v18.servicesB\033BiddingStrategySer" +
      "viceProtoP\001ZIgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v18/services;se" +
      "rvices\242\002\003GAA\252\002!Google.Ads.GoogleAds.V18." +
      "Services\312\002!Google\\Ads\\GoogleAds\\V18\\Serv" +
      "ices\352\002%Google::Ads::GoogleAds::V18::Serv" +
      "icesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.resources.BiddingStrategyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v18_services_BiddingStrategyOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_BiddingStrategyOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_BiddingStrategyOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateBiddingStrategiesResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategyResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_MutateBiddingStrategyResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateBiddingStrategyResult_descriptor,
        new java.lang.String[] { "ResourceName", "BiddingStrategy", });
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
    com.google.ads.googleads.v18.resources.BiddingStrategyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
