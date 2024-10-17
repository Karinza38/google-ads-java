// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/criteria.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v18.common;

public interface ProductCategoryInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.common.ProductCategoryInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the product category.
   *
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436
   * </pre>
   *
   * <code>optional int64 category_id = 1;</code>
   * @return Whether the categoryId field is set.
   */
  boolean hasCategoryId();
  /**
   * <pre>
   * ID of the product category.
   *
   * This ID is equivalent to the google_product_category ID as described in
   * this article: https://support.google.com/merchants/answer/6324436
   * </pre>
   *
   * <code>optional int64 category_id = 1;</code>
   * @return The categoryId.
   */
  long getCategoryId();

  /**
   * <pre>
   * Level of the product category.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ProductCategoryLevelEnum.ProductCategoryLevel level = 2;</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <pre>
   * Level of the product category.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ProductCategoryLevelEnum.ProductCategoryLevel level = 2;</code>
   * @return The level.
   */
  com.google.ads.googleads.v18.enums.ProductCategoryLevelEnum.ProductCategoryLevel getLevel();
}
