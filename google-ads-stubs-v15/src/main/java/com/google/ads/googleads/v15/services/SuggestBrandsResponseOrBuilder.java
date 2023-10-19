// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/brand_suggestion_service.proto

package com.google.ads.googleads.v15.services;

public interface SuggestBrandsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.SuggestBrandsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.BrandSuggestion brands = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.BrandSuggestion> 
      getBrandsList();
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.BrandSuggestion brands = 1;</code>
   */
  com.google.ads.googleads.v15.services.BrandSuggestion getBrands(int index);
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.BrandSuggestion brands = 1;</code>
   */
  int getBrandsCount();
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.BrandSuggestion brands = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.BrandSuggestionOrBuilder> 
      getBrandsOrBuilderList();
  /**
   * <pre>
   * Generated brand suggestions of verified brands for the given prefix.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.BrandSuggestion brands = 1;</code>
   */
  com.google.ads.googleads.v15.services.BrandSuggestionOrBuilder getBrandsOrBuilder(
      int index);
}
