// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/account_budget_proposal_error.proto

package com.google.ads.googleads.v15.errors;

public final class AccountBudgetProposalErrorProto {
  private AccountBudgetProposalErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_AccountBudgetProposalErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_AccountBudgetProposalErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v15/errors/accoun" +
      "t_budget_proposal_error.proto\022\037google.ad" +
      "s.googleads.v15.errors\"\332\007\n\036AccountBudget" +
      "ProposalErrorEnum\"\267\007\n\032AccountBudgetPropo" +
      "salError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\032" +
      "\n\026FIELD_MASK_NOT_ALLOWED\020\002\022\023\n\017IMMUTABLE_" +
      "FIELD\020\003\022\032\n\026REQUIRED_FIELD_MISSING\020\004\022#\n\037C" +
      "ANNOT_CANCEL_APPROVED_PROPOSAL\020\005\022#\n\037CANN" +
      "OT_REMOVE_UNAPPROVED_BUDGET\020\006\022 \n\034CANNOT_" +
      "REMOVE_RUNNING_BUDGET\020\007\022 \n\034CANNOT_END_UN" +
      "APPROVED_BUDGET\020\010\022\036\n\032CANNOT_END_INACTIVE" +
      "_BUDGET\020\t\022\030\n\024BUDGET_NAME_REQUIRED\020\n\022\034\n\030C" +
      "ANNOT_UPDATE_OLD_BUDGET\020\013\022\026\n\022CANNOT_END_" +
      "IN_PAST\020\014\022\032\n\026CANNOT_EXTEND_END_TIME\020\r\022\"\n" +
      "\036PURCHASE_ORDER_NUMBER_REQUIRED\020\016\022\"\n\036PEN" +
      "DING_UPDATE_PROPOSAL_EXISTS\020\017\022=\n9MULTIPL" +
      "E_BUDGETS_NOT_ALLOWED_FOR_UNAPPROVED_BIL" +
      "LING_SETUP\020\020\022/\n+CANNOT_UPDATE_START_TIME" +
      "_FOR_STARTED_BUDGET\020\021\0226\n2SPENDING_LIMIT_" +
      "LOWER_THAN_ACCRUED_COST_NOT_ALLOWED\020\022\022\023\n" +
      "\017UPDATE_IS_NO_OP\020\023\022#\n\037END_TIME_MUST_FOLL" +
      "OW_START_TIME\020\024\0225\n1BUDGET_DATE_RANGE_INC" +
      "OMPATIBLE_WITH_BILLING_SETUP\020\025\022\022\n\016NOT_AU" +
      "THORIZED\020\026\022\031\n\025INVALID_BILLING_SETUP\020\027\022\034\n" +
      "\030OVERLAPS_EXISTING_BUDGET\020\030\022$\n CANNOT_CR" +
      "EATE_BUDGET_THROUGH_API\020\031\022$\n INVALID_MAS" +
      "TER_SERVICE_AGREEMENT\020\032\022\032\n\026CANCELED_BILL" +
      "ING_SETUP\020\033B\377\001\n#com.google.ads.googleads" +
      ".v15.errorsB\037AccountBudgetProposalErrorP" +
      "rotoP\001ZEgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v15/errors;errors\242\002\003" +
      "GAA\252\002\037Google.Ads.GoogleAds.V15.Errors\312\002\037" +
      "Google\\Ads\\GoogleAds\\V15\\Errors\352\002#Google" +
      "::Ads::GoogleAds::V15::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_AccountBudgetProposalErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_AccountBudgetProposalErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_AccountBudgetProposalErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
