// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/payments_account.proto

package com.google.ads.googleads.v15.resources;

public interface PaymentsAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.PaymentsAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the payments account.
   * PaymentsAccount resource names have the form:
   *
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the payments account.
   * PaymentsAccount resource names have the form:
   *
   * `customers/{customer_id}/paymentsAccounts/{payments_account_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. A 16 digit ID used to identify a payments account.
   * </pre>
   *
   * <code>optional string payments_account_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the paymentsAccountId field is set.
   */
  boolean hasPaymentsAccountId();
  /**
   * <pre>
   * Output only. A 16 digit ID used to identify a payments account.
   * </pre>
   *
   * <code>optional string payments_account_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The paymentsAccountId.
   */
  java.lang.String getPaymentsAccountId();
  /**
   * <pre>
   * Output only. A 16 digit ID used to identify a payments account.
   * </pre>
   *
   * <code>optional string payments_account_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for paymentsAccountId.
   */
  com.google.protobuf.ByteString
      getPaymentsAccountIdBytes();

  /**
   * <pre>
   * Output only. The name of the payments account.
   * </pre>
   *
   * <code>optional string name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The name of the payments account.
   * </pre>
   *
   * <code>optional string name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the payments account.
   * </pre>
   *
   * <code>optional string name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The currency code of the payments account.
   * A subset of the currency codes derived from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>optional string currency_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * Output only. The currency code of the payments account.
   * A subset of the currency codes derived from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>optional string currency_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Output only. The currency code of the payments account.
   * A subset of the currency codes derived from the ISO 4217 standard is
   * supported.
   * </pre>
   *
   * <code>optional string currency_code = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * Output only. A 12 digit ID used to identify the payments profile associated
   * with the payments account.
   * </pre>
   *
   * <code>optional string payments_profile_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the paymentsProfileId field is set.
   */
  boolean hasPaymentsProfileId();
  /**
   * <pre>
   * Output only. A 12 digit ID used to identify the payments profile associated
   * with the payments account.
   * </pre>
   *
   * <code>optional string payments_profile_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The paymentsProfileId.
   */
  java.lang.String getPaymentsProfileId();
  /**
   * <pre>
   * Output only. A 12 digit ID used to identify the payments profile associated
   * with the payments account.
   * </pre>
   *
   * <code>optional string payments_profile_id = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for paymentsProfileId.
   */
  com.google.protobuf.ByteString
      getPaymentsProfileIdBytes();

  /**
   * <pre>
   * Output only. A secondary payments profile ID present in uncommon
   * situations, for example, when a sequential liability agreement has been
   * arranged.
   * </pre>
   *
   * <code>optional string secondary_payments_profile_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the secondaryPaymentsProfileId field is set.
   */
  boolean hasSecondaryPaymentsProfileId();
  /**
   * <pre>
   * Output only. A secondary payments profile ID present in uncommon
   * situations, for example, when a sequential liability agreement has been
   * arranged.
   * </pre>
   *
   * <code>optional string secondary_payments_profile_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The secondaryPaymentsProfileId.
   */
  java.lang.String getSecondaryPaymentsProfileId();
  /**
   * <pre>
   * Output only. A secondary payments profile ID present in uncommon
   * situations, for example, when a sequential liability agreement has been
   * arranged.
   * </pre>
   *
   * <code>optional string secondary_payments_profile_id = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for secondaryPaymentsProfileId.
   */
  com.google.protobuf.ByteString
      getSecondaryPaymentsProfileIdBytes();

  /**
   * <pre>
   * Output only. Paying manager of this payment account.
   * </pre>
   *
   * <code>optional string paying_manager_customer = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the payingManagerCustomer field is set.
   */
  boolean hasPayingManagerCustomer();
  /**
   * <pre>
   * Output only. Paying manager of this payment account.
   * </pre>
   *
   * <code>optional string paying_manager_customer = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The payingManagerCustomer.
   */
  java.lang.String getPayingManagerCustomer();
  /**
   * <pre>
   * Output only. Paying manager of this payment account.
   * </pre>
   *
   * <code>optional string paying_manager_customer = 13 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for payingManagerCustomer.
   */
  com.google.protobuf.ByteString
      getPayingManagerCustomerBytes();
}
