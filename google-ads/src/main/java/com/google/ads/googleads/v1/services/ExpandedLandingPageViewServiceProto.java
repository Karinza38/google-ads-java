// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/expanded_landing_page_view_service.proto

package com.google.ads.googleads.v1.services;

public final class ExpandedLandingPageViewServiceProto {
  private ExpandedLandingPageViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetExpandedLandingPageViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetExpandedLandingPageViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v1/services/expan" +
      "ded_landing_page_view_service.proto\022 goo" +
      "gle.ads.googleads.v1.services\032Bgoogle/ad" +
      "s/googleads/v1/resources/expanded_landin" +
      "g_page_view.proto\032\034google/api/annotation" +
      "s.proto\032\036google/protobuf/wrappers.proto\"" +
      ":\n!GetExpandedLandingPageViewRequest\022\025\n\r" +
      "resource_name\030\001 \001(\t2\204\002\n\036ExpandedLandingP" +
      "ageViewService\022\341\001\n\032GetExpandedLandingPag" +
      "eView\022C.google.ads.googleads.v1.services" +
      ".GetExpandedLandingPageViewRequest\032:.goo" +
      "gle.ads.googleads.v1.resources.ExpandedL" +
      "andingPageView\"B\202\323\344\223\002<\022:/v1/{resource_na" +
      "me=customers/*/expandedLandingPageViews/" +
      "*}B\212\002\n$com.google.ads.googleads.v1.servi" +
      "cesB#ExpandedLandingPageViewServiceProto" +
      "P\001ZHgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v1/services;services\242\002\003G" +
      "AA\252\002 Google.Ads.GoogleAds.V1.Services\312\002 " +
      "Google\\Ads\\GoogleAds\\V1\\Services\352\002$Googl" +
      "e::Ads::GoogleAds::V1::Servicesb\006proto3"
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
          com.google.ads.googleads.v1.resources.ExpandedLandingPageViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetExpandedLandingPageViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetExpandedLandingPageViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetExpandedLandingPageViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.ExpandedLandingPageViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}