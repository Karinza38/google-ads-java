// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/ad_group_criterion_customizer_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public final class AdGroupCriterionCustomizerServiceProto {
  private AdGroupCriterionCustomizerServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_AdGroupCriterionCustomizerOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_AdGroupCriterionCustomizerOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizerResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nMgoogle/ads/googleads/v18/services/ad_g" +
      "roup_criterion_customizer_service.proto\022" +
      "!google.ads.googleads.v18.services\032:goog" +
      "le/ads/googleads/v18/enums/response_cont" +
      "ent_type.proto\032Fgoogle/ads/googleads/v18" +
      "/resources/ad_group_criterion_customizer" +
      ".proto\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032\027google/rpc/status.proto\"\301\002\n(MutateAdG" +
      "roupCriterionCustomizersRequest\022\030\n\013custo" +
      "mer_id\030\001 \001(\tB\003\340A\002\022_\n\noperations\030\002 \003(\0132F." +
      "google.ads.googleads.v18.services.AdGrou" +
      "pCriterionCustomizerOperationB\003\340A\002\022\027\n\017pa" +
      "rtial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001" +
      "(\010\022j\n\025response_content_type\030\005 \001(\0162K.goog" +
      "le.ads.googleads.v18.enums.ResponseConte" +
      "ntTypeEnum.ResponseContentType\"\320\001\n#AdGro" +
      "upCriterionCustomizerOperation\022P\n\006create" +
      "\030\001 \001(\0132>.google.ads.googleads.v18.resour" +
      "ces.AdGroupCriterionCustomizerH\000\022J\n\006remo" +
      "ve\030\002 \001(\tB8\372A5\n3googleads.googleapis.com/" +
      "AdGroupCriterionCustomizerH\000B\013\n\toperatio" +
      "n\"\272\001\n)MutateAdGroupCriterionCustomizersR" +
      "esponse\022Z\n\007results\030\001 \003(\0132I.google.ads.go" +
      "ogleads.v18.services.MutateAdGroupCriter" +
      "ionCustomizerResult\0221\n\025partial_failure_e" +
      "rror\030\002 \001(\0132\022.google.rpc.Status\"\340\001\n&Mutat" +
      "eAdGroupCriterionCustomizerResult\022O\n\rres" +
      "ource_name\030\001 \001(\tB8\372A5\n3googleads.googlea" +
      "pis.com/AdGroupCriterionCustomizer\022e\n\035ad" +
      "_group_criterion_customizer\030\002 \001(\0132>.goog" +
      "le.ads.googleads.v18.resources.AdGroupCr" +
      "iterionCustomizer2\222\003\n!AdGroupCriterionCu" +
      "stomizerService\022\245\002\n!MutateAdGroupCriteri" +
      "onCustomizers\022K.google.ads.googleads.v18" +
      ".services.MutateAdGroupCriterionCustomiz" +
      "ersRequest\032L.google.ads.googleads.v18.se" +
      "rvices.MutateAdGroupCriterionCustomizers" +
      "Response\"e\332A\026customer_id,operations\202\323\344\223\002" +
      "F\"A/v18/customers/{customer_id=*}/AdGrou" +
      "pCriterionCustomizers:mutate:\001*\032E\312A\030goog" +
      "leads.googleapis.com\322A\'https://www.googl" +
      "eapis.com/auth/adwordsB\222\002\n%com.google.ad" +
      "s.googleads.v18.servicesB&AdGroupCriteri" +
      "onCustomizerServiceProtoP\001ZIgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v18/services;services\242\002\003GAA\252\002!Google.Ads" +
      ".GoogleAds.V18.Services\312\002!Google\\Ads\\Goo" +
      "gleAds\\V18\\Services\352\002%Google::Ads::Googl" +
      "eAds::V18::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.resources.AdGroupCriterionCustomizerProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v18_services_AdGroupCriterionCustomizerOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_AdGroupCriterionCustomizerOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_AdGroupCriterionCustomizerOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizersResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizerResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateAdGroupCriterionCustomizerResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterionCustomizer", });
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
    com.google.ads.googleads.v18.resources.AdGroupCriterionCustomizerProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
