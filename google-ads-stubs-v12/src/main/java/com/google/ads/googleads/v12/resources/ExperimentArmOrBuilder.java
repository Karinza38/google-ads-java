// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/experiment_arm.proto

package com.google.ads.googleads.v12.resources;

public interface ExperimentArmOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.ExperimentArm)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the experiment arm.
   * Experiment arm resource names have the form:
   * `customers/{customer_id}/experimentArms/{TrialArm.trial_id}~{TrialArm.trial_arm_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the experiment arm.
   * Experiment arm resource names have the form:
   * `customers/{customer_id}/experimentArms/{TrialArm.trial_id}~{TrialArm.trial_arm_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The experiment to which the ExperimentArm belongs.
   * </pre>
   *
   * <code>string experiment = 8 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The experiment.
   */
  java.lang.String getExperiment();
  /**
   * <pre>
   * Immutable. The experiment to which the ExperimentArm belongs.
   * </pre>
   *
   * <code>string experiment = 8 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for experiment.
   */
  com.google.protobuf.ByteString
      getExperimentBytes();

  /**
   * <pre>
   * Required. The name of the experiment arm. It must have a minimum length of 1 and
   * maximum length of 1024. It must be unique under an experiment.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the experiment arm. It must have a minimum length of 1 and
   * maximum length of 1024. It must be unique under an experiment.
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Whether this arm is a control arm. A control arm is the arm against
   * which the other arms are compared.
   * </pre>
   *
   * <code>bool control = 4;</code>
   * @return The control.
   */
  boolean getControl();

  /**
   * <pre>
   * Traffic split of the trial arm. The value should be between 1 and 100
   * and must total 100 between the two trial arms.
   * </pre>
   *
   * <code>int64 traffic_split = 5;</code>
   * @return The trafficSplit.
   */
  long getTrafficSplit();

  /**
   * <pre>
   * List of campaigns in the trial arm. The max length is one.
   * </pre>
   *
   * <code>repeated string campaigns = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the campaigns.
   */
  java.util.List<java.lang.String>
      getCampaignsList();
  /**
   * <pre>
   * List of campaigns in the trial arm. The max length is one.
   * </pre>
   *
   * <code>repeated string campaigns = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of campaigns.
   */
  int getCampaignsCount();
  /**
   * <pre>
   * List of campaigns in the trial arm. The max length is one.
   * </pre>
   *
   * <code>repeated string campaigns = 6 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The campaigns at the given index.
   */
  java.lang.String getCampaigns(int index);
  /**
   * <pre>
   * List of campaigns in the trial arm. The max length is one.
   * </pre>
   *
   * <code>repeated string campaigns = 6 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the campaigns at the given index.
   */
  com.google.protobuf.ByteString
      getCampaignsBytes(int index);

  /**
   * <pre>
   * Output only. The in design campaigns in the treatment experiment arm.
   * </pre>
   *
   * <code>repeated string in_design_campaigns = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return A list containing the inDesignCampaigns.
   */
  java.util.List<java.lang.String>
      getInDesignCampaignsList();
  /**
   * <pre>
   * Output only. The in design campaigns in the treatment experiment arm.
   * </pre>
   *
   * <code>repeated string in_design_campaigns = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The count of inDesignCampaigns.
   */
  int getInDesignCampaignsCount();
  /**
   * <pre>
   * Output only. The in design campaigns in the treatment experiment arm.
   * </pre>
   *
   * <code>repeated string in_design_campaigns = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The inDesignCampaigns at the given index.
   */
  java.lang.String getInDesignCampaigns(int index);
  /**
   * <pre>
   * Output only. The in design campaigns in the treatment experiment arm.
   * </pre>
   *
   * <code>repeated string in_design_campaigns = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the inDesignCampaigns at the given index.
   */
  com.google.protobuf.ByteString
      getInDesignCampaignsBytes(int index);
}
