// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/invoice_service.proto

package com.google.ads.googleads.v12.services;

public final class InvoiceServiceProto {
  private InvoiceServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_services_ListInvoicesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_services_ListInvoicesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v12/services/invo" +
      "ice_service.proto\022!google.ads.googleads." +
      "v12.services\0322google/ads/googleads/v12/e" +
      "nums/month_of_year.proto\0320google/ads/goo" +
      "gleads/v12/resources/invoice.proto\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\032\037google/api/field_behavior.pro" +
      "to\"\273\001\n\023ListInvoicesRequest\022\030\n\013customer_i" +
      "d\030\001 \001(\tB\003\340A\002\022\032\n\rbilling_setup\030\002 \001(\tB\003\340A\002" +
      "\022\027\n\nissue_year\030\003 \001(\tB\003\340A\002\022U\n\013issue_month" +
      "\030\004 \001(\0162;.google.ads.googleads.v12.enums." +
      "MonthOfYearEnum.MonthOfYearB\003\340A\002\"U\n\024List" +
      "InvoicesResponse\022=\n\010invoices\030\001 \003(\0132+.goo" +
      "gle.ads.googleads.v12.resources.Invoice2" +
      "\275\002\n\016InvoiceService\022\343\001\n\014ListInvoices\0226.go" +
      "ogle.ads.googleads.v12.services.ListInvo" +
      "icesRequest\0327.google.ads.googleads.v12.s" +
      "ervices.ListInvoicesResponse\"b\202\323\344\223\002)\022\'/v" +
      "12/customers/{customer_id=*}/invoices\332A0" +
      "customer_id,billing_setup,issue_year,iss" +
      "ue_month\032E\312A\030googleads.googleapis.com\322A\'" +
      "https://www.googleapis.com/auth/adwordsB" +
      "\377\001\n%com.google.ads.googleads.v12.service" +
      "sB\023InvoiceServiceProtoP\001ZIgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "2/services;services\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V12.Services\312\002!Google\\Ads\\Googl" +
      "eAds\\V12\\Services\352\002%Google::Ads::GoogleA" +
      "ds::V12::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.MonthOfYearProto.getDescriptor(),
          com.google.ads.googleads.v12.resources.InvoiceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "BillingSetup", "IssueYear", "IssueMonth", });
    internal_static_google_ads_googleads_v12_services_ListInvoicesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_services_ListInvoicesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_services_ListInvoicesResponse_descriptor,
        new java.lang.String[] { "Invoices", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.enums.MonthOfYearProto.getDescriptor();
    com.google.ads.googleads.v12.resources.InvoiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
