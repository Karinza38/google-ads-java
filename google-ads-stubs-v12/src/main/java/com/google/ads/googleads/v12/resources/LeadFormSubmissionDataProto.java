// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/lead_form_submission_data.proto

package com.google.ads.googleads.v12.resources;

public final class LeadFormSubmissionDataProto {
  private LeadFormSubmissionDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_CustomLeadFormSubmissionField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_CustomLeadFormSubmissionField_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v12/resources/lea" +
      "d_form_submission_data.proto\022\"google.ads" +
      ".googleads.v12.resources\032Dgoogle/ads/goo" +
      "gleads/v12/enums/lead_form_field_user_in" +
      "put_type.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\"\203\006\n\026L" +
      "eadFormSubmissionData\022N\n\rresource_name\030\001" +
      " \001(\tB7\340A\003\372A1\n/googleads.googleapis.com/L" +
      "eadFormSubmissionData\022\017\n\002id\030\002 \001(\tB\003\340A\003\0225" +
      "\n\005asset\030\003 \001(\tB&\340A\003\372A \n\036googleads.googlea" +
      "pis.com/Asset\022;\n\010campaign\030\004 \001(\tB)\340A\003\372A#\n" +
      "!googleads.googleapis.com/Campaign\022e\n\033le" +
      "ad_form_submission_fields\030\005 \003(\0132;.google" +
      ".ads.googleads.v12.resources.LeadFormSub" +
      "missionFieldB\003\340A\003\022r\n\"custom_lead_form_su" +
      "bmission_fields\030\n \003(\0132A.google.ads.googl" +
      "eads.v12.resources.CustomLeadFormSubmiss" +
      "ionFieldB\003\340A\003\022:\n\010ad_group\030\006 \001(\tB(\340A\003\372A\"\n" +
      " googleads.googleapis.com/AdGroup\022?\n\013ad_" +
      "group_ad\030\007 \001(\tB*\340A\003\372A$\n\"googleads.google" +
      "apis.com/AdGroupAd\022\022\n\005gclid\030\010 \001(\tB\003\340A\003\022!" +
      "\n\024submission_date_time\030\t \001(\tB\003\340A\003:\204\001\352A\200\001" +
      "\n/googleads.googleapis.com/LeadFormSubmi" +
      "ssionData\022Mcustomers/{customer_id}/leadF" +
      "ormSubmissionData/{lead_form_user_submis" +
      "sion_id}\"\247\001\n\027LeadFormSubmissionField\022r\n\n" +
      "field_type\030\001 \001(\0162Y.google.ads.googleads." +
      "v12.enums.LeadFormFieldUserInputTypeEnum" +
      ".LeadFormFieldUserInputTypeB\003\340A\003\022\030\n\013fiel" +
      "d_value\030\002 \001(\tB\003\340A\003\"U\n\035CustomLeadFormSubm" +
      "issionField\022\032\n\rquestion_text\030\001 \001(\tB\003\340A\003\022" +
      "\030\n\013field_value\030\002 \001(\tB\003\340A\003B\215\002\n&com.google" +
      ".ads.googleads.v12.resourcesB\033LeadFormSu" +
      "bmissionDataProtoP\001ZKgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v12/res" +
      "ources;resources\242\002\003GAA\252\002\"Google.Ads.Goog" +
      "leAds.V12.Resources\312\002\"Google\\Ads\\GoogleA" +
      "ds\\V12\\Resources\352\002&Google::Ads::GoogleAd" +
      "s::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.enums.LeadFormFieldUserInputTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionData_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Asset", "Campaign", "LeadFormSubmissionFields", "CustomLeadFormSubmissionFields", "AdGroup", "AdGroupAd", "Gclid", "SubmissionDateTime", });
    internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionField_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_LeadFormSubmissionField_descriptor,
        new java.lang.String[] { "FieldType", "FieldValue", });
    internal_static_google_ads_googleads_v12_resources_CustomLeadFormSubmissionField_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v12_resources_CustomLeadFormSubmissionField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_CustomLeadFormSubmissionField_descriptor,
        new java.lang.String[] { "QuestionText", "FieldValue", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.enums.LeadFormFieldUserInputTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
