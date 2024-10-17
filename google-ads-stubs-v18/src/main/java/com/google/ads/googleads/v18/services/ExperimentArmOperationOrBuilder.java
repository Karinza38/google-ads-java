// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/experiment_arm_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.services;

public interface ExperimentArmOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.ExperimentArmOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.ExperimentArm create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.ExperimentArm create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v18.resources.ExperimentArm getCreate();
  /**
   * <pre>
   * Create operation
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.ExperimentArm create = 1;</code>
   */
  com.google.ads.googleads.v18.resources.ExperimentArmOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The experiment arm is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.ExperimentArm update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The experiment arm is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.ExperimentArm update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v18.resources.ExperimentArm getUpdate();
  /**
   * <pre>
   * Update operation: The experiment arm is expected to have a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.ExperimentArm update = 2;</code>
   */
  com.google.ads.googleads.v18.resources.ExperimentArmOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: The experiment arm is expected to have a valid
   * resource name, in this format:
   *
   * `customers/{customer_id}/experiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: The experiment arm is expected to have a valid
   * resource name, in this format:
   *
   * `customers/{customer_id}/experiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: The experiment arm is expected to have a valid
   * resource name, in this format:
   *
   * `customers/{customer_id}/experiments/{campaign_experiment_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v18.services.ExperimentArmOperation.OperationCase getOperationCase();
}
