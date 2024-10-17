// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/offline_user_data_job_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface OfflineUserDataJobOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.OfflineUserDataJobOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Add the provided data to the transaction. Data cannot be retrieved after
   * being uploaded.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserData create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Add the provided data to the transaction. Data cannot be retrieved after
   * being uploaded.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserData create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.common.UserData getCreate();
  /**
   * <pre>
   * Add the provided data to the transaction. Data cannot be retrieved after
   * being uploaded.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserData create = 1;</code>
   */
  com.google.ads.googleads.v18.common.UserDataOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove the provided data from the transaction. Data cannot be retrieved
   * after being uploaded.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserData remove = 2;</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove the provided data from the transaction. Data cannot be retrieved
   * after being uploaded.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserData remove = 2;</code>
   * @return The remove.
   */
  com.google.ads.googleads.v18.common.UserData getRemove();
  /**
   * <pre>
   * Remove the provided data from the transaction. Data cannot be retrieved
   * after being uploaded.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.UserData remove = 2;</code>
   */
  com.google.ads.googleads.v18.common.UserDataOrBuilder getRemoveOrBuilder();

  /**
   * <pre>
   * Remove all previously provided data. This is only supported for Customer
   * Match.
   * </pre>
   *
   * <code>bool remove_all = 3;</code>
   * @return Whether the removeAll field is set.
   */
  boolean hasRemoveAll();
  /**
   * <pre>
   * Remove all previously provided data. This is only supported for Customer
   * Match.
   * </pre>
   *
   * <code>bool remove_all = 3;</code>
   * @return The removeAll.
   */
  boolean getRemoveAll();

  com.google.ads.googleads.v18.services.OfflineUserDataJobOperation.OperationCase getOperationCase();
}
