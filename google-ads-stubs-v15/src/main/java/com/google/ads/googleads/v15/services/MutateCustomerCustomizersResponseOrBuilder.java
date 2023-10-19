// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_customizer_service.proto

package com.google.ads.googleads.v15.services;

public interface MutateCustomerCustomizersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateCustomerCustomizersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerCustomizerResult results = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.MutateCustomerCustomizerResult> 
      getResultsList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerCustomizerResult results = 1;</code>
   */
  com.google.ads.googleads.v15.services.MutateCustomerCustomizerResult getResults(int index);
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerCustomizerResult results = 1;</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerCustomizerResult results = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.MutateCustomerCustomizerResultOrBuilder> 
      getResultsOrBuilderList();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerCustomizerResult results = 1;</code>
   */
  com.google.ads.googleads.v15.services.MutateCustomerCustomizerResultOrBuilder getResultsOrBuilder(
      int index);

  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
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
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
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
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();
}
