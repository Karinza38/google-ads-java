// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_criterion_simulation.proto

package com.google.ads.googleads.v2.resources;

public final class CampaignCriterionSimulationProto {
  private CampaignCriterionSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_CampaignCriterionSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_CampaignCriterionSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v2/resources/camp" +
      "aign_criterion_simulation.proto\022!google." +
      "ads.googleads.v2.resources\032/google/ads/g" +
      "oogleads/v2/common/simulation.proto\032Bgoo" +
      "gle/ads/googleads/v2/enums/simulation_mo" +
      "dification_method.proto\0323google/ads/goog" +
      "leads/v2/enums/simulation_type.proto\032\036go" +
      "ogle/protobuf/wrappers.proto\032\034google/api" +
      "/annotations.proto\"\267\004\n\033CampaignCriterion" +
      "Simulation\022\025\n\rresource_name\030\001 \001(\t\0220\n\013cam" +
      "paign_id\030\002 \001(\0132\033.google.protobuf.Int64Va" +
      "lue\0221\n\014criterion_id\030\003 \001(\0132\033.google.proto" +
      "buf.Int64Value\022N\n\004type\030\004 \001(\0162@.google.ad" +
      "s.googleads.v2.enums.SimulationTypeEnum." +
      "SimulationType\022y\n\023modification_method\030\005 " +
      "\001(\0162\\.google.ads.googleads.v2.enums.Simu" +
      "lationModificationMethodEnum.SimulationM" +
      "odificationMethod\0220\n\nstart_date\030\006 \001(\0132\034." +
      "google.protobuf.StringValue\022.\n\010end_date\030" +
      "\007 \001(\0132\034.google.protobuf.StringValue\022a\n\027b" +
      "id_modifier_point_list\030\010 \001(\0132>.google.ad" +
      "s.googleads.v2.common.BidModifierSimulat" +
      "ionPointListH\000B\014\n\npoint_listB\215\002\n%com.goo" +
      "gle.ads.googleads.v2.resourcesB Campaign" +
      "CriterionSimulationProtoP\001ZJgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v2/resources;resources\242\002\003GAA\252\002!Google.Ad" +
      "s.GoogleAds.V2.Resources\312\002!Google\\Ads\\Go" +
      "ogleAds\\V2\\Resources\352\002%Google::Ads::Goog" +
      "leAds::V2::Resourcesb\006proto3"
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
          com.google.ads.googleads.v2.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.SimulationTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_CampaignCriterionSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_CampaignCriterionSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_CampaignCriterionSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignId", "CriterionId", "Type", "ModificationMethod", "StartDate", "EndDate", "BidModifierPointList", "PointList", });
    com.google.ads.googleads.v2.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v2.enums.SimulationTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}