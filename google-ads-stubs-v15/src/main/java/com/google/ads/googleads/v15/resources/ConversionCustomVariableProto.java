// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/conversion_custom_variable.proto

package com.google.ads.googleads.v15.resources;

public final class ConversionCustomVariableProto {
  private ConversionCustomVariableProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_ConversionCustomVariable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_ConversionCustomVariable_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v15/resources/con" +
      "version_custom_variable.proto\022\"google.ad" +
      "s.googleads.v15.resources\032Fgoogle/ads/go" +
      "ogleads/v15/enums/conversion_custom_vari" +
      "able_status.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\"\353\003" +
      "\n\030ConversionCustomVariable\022Q\n\rresource_n" +
      "ame\030\001 \001(\tB:\342A\001\005\372A3\n1googleads.googleapis" +
      ".com/ConversionCustomVariable\022\020\n\002id\030\002 \001(" +
      "\003B\004\342A\001\003\022\022\n\004name\030\003 \001(\tB\004\342A\001\002\022\022\n\003tag\030\004 \001(\t" +
      "B\005\342A\002\002\005\022q\n\006status\030\005 \001(\0162a.google.ads.goo" +
      "gleads.v15.enums.ConversionCustomVariabl" +
      "eStatusEnum.ConversionCustomVariableStat" +
      "us\022B\n\016owner_customer\030\006 \001(\tB*\342A\001\003\372A#\n!goo" +
      "gleads.googleapis.com/Customer:\212\001\352A\206\001\n1g" +
      "oogleads.googleapis.com/ConversionCustom" +
      "Variable\022Qcustomers/{customer_id}/conver" +
      "sionCustomVariables/{conversion_custom_v" +
      "ariable_id}B\217\002\n&com.google.ads.googleads" +
      ".v15.resourcesB\035ConversionCustomVariable" +
      "ProtoP\001ZKgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v15/resources;resou" +
      "rces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V15.Re" +
      "sources\312\002\"Google\\Ads\\GoogleAds\\V15\\Resou" +
      "rces\352\002&Google::Ads::GoogleAds::V15::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ConversionCustomVariableStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_ConversionCustomVariable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_ConversionCustomVariable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_ConversionCustomVariable_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Tag", "Status", "OwnerCustomer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.ConversionCustomVariableStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
