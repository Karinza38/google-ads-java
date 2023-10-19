// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/google_ads_field.proto

package com.google.ads.googleads.v15.resources;

public final class GoogleAdsFieldProto {
  private GoogleAdsFieldProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_GoogleAdsField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_GoogleAdsField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v15/resources/goo" +
      "gle_ads_field.proto\022\"google.ads.googlead" +
      "s.v15.resources\032>google/ads/googleads/v1" +
      "5/enums/google_ads_field_category.proto\032" +
      "?google/ads/googleads/v15/enums/google_a" +
      "ds_field_data_type.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"\220\006\n\016GoogleAdsField\022G\n\rresource_name" +
      "\030\001 \001(\tB0\342A\001\003\372A)\n\'googleads.googleapis.co" +
      "m/GoogleAdsField\022\027\n\004name\030\025 \001(\tB\004\342A\001\003H\000\210\001" +
      "\001\022i\n\010category\030\003 \001(\0162Q.google.ads.googlea" +
      "ds.v15.enums.GoogleAdsFieldCategoryEnum." +
      "GoogleAdsFieldCategoryB\004\342A\001\003\022\035\n\nselectab" +
      "le\030\026 \001(\010B\004\342A\001\003H\001\210\001\001\022\035\n\nfilterable\030\027 \001(\010B" +
      "\004\342A\001\003H\002\210\001\001\022\033\n\010sortable\030\030 \001(\010B\004\342A\001\003H\003\210\001\001\022" +
      "\035\n\017selectable_with\030\031 \003(\tB\004\342A\001\003\022!\n\023attrib" +
      "ute_resources\030\032 \003(\tB\004\342A\001\003\022\025\n\007metrics\030\033 \003" +
      "(\tB\004\342A\001\003\022\026\n\010segments\030\034 \003(\tB\004\342A\001\003\022\031\n\013enum" +
      "_values\030\035 \003(\tB\004\342A\001\003\022j\n\tdata_type\030\014 \001(\0162Q" +
      ".google.ads.googleads.v15.enums.GoogleAd" +
      "sFieldDataTypeEnum.GoogleAdsFieldDataTyp" +
      "eB\004\342A\001\003\022\033\n\010type_url\030\036 \001(\tB\004\342A\001\003H\004\210\001\001\022\036\n\013" +
      "is_repeated\030\037 \001(\010B\004\342A\001\003H\005\210\001\001:P\352AM\n\'googl" +
      "eads.googleapis.com/GoogleAdsField\022\"goog" +
      "leAdsFields/{google_ads_field}B\007\n\005_nameB" +
      "\r\n\013_selectableB\r\n\013_filterableB\013\n\t_sortab" +
      "leB\013\n\t_type_urlB\016\n\014_is_repeatedB\205\002\n&com." +
      "google.ads.googleads.v15.resourcesB\023Goog" +
      "leAdsFieldProtoP\001ZKgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v15/resou" +
      "rces;resources\242\002\003GAA\252\002\"Google.Ads.Google" +
      "Ads.V15.Resources\312\002\"Google\\Ads\\GoogleAds" +
      "\\V15\\Resources\352\002&Google::Ads::GoogleAds:" +
      ":V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.GoogleAdsFieldCategoryProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.GoogleAdsFieldDataTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_GoogleAdsField_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_GoogleAdsField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_GoogleAdsField_descriptor,
        new java.lang.String[] { "ResourceName", "Name", "Category", "Selectable", "Filterable", "Sortable", "SelectableWith", "AttributeResources", "Metrics", "Segments", "EnumValues", "DataType", "TypeUrl", "IsRepeated", "Name", "Selectable", "Filterable", "Sortable", "TypeUrl", "IsRepeated", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.GoogleAdsFieldCategoryProto.getDescriptor();
    com.google.ads.googleads.v15.enums.GoogleAdsFieldDataTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
