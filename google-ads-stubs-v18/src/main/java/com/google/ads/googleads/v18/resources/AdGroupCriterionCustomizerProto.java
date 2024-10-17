// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/ad_group_criterion_customizer.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class AdGroupCriterionCustomizerProto {
  private AdGroupCriterionCustomizerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdGroupCriterionCustomizer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdGroupCriterionCustomizer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v18/resources/ad_" +
      "group_criterion_customizer.proto\022\"google" +
      ".ads.googleads.v18.resources\0326google/ads" +
      "/googleads/v18/common/customizer_value.p" +
      "roto\032<google/ads/googleads/v18/enums/cus" +
      "tomizer_value_status.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\"\206\005\n\032AdGroupCriterionCustomizer\022R\n" +
      "\rresource_name\030\001 \001(\tB;\340A\005\372A5\n3googleads." +
      "googleapis.com/AdGroupCriterionCustomize" +
      "r\022R\n\022ad_group_criterion\030\002 \001(\tB1\340A\005\372A+\n)g" +
      "oogleads.googleapis.com/AdGroupCriterion" +
      "H\000\210\001\001\022U\n\024customizer_attribute\030\003 \001(\tB7\340A\002" +
      "\340A\005\372A.\n,googleads.googleapis.com/Customi" +
      "zerAttribute\022d\n\006status\030\004 \001(\0162O.google.ad" +
      "s.googleads.v18.enums.CustomizerValueSta" +
      "tusEnum.CustomizerValueStatusB\003\340A\003\022D\n\005va" +
      "lue\030\005 \001(\01320.google.ads.googleads.v18.com" +
      "mon.CustomizerValueB\003\340A\002:\245\001\352A\241\001\n3googlea" +
      "ds.googleapis.com/AdGroupCriterionCustom" +
      "izer\022jcustomers/{customer_id}/adGroupCri" +
      "terionCustomizers/{ad_group_id}~{criteri" +
      "on_id}~{customizer_attribute_id}B\025\n\023_ad_" +
      "group_criterionB\221\002\n&com.google.ads.googl" +
      "eads.v18.resourcesB\037AdGroupCriterionCust" +
      "omizerProtoP\001ZKgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v18/resources" +
      ";resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds." +
      "V18.Resources\312\002\"Google\\Ads\\GoogleAds\\V18" +
      "\\Resources\352\002&Google::Ads::GoogleAds::V18" +
      "::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.common.CustomizerValueProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.CustomizerValueStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_AdGroupCriterionCustomizer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_AdGroupCriterionCustomizer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdGroupCriterionCustomizer_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "CustomizerAttribute", "Status", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.common.CustomizerValueProto.getDescriptor();
    com.google.ads.googleads.v18.enums.CustomizerValueStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
