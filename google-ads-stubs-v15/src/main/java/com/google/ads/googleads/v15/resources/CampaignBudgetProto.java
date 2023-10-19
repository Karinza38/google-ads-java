// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/campaign_budget.proto

package com.google.ads.googleads.v15.resources;

public final class CampaignBudgetProto {
  private CampaignBudgetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_CampaignBudget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_CampaignBudget_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v15/resources/cam" +
      "paign_budget.proto\022\"google.ads.googleads" +
      ".v15.resources\032;google/ads/googleads/v15" +
      "/enums/budget_delivery_method.proto\0322goo" +
      "gle/ads/googleads/v15/enums/budget_perio" +
      "d.proto\0322google/ads/googleads/v15/enums/" +
      "budget_status.proto\0320google/ads/googlead" +
      "s/v15/enums/budget_type.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\377\013\n\016CampaignBudget\022G\n\rresource" +
      "_name\030\001 \001(\tB0\342A\001\005\372A)\n\'googleads.googleap" +
      "is.com/CampaignBudget\022\025\n\002id\030\023 \001(\003B\004\342A\001\003H" +
      "\000\210\001\001\022\021\n\004name\030\024 \001(\tH\001\210\001\001\022\032\n\ramount_micros" +
      "\030\025 \001(\003H\002\210\001\001\022 \n\023total_amount_micros\030\026 \001(\003" +
      "H\003\210\001\001\022S\n\006status\030\006 \001(\0162=.google.ads.googl" +
      "eads.v15.enums.BudgetStatusEnum.BudgetSt" +
      "atusB\004\342A\001\003\022f\n\017delivery_method\030\007 \001(\0162M.go" +
      "ogle.ads.googleads.v15.enums.BudgetDeliv" +
      "eryMethodEnum.BudgetDeliveryMethod\022\036\n\021ex" +
      "plicitly_shared\030\027 \001(\010H\004\210\001\001\022\"\n\017reference_" +
      "count\030\030 \001(\003B\004\342A\001\003H\005\210\001\001\022)\n\026has_recommende" +
      "d_budget\030\031 \001(\010B\004\342A\001\003H\006\210\001\001\0223\n recommended" +
      "_budget_amount_micros\030\032 \001(\003B\004\342A\001\003H\007\210\001\001\022S" +
      "\n\006period\030\r \001(\0162=.google.ads.googleads.v1" +
      "5.enums.BudgetPeriodEnum.BudgetPeriodB\004\342" +
      "A\001\005\022D\n1recommended_budget_estimated_chan" +
      "ge_weekly_clicks\030\033 \001(\003B\004\342A\001\003H\010\210\001\001\022I\n6rec" +
      "ommended_budget_estimated_change_weekly_" +
      "cost_micros\030\034 \001(\003B\004\342A\001\003H\t\210\001\001\022J\n7recommen" +
      "ded_budget_estimated_change_weekly_inter" +
      "actions\030\035 \001(\003B\004\342A\001\003H\n\210\001\001\022C\n0recommended_" +
      "budget_estimated_change_weekly_views\030\036 \001" +
      "(\003B\004\342A\001\003H\013\210\001\001\022M\n\004type\030\022 \001(\01629.google.ads" +
      ".googleads.v15.enums.BudgetTypeEnum.Budg" +
      "etTypeB\004\342A\001\005\022#\n\033aligned_bidding_strategy" +
      "_id\030\037 \001(\003:j\352Ag\n\'googleads.googleapis.com" +
      "/CampaignBudget\022<customers/{customer_id}" +
      "/campaignBudgets/{campaign_budget_id}B\005\n" +
      "\003_idB\007\n\005_nameB\020\n\016_amount_microsB\026\n\024_tota" +
      "l_amount_microsB\024\n\022_explicitly_sharedB\022\n" +
      "\020_reference_countB\031\n\027_has_recommended_bu" +
      "dgetB#\n!_recommended_budget_amount_micro" +
      "sB4\n2_recommended_budget_estimated_chang" +
      "e_weekly_clicksB9\n7_recommended_budget_e" +
      "stimated_change_weekly_cost_microsB:\n8_r" +
      "ecommended_budget_estimated_change_weekl" +
      "y_interactionsB3\n1_recommended_budget_es" +
      "timated_change_weekly_viewsB\205\002\n&com.goog" +
      "le.ads.googleads.v15.resourcesB\023Campaign" +
      "BudgetProtoP\001ZKgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v15/resources" +
      ";resources\242\002\003GAA\252\002\"Google.Ads.GoogleAds." +
      "V15.Resources\312\002\"Google\\Ads\\GoogleAds\\V15" +
      "\\Resources\352\002&Google::Ads::GoogleAds::V15" +
      "::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.BudgetDeliveryMethodProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.BudgetPeriodProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.BudgetStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.BudgetTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_CampaignBudget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_CampaignBudget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_CampaignBudget_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "AmountMicros", "TotalAmountMicros", "Status", "DeliveryMethod", "ExplicitlyShared", "ReferenceCount", "HasRecommendedBudget", "RecommendedBudgetAmountMicros", "Period", "RecommendedBudgetEstimatedChangeWeeklyClicks", "RecommendedBudgetEstimatedChangeWeeklyCostMicros", "RecommendedBudgetEstimatedChangeWeeklyInteractions", "RecommendedBudgetEstimatedChangeWeeklyViews", "Type", "AlignedBiddingStrategyId", "Id", "Name", "AmountMicros", "TotalAmountMicros", "ExplicitlyShared", "ReferenceCount", "HasRecommendedBudget", "RecommendedBudgetAmountMicros", "RecommendedBudgetEstimatedChangeWeeklyClicks", "RecommendedBudgetEstimatedChangeWeeklyCostMicros", "RecommendedBudgetEstimatedChangeWeeklyInteractions", "RecommendedBudgetEstimatedChangeWeeklyViews", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.BudgetDeliveryMethodProto.getDescriptor();
    com.google.ads.googleads.v15.enums.BudgetPeriodProto.getDescriptor();
    com.google.ads.googleads.v15.enums.BudgetStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.BudgetTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
