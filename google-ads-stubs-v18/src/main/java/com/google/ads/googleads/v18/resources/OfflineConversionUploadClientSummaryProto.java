// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/offline_conversion_upload_client_summary.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.resources;

public final class OfflineConversionUploadClientSummaryProto {
  private OfflineConversionUploadClientSummaryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadClientSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadClientSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_OfflineConversionSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_OfflineConversionSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_OfflineConversionAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_OfflineConversionAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_OfflineConversionError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_OfflineConversionError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nQgoogle/ads/googleads/v18/resources/off" +
      "line_conversion_upload_client_summary.pr" +
      "oto\022\"google.ads.googleads.v18.resources\032" +
      "Ngoogle/ads/googleads/v18/enums/offline_" +
      "conversion_diagnostic_status_enum.proto\032" +
      "Egoogle/ads/googleads/v18/enums/offline_" +
      "event_upload_client_enum.proto\032;google/a" +
      "ds/googleads/v18/errors/collection_size_" +
      "error.proto\032Hgoogle/ads/googleads/v18/er" +
      "rors/conversion_adjustment_upload_error." +
      "proto\032=google/ads/googleads/v18/errors/c" +
      "onversion_upload_error.proto\0320google/ads" +
      "/googleads/v18/errors/date_error.proto\0324" +
      "google/ads/googleads/v18/errors/distinct" +
      "_error.proto\0321google/ads/googleads/v18/e" +
      "rrors/field_error.proto\0322google/ads/goog" +
      "leads/v18/errors/mutate_error.proto\032;goo" +
      "gle/ads/googleads/v18/errors/not_allowli" +
      "sted_error.proto\0329google/ads/googleads/v" +
      "18/errors/string_format_error.proto\0329goo" +
      "gle/ads/googleads/v18/errors/string_leng" +
      "th_error.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\"\305\007\n$O" +
      "fflineConversionUploadClientSummary\022\\\n\rr" +
      "esource_name\030\001 \001(\tBE\340A\003\372A?\n=googleads.go" +
      "ogleapis.com/OfflineConversionUploadClie" +
      "ntSummary\022j\n\006client\030\002 \001(\0162U.google.ads.g" +
      "oogleads.v18.enums.OfflineEventUploadCli" +
      "entEnum.OfflineEventUploadClientB\003\340A\003\022|\n" +
      "\006status\030\003 \001(\0162g.google.ads.googleads.v18" +
      ".enums.OfflineConversionDiagnosticStatus" +
      "Enum.OfflineConversionDiagnosticStatusB\003" +
      "\340A\003\022\036\n\021total_event_count\030\004 \001(\003B\003\340A\003\022#\n\026s" +
      "uccessful_event_count\030\005 \001(\003B\003\340A\003\022\031\n\014succ" +
      "ess_rate\030\006 \001(\001B\003\340A\003\022 \n\023pending_event_cou" +
      "nt\030\013 \001(\003B\003\340A\003\022\031\n\014pending_rate\030\014 \001(\001B\003\340A\003" +
      "\022\"\n\025last_upload_date_time\030\007 \001(\tB\003\340A\003\022Z\n\017" +
      "daily_summaries\030\010 \003(\0132<.google.ads.googl" +
      "eads.v18.resources.OfflineConversionSumm" +
      "aryB\003\340A\003\022X\n\rjob_summaries\030\t \003(\0132<.google" +
      ".ads.googleads.v18.resources.OfflineConv" +
      "ersionSummaryB\003\340A\003\022O\n\006alerts\030\n \003(\0132:.goo" +
      "gle.ads.googleads.v18.resources.OfflineC" +
      "onversionAlertB\003\340A\003:\214\001\352A\210\001\n=googleads.go" +
      "ogleapis.com/OfflineConversionUploadClie" +
      "ntSummary\022Gcustomers/{customer_id}/offli" +
      "neConversionUploadClientSummaries/{clien" +
      "t}\"\264\001\n\030OfflineConversionSummary\022\035\n\020succe" +
      "ssful_count\030\003 \001(\003B\003\340A\003\022\031\n\014failed_count\030\004" +
      " \001(\003B\003\340A\003\022\032\n\rpending_count\030\005 \001(\003B\003\340A\003\022\025\n" +
      "\006job_id\030\001 \001(\003B\003\340A\003H\000\022\032\n\013upload_date\030\002 \001(" +
      "\tB\003\340A\003H\000B\017\n\rdimension_key\"\207\001\n\026OfflineCon" +
      "versionAlert\022N\n\005error\030\001 \001(\0132:.google.ads" +
      ".googleads.v18.resources.OfflineConversi" +
      "onErrorB\003\340A\003\022\035\n\020error_percentage\030\002 \001(\001B\003" +
      "\340A\003\"\347\010\n\026OfflineConversionError\022r\n\025collec" +
      "tion_size_error\030\001 \001(\0162L.google.ads.googl" +
      "eads.v18.errors.CollectionSizeErrorEnum." +
      "CollectionSizeErrorB\003\340A\003H\000\022\227\001\n\"conversio" +
      "n_adjustment_upload_error\030\002 \001(\0162d.google" +
      ".ads.googleads.v18.errors.ConversionAdju" +
      "stmentUploadErrorEnum.ConversionAdjustme" +
      "ntUploadErrorB\003\340A\003H\000\022x\n\027conversion_uploa" +
      "d_error\030\003 \001(\0162P.google.ads.googleads.v18" +
      ".errors.ConversionUploadErrorEnum.Conver" +
      "sionUploadErrorB\003\340A\003H\000\022S\n\ndate_error\030\004 \001" +
      "(\01628.google.ads.googleads.v18.errors.Dat" +
      "eErrorEnum.DateErrorB\003\340A\003H\000\022_\n\016distinct_" +
      "error\030\005 \001(\0162@.google.ads.googleads.v18.e" +
      "rrors.DistinctErrorEnum.DistinctErrorB\003\340" +
      "A\003H\000\022V\n\013field_error\030\006 \001(\0162:.google.ads.g" +
      "oogleads.v18.errors.FieldErrorEnum.Field" +
      "ErrorB\003\340A\003H\000\022Y\n\014mutate_error\030\007 \001(\0162<.goo" +
      "gle.ads.googleads.v18.errors.MutateError" +
      "Enum.MutateErrorB\003\340A\003H\000\022r\n\025not_allowlist" +
      "ed_error\030\010 \001(\0162L.google.ads.googleads.v1" +
      "8.errors.NotAllowlistedErrorEnum.NotAllo" +
      "wlistedErrorB\003\340A\003H\000\022l\n\023string_format_err" +
      "or\030\t \001(\0162H.google.ads.googleads.v18.erro" +
      "rs.StringFormatErrorEnum.StringFormatErr" +
      "orB\003\340A\003H\000\022l\n\023string_length_error\030\n \001(\0162H" +
      ".google.ads.googleads.v18.errors.StringL" +
      "engthErrorEnum.StringLengthErrorB\003\340A\003H\000B" +
      "\014\n\nerror_codeB\233\002\n&com.google.ads.googlea" +
      "ds.v18.resourcesB)OfflineConversionUploa" +
      "dClientSummaryProtoP\001ZKgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v18/r" +
      "esources;resources\242\002\003GAA\252\002\"Google.Ads.Go" +
      "ogleAds.V18.Resources\312\002\"Google\\Ads\\Googl" +
      "eAds\\V18\\Resources\352\002&Google::Ads::Google" +
      "Ads::V18::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.OfflineConversionDiagnosticStatusEnumProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.OfflineEventUploadClientEnumProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.CollectionSizeErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.ConversionUploadErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.DateErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.DistinctErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.FieldErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.MutateErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.NotAllowlistedErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.StringFormatErrorProto.getDescriptor(),
          com.google.ads.googleads.v18.errors.StringLengthErrorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadClientSummary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadClientSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_OfflineConversionUploadClientSummary_descriptor,
        new java.lang.String[] { "ResourceName", "Client", "Status", "TotalEventCount", "SuccessfulEventCount", "SuccessRate", "PendingEventCount", "PendingRate", "LastUploadDateTime", "DailySummaries", "JobSummaries", "Alerts", });
    internal_static_google_ads_googleads_v18_resources_OfflineConversionSummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v18_resources_OfflineConversionSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_OfflineConversionSummary_descriptor,
        new java.lang.String[] { "SuccessfulCount", "FailedCount", "PendingCount", "JobId", "UploadDate", "DimensionKey", });
    internal_static_google_ads_googleads_v18_resources_OfflineConversionAlert_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v18_resources_OfflineConversionAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_OfflineConversionAlert_descriptor,
        new java.lang.String[] { "Error", "ErrorPercentage", });
    internal_static_google_ads_googleads_v18_resources_OfflineConversionError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v18_resources_OfflineConversionError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_OfflineConversionError_descriptor,
        new java.lang.String[] { "CollectionSizeError", "ConversionAdjustmentUploadError", "ConversionUploadError", "DateError", "DistinctError", "FieldError", "MutateError", "NotAllowlistedError", "StringFormatError", "StringLengthError", "ErrorCode", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.OfflineConversionDiagnosticStatusEnumProto.getDescriptor();
    com.google.ads.googleads.v18.enums.OfflineEventUploadClientEnumProto.getDescriptor();
    com.google.ads.googleads.v18.errors.CollectionSizeErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.ConversionAdjustmentUploadErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.ConversionUploadErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.DateErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.DistinctErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.FieldErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.MutateErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.NotAllowlistedErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.StringFormatErrorProto.getDescriptor();
    com.google.ads.googleads.v18.errors.StringLengthErrorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
