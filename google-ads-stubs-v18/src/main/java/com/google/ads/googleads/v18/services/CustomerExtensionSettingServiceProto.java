// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/customer_extension_setting_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public final class CustomerExtensionSettingServiceProto {
  private CustomerExtensionSettingServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_CustomerExtensionSettingOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_CustomerExtensionSettingOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v18/services/cust" +
      "omer_extension_setting_service.proto\022!go" +
      "ogle.ads.googleads.v18.services\032:google/" +
      "ads/googleads/v18/enums/response_content" +
      "_type.proto\032Cgoogle/ads/googleads/v18/re" +
      "sources/customer_extension_setting.proto" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\027google/rp" +
      "c/status.proto\"\275\002\n&MutateCustomerExtensi" +
      "onSettingsRequest\022\030\n\013customer_id\030\001 \001(\tB\003" +
      "\340A\002\022]\n\noperations\030\002 \003(\0132D.google.ads.goo" +
      "gleads.v18.services.CustomerExtensionSet" +
      "tingOperationB\003\340A\002\022\027\n\017partial_failure\030\003 " +
      "\001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025response_c" +
      "ontent_type\030\005 \001(\0162K.google.ads.googleads" +
      ".v18.enums.ResponseContentTypeEnum.Respo" +
      "nseContentType\"\313\002\n!CustomerExtensionSett" +
      "ingOperation\022/\n\013update_mask\030\004 \001(\0132\032.goog" +
      "le.protobuf.FieldMask\022N\n\006create\030\001 \001(\0132<." +
      "google.ads.googleads.v18.resources.Custo" +
      "merExtensionSettingH\000\022N\n\006update\030\002 \001(\0132<." +
      "google.ads.googleads.v18.resources.Custo" +
      "merExtensionSettingH\000\022H\n\006remove\030\003 \001(\tB6\372" +
      "A3\n1googleads.googleapis.com/CustomerExt" +
      "ensionSettingH\000B\013\n\toperation\"\266\001\n\'MutateC" +
      "ustomerExtensionSettingsResponse\0221\n\025part" +
      "ial_failure_error\030\003 \001(\0132\022.google.rpc.Sta" +
      "tus\022X\n\007results\030\002 \003(\0132G.google.ads.google" +
      "ads.v18.services.MutateCustomerExtension" +
      "SettingResult\"\327\001\n$MutateCustomerExtensio" +
      "nSettingResult\022M\n\rresource_name\030\001 \001(\tB6\372" +
      "A3\n1googleads.googleapis.com/CustomerExt" +
      "ensionSetting\022`\n\032customer_extension_sett" +
      "ing\030\002 \001(\0132<.google.ads.googleads.v18.res" +
      "ources.CustomerExtensionSetting2\210\003\n\037Cust" +
      "omerExtensionSettingService\022\235\002\n\037MutateCu" +
      "stomerExtensionSettings\022I.google.ads.goo" +
      "gleads.v18.services.MutateCustomerExtens" +
      "ionSettingsRequest\032J.google.ads.googlead" +
      "s.v18.services.MutateCustomerExtensionSe" +
      "ttingsResponse\"c\332A\026customer_id,operation" +
      "s\202\323\344\223\002D\"?/v18/customers/{customer_id=*}/" +
      "customerExtensionSettings:mutate:\001*\032E\312A\030" +
      "googleads.googleapis.com\322A\'https://www.g" +
      "oogleapis.com/auth/adwordsB\220\002\n%com.googl" +
      "e.ads.googleads.v18.servicesB$CustomerEx" +
      "tensionSettingServiceProtoP\001ZIgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v18/services;services\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V18.Services\312\002!Google\\Ads\\G" +
      "oogleAds\\V18\\Services\352\002%Google::Ads::Goo" +
      "gleAds::V18::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v18.resources.CustomerExtensionSettingProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v18_services_CustomerExtensionSettingOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_services_CustomerExtensionSettingOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_CustomerExtensionSettingOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_services_MutateCustomerExtensionSettingResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomerExtensionSetting", });
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
    com.google.ads.googleads.v18.resources.CustomerExtensionSettingProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
