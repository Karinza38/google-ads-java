// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/errors/media_upload_error.proto

package com.google.ads.googleads.v1.errors;

public final class MediaUploadErrorProto {
  private MediaUploadErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_errors_MediaUploadErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_errors_MediaUploadErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v1/errors/media_u" +
      "pload_error.proto\022\036google.ads.googleads." +
      "v1.errors\032\034google/api/annotations.proto\"" +
      "\252\001\n\024MediaUploadErrorEnum\"\221\001\n\020MediaUpload" +
      "Error\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\020\n\014F" +
      "ILE_TOO_BIG\020\002\022\025\n\021UNPARSEABLE_IMAGE\020\003\022\036\n\032" +
      "ANIMATED_IMAGE_NOT_ALLOWED\020\004\022\026\n\022FORMAT_N" +
      "OT_ALLOWED\020\005B\360\001\n\"com.google.ads.googlead" +
      "s.v1.errorsB\025MediaUploadErrorProtoP\001ZDgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v1/errors;errors\242\002\003GAA\252\002\036Googl" +
      "e.Ads.GoogleAds.V1.Errors\312\002\036Google\\Ads\\G" +
      "oogleAds\\V1\\Errors\352\002\"Google::Ads::Google" +
      "Ads::V1::Errorsb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_errors_MediaUploadErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_errors_MediaUploadErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_errors_MediaUploadErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}