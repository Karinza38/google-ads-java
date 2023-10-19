// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/conversion_custom_variable_service.proto

package com.google.ads.googleads.v15.services;

public final class ConversionCustomVariableServiceProto {
  private ConversionCustomVariableServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_ConversionCustomVariableOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_ConversionCustomVariableOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariableResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariableResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v15/services/conv" +
      "ersion_custom_variable_service.proto\022!go" +
      "ogle.ads.googleads.v15.services\032:google/" +
      "ads/googleads/v15/enums/response_content" +
      "_type.proto\032Cgoogle/ads/googleads/v15/re" +
      "sources/conversion_custom_variable.proto" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\027google/rp" +
      "c/status.proto\"\277\002\n&MutateConversionCusto" +
      "mVariablesRequest\022\031\n\013customer_id\030\001 \001(\tB\004" +
      "\342A\001\002\022^\n\noperations\030\002 \003(\0132D.google.ads.go" +
      "ogleads.v15.services.ConversionCustomVar" +
      "iableOperationB\004\342A\001\002\022\027\n\017partial_failure\030" +
      "\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j\n\025response" +
      "_content_type\030\005 \001(\0162K.google.ads.googlea" +
      "ds.v15.enums.ResponseContentTypeEnum.Res" +
      "ponseContentType\"\201\002\n!ConversionCustomVar" +
      "iableOperation\022/\n\013update_mask\030\003 \001(\0132\032.go" +
      "ogle.protobuf.FieldMask\022N\n\006create\030\001 \001(\0132" +
      "<.google.ads.googleads.v15.resources.Con" +
      "versionCustomVariableH\000\022N\n\006update\030\002 \001(\0132" +
      "<.google.ads.googleads.v15.resources.Con" +
      "versionCustomVariableH\000B\013\n\toperation\"\266\001\n" +
      "\'MutateConversionCustomVariablesResponse" +
      "\0221\n\025partial_failure_error\030\001 \001(\0132\022.google" +
      ".rpc.Status\022X\n\007results\030\002 \003(\0132G.google.ad" +
      "s.googleads.v15.services.MutateConversio" +
      "nCustomVariableResult\"\327\001\n$MutateConversi" +
      "onCustomVariableResult\022M\n\rresource_name\030" +
      "\001 \001(\tB6\372A3\n1googleads.googleapis.com/Con" +
      "versionCustomVariable\022`\n\032conversion_cust" +
      "om_variable\030\002 \001(\0132<.google.ads.googleads" +
      ".v15.resources.ConversionCustomVariable2" +
      "\210\003\n\037ConversionCustomVariableService\022\235\002\n\037" +
      "MutateConversionCustomVariables\022I.google" +
      ".ads.googleads.v15.services.MutateConver" +
      "sionCustomVariablesRequest\032J.google.ads." +
      "googleads.v15.services.MutateConversionC" +
      "ustomVariablesResponse\"c\332A\026customer_id,o" +
      "perations\202\323\344\223\002D\"?/v15/customers/{custome" +
      "r_id=*}/conversionCustomVariables:mutate" +
      ":\001*\032E\312A\030googleads.googleapis.com\322A\'https" +
      "://www.googleapis.com/auth/adwordsB\220\002\n%c" +
      "om.google.ads.googleads.v15.servicesB$Co" +
      "nversionCustomVariableServiceProtoP\001ZIgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v15/services;services\242\002\003GAA\252\002!" +
      "Google.Ads.GoogleAds.V15.Services\312\002!Goog" +
      "le\\Ads\\GoogleAds\\V15\\Services\352\002%Google::" +
      "Ads::GoogleAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.ConversionCustomVariableProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v15_services_ConversionCustomVariableOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_ConversionCustomVariableOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_ConversionCustomVariableOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariablesResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariableResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariableResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateConversionCustomVariableResult_descriptor,
        new java.lang.String[] { "ResourceName", "ConversionCustomVariable", });
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
    com.google.ads.googleads.v15.resources.ConversionCustomVariableProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
