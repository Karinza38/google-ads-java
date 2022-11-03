// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/experiment_arm_service.proto

package com.google.ads.googleads.v12.services;

public interface MutateExperimentArmsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.services.MutateExperimentArmsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return Whether the partialFailureError field is set.
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return The partialFailureError.
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();

  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateExperimentArmResult results = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v12.services.MutateExperimentArmResult> 
      getResultsList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateExperimentArmResult results = 2;</code>
   */
  com.google.ads.googleads.v12.services.MutateExperimentArmResult getResults(int index);
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateExperimentArmResult results = 2;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateExperimentArmResult results = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.services.MutateExperimentArmResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.services.MutateExperimentArmResult results = 2;</code>
   */
  com.google.ads.googleads.v12.services.MutateExperimentArmResultOrBuilder getResultsOrBuilder(
      int index);
}
