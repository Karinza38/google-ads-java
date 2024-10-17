// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/errors/manager_link_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.errors;

public final class ManagerLinkErrorProto {
  private ManagerLinkErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_errors_ManagerLinkErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_errors_ManagerLinkErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v18/errors/manage" +
      "r_link_error.proto\022\037google.ads.googleads" +
      ".v18.errors\"\215\005\n\024ManagerLinkErrorEnum\"\364\004\n" +
      "\020ManagerLinkError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UN" +
      "KNOWN\020\001\022\'\n#ACCOUNTS_NOT_COMPATIBLE_FOR_L" +
      "INKING\020\002\022\025\n\021TOO_MANY_MANAGERS\020\003\022\024\n\020TOO_M" +
      "ANY_INVITES\020\004\022#\n\037ALREADY_INVITED_BY_THIS" +
      "_MANAGER\020\005\022#\n\037ALREADY_MANAGED_BY_THIS_MA" +
      "NAGER\020\006\022 \n\034ALREADY_MANAGED_IN_HIERARCHY\020" +
      "\007\022\031\n\025DUPLICATE_CHILD_FOUND\020\010\022\034\n\030CLIENT_H" +
      "AS_NO_ADMIN_USER\020\t\022\026\n\022MAX_DEPTH_EXCEEDED" +
      "\020\n\022\025\n\021CYCLE_NOT_ALLOWED\020\013\022\025\n\021TOO_MANY_AC" +
      "COUNTS\020\014\022 \n\034TOO_MANY_ACCOUNTS_AT_MANAGER" +
      "\020\r\022%\n!NON_OWNER_USER_CANNOT_MODIFY_LINK\020" +
      "\016\022(\n$SUSPENDED_ACCOUNT_CANNOT_ADD_CLIENT" +
      "S\020\017\022\027\n\023CLIENT_OUTSIDE_TREE\020\020\022\031\n\025INVALID_" +
      "STATUS_CHANGE\020\021\022\022\n\016INVALID_CHANGE\020\022\022\037\n\033C" +
      "USTOMER_CANNOT_MANAGE_SELF\020\023\022%\n!CREATING" +
      "_ENABLED_LINK_NOT_ALLOWED\020\024B\365\001\n#com.goog" +
      "le.ads.googleads.v18.errorsB\025ManagerLink" +
      "ErrorProtoP\001ZEgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v18/errors;err" +
      "ors\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V18.Err" +
      "ors\312\002\037Google\\Ads\\GoogleAds\\V18\\Errors\352\002#" +
      "Google::Ads::GoogleAds::V18::Errorsb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v18_errors_ManagerLinkErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_errors_ManagerLinkErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_errors_ManagerLinkErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
