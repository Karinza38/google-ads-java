// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/offline_user_data.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public interface UserDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.UserData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.UserIdentifier user_identifiers = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.UserIdentifier> 
      getUserIdentifiersList();
  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.UserIdentifier user_identifiers = 1;</code>
   */
  com.google.ads.googleads.v18.common.UserIdentifier getUserIdentifiers(int index);
  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.UserIdentifier user_identifiers = 1;</code>
   */
  int getUserIdentifiersCount();
  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.UserIdentifier user_identifiers = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.UserIdentifierOrBuilder> 
      getUserIdentifiersOrBuilderList();
  /**
   * <pre>
   * User identification info. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.UserIdentifier user_identifiers = 1;</code>
   */
  com.google.ads.googleads.v18.common.UserIdentifierOrBuilder getUserIdentifiersOrBuilder(
      int index);

  /**
   * <pre>
   * Additional transactions/attributes associated with the user.
   * Required when updating store sales data.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.TransactionAttribute transaction_attribute = 2;</code>
   * @return Whether the transactionAttribute field is set.
   */
  boolean hasTransactionAttribute();
  /**
   * <pre>
   * Additional transactions/attributes associated with the user.
   * Required when updating store sales data.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.TransactionAttribute transaction_attribute = 2;</code>
   * @return The transactionAttribute.
   */
  com.google.ads.googleads.v18.common.TransactionAttribute getTransactionAttribute();
  /**
   * <pre>
   * Additional transactions/attributes associated with the user.
   * Required when updating store sales data.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.TransactionAttribute transaction_attribute = 2;</code>
   */
  com.google.ads.googleads.v18.common.TransactionAttributeOrBuilder getTransactionAttributeOrBuilder();

  /**
   * <pre>
   * Additional attributes associated with the user. Required when updating
   * customer match attributes. These have an expiration of 540 days.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserAttribute user_attribute = 3;</code>
   * @return Whether the userAttribute field is set.
   */
  boolean hasUserAttribute();
  /**
   * <pre>
   * Additional attributes associated with the user. Required when updating
   * customer match attributes. These have an expiration of 540 days.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserAttribute user_attribute = 3;</code>
   * @return The userAttribute.
   */
  com.google.ads.googleads.v18.common.UserAttribute getUserAttribute();
  /**
   * <pre>
   * Additional attributes associated with the user. Required when updating
   * customer match attributes. These have an expiration of 540 days.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserAttribute user_attribute = 3;</code>
   */
  com.google.ads.googleads.v18.common.UserAttributeOrBuilder getUserAttributeOrBuilder();

  /**
   * <pre>
   * The consent setting for the user. If set, will override the job level
   * consent for this user.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.common.Consent consent = 4;</code>
   * @return Whether the consent field is set.
   */
  boolean hasConsent();
  /**
   * <pre>
   * The consent setting for the user. If set, will override the job level
   * consent for this user.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.common.Consent consent = 4;</code>
   * @return The consent.
   */
  com.google.ads.googleads.v18.common.Consent getConsent();
  /**
   * <pre>
   * The consent setting for the user. If set, will override the job level
   * consent for this user.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v18.common.Consent consent = 4;</code>
   */
  com.google.ads.googleads.v18.common.ConsentOrBuilder getConsentOrBuilder();
}
