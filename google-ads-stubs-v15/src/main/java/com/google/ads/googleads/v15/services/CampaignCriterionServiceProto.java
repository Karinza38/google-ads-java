// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/campaign_criterion_service.proto

package com.google.ads.googleads.v15.services;

public final class CampaignCriterionServiceProto {
  private CampaignCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_CampaignCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_CampaignCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCampaignCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v15/services/camp" +
      "aign_criterion_service.proto\022!google.ads" +
      ".googleads.v15.services\032:google/ads/goog" +
      "leads/v15/enums/response_content_type.pr" +
      "oto\032;google/ads/googleads/v15/resources/" +
      "campaign_criterion.proto\032\034google/api/ann" +
      "otations.proto\032\027google/api/client.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\032 google/protobuf/fie" +
      "ld_mask.proto\032\027google/rpc/status.proto\"\257" +
      "\002\n\035MutateCampaignCriteriaRequest\022\031\n\013cust" +
      "omer_id\030\001 \001(\tB\004\342A\001\002\022W\n\noperations\030\002 \003(\0132" +
      "=.google.ads.googleads.v15.services.Camp" +
      "aignCriterionOperationB\004\342A\001\002\022\027\n\017partial_" +
      "failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025" +
      "response_content_type\030\005 \001(\0162K.google.ads" +
      ".googleads.v15.enums.ResponseContentType" +
      "Enum.ResponseContentType\"\257\002\n\032CampaignCri" +
      "terionOperation\022/\n\013update_mask\030\004 \001(\0132\032.g" +
      "oogle.protobuf.FieldMask\022G\n\006create\030\001 \001(\013" +
      "25.google.ads.googleads.v15.resources.Ca" +
      "mpaignCriterionH\000\022G\n\006update\030\002 \001(\01325.goog" +
      "le.ads.googleads.v15.resources.CampaignC" +
      "riterionH\000\022A\n\006remove\030\003 \001(\tB/\372A,\n*googlea" +
      "ds.googleapis.com/CampaignCriterionH\000B\013\n" +
      "\toperation\"\246\001\n\036MutateCampaignCriteriaRes" +
      "ponse\0221\n\025partial_failure_error\030\003 \001(\0132\022.g" +
      "oogle.rpc.Status\022Q\n\007results\030\002 \003(\0132@.goog" +
      "le.ads.googleads.v15.services.MutateCamp" +
      "aignCriterionResult\"\272\001\n\035MutateCampaignCr" +
      "iterionResult\022F\n\rresource_name\030\001 \001(\tB/\372A" +
      ",\n*googleads.googleapis.com/CampaignCrit" +
      "erion\022Q\n\022campaign_criterion\030\002 \001(\01325.goog" +
      "le.ads.googleads.v15.resources.CampaignC" +
      "riterion2\335\002\n\030CampaignCriterionService\022\371\001" +
      "\n\026MutateCampaignCriteria\022@.google.ads.go" +
      "ogleads.v15.services.MutateCampaignCrite" +
      "riaRequest\032A.google.ads.googleads.v15.se" +
      "rvices.MutateCampaignCriteriaResponse\"Z\332" +
      "A\026customer_id,operations\202\323\344\223\002;\"6/v15/cus" +
      "tomers/{customer_id=*}/campaignCriteria:" +
      "mutate:\001*\032E\312A\030googleads.googleapis.com\322A" +
      "\'https://www.googleapis.com/auth/adwords" +
      "B\211\002\n%com.google.ads.googleads.v15.servic" +
      "esB\035CampaignCriterionServiceProtoP\001ZIgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v15/services;services\242\002\003GAA\252\002!G" +
      "oogle.Ads.GoogleAds.V15.Services\312\002!Googl" +
      "e\\Ads\\GoogleAds\\V15\\Services\352\002%Google::A" +
      "ds::GoogleAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.CampaignCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v15_services_CampaignCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_CampaignCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_CampaignCriterionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateCampaignCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCampaignCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignCriterion", });
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
    com.google.ads.googleads.v15.resources.CampaignCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
