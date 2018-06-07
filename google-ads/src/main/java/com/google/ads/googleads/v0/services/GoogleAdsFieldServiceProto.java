// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/google_ads_field_service.proto

package com.google.ads.googleads.v0.services;

public final class GoogleAdsFieldServiceProto {
  private GoogleAdsFieldServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetGoogleAdsFieldRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetGoogleAdsFieldRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v0/services/googl" +
      "e_ads_field_service.proto\022 google.ads.go" +
      "ogleads.v0.services\0328google/ads/googlead" +
      "s/v0/resources/google_ads_field.proto\032\034g" +
      "oogle/api/annotations.proto\"1\n\030GetGoogle" +
      "AdsFieldRequest\022\025\n\rresource_name\030\001 \001(\t\"T" +
      "\n\034SearchGoogleAdsFieldsRequest\022\r\n\005query\030" +
      "\001 \001(\t\022\022\n\npage_token\030\002 \001(\t\022\021\n\tpage_size\030\003" +
      " \001(\005\"\231\001\n\035SearchGoogleAdsFieldsResponse\022B" +
      "\n\007results\030\001 \003(\01321.google.ads.googleads.v" +
      "0.resources.GoogleAdsField\022\027\n\017next_page_" +
      "token\030\002 \001(\t\022\033\n\023total_results_count\030\003 \001(\003" +
      "2\215\003\n\025GoogleAdsFieldService\022\261\001\n\021GetGoogle" +
      "AdsField\022:.google.ads.googleads.v0.servi" +
      "ces.GetGoogleAdsFieldRequest\0321.google.ad" +
      "s.googleads.v0.resources.GoogleAdsField\"" +
      "-\202\323\344\223\002\'\022%/v0/{resource_name=googleAdsFie" +
      "lds/*}\022\277\001\n\025SearchGoogleAdsFields\022>.googl" +
      "e.ads.googleads.v0.services.SearchGoogle" +
      "AdsFieldsRequest\032?.google.ads.googleads." +
      "v0.services.SearchGoogleAdsFieldsRespons" +
      "e\"%\202\323\344\223\002\037\"\032/v0/googleAdsFields:search:\001*" +
      "B\332\001\n$com.google.ads.googleads.v0.service" +
      "sB\032GoogleAdsFieldServiceProtoP\001ZHgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v0/services;services\242\002\003GAA\252\002 Google" +
      ".Ads.GoogleAds.V0.Services\312\002 Google\\Ads\\" +
      "GoogleAds\\V0\\Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.GoogleAdsFieldProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetGoogleAdsFieldRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetGoogleAdsFieldRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetGoogleAdsFieldRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsRequest_descriptor,
        new java.lang.String[] { "Query", "PageToken", "PageSize", });
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_SearchGoogleAdsFieldsResponse_descriptor,
        new java.lang.String[] { "Results", "NextPageToken", "TotalResultsCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.GoogleAdsFieldProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}