/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v18.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class UserListCustomerTypeName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_USER_LIST_ID_SEMANTIC_LABEL =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/userListCustomerTypes/{user_list_id}~{semantic_label}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String userListId;
  private final String semanticLabel;

  @Deprecated
  protected UserListCustomerTypeName() {
    customerId = null;
    userListId = null;
    semanticLabel = null;
  }

  private UserListCustomerTypeName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    userListId = Preconditions.checkNotNull(builder.getUserListId());
    semanticLabel = Preconditions.checkNotNull(builder.getSemanticLabel());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getUserListId() {
    return userListId;
  }

  public String getSemanticLabel() {
    return semanticLabel;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static UserListCustomerTypeName of(
      String customerId, String userListId, String semanticLabel) {
    return newBuilder()
        .setCustomerId(customerId)
        .setUserListId(userListId)
        .setSemanticLabel(semanticLabel)
        .build();
  }

  public static String format(String customerId, String userListId, String semanticLabel) {
    return newBuilder()
        .setCustomerId(customerId)
        .setUserListId(userListId)
        .setSemanticLabel(semanticLabel)
        .build()
        .toString();
  }

  public static UserListCustomerTypeName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_USER_LIST_ID_SEMANTIC_LABEL.validatedMatch(
            formattedString, "UserListCustomerTypeName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("user_list_id"), matchMap.get("semantic_label"));
  }

  public static List<UserListCustomerTypeName> parseList(List<String> formattedStrings) {
    List<UserListCustomerTypeName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<UserListCustomerTypeName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (UserListCustomerTypeName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_USER_LIST_ID_SEMANTIC_LABEL.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (customerId != null) {
            fieldMapBuilder.put("customer_id", customerId);
          }
          if (userListId != null) {
            fieldMapBuilder.put("user_list_id", userListId);
          }
          if (semanticLabel != null) {
            fieldMapBuilder.put("semantic_label", semanticLabel);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return CUSTOMER_ID_USER_LIST_ID_SEMANTIC_LABEL.instantiate(
        "customer_id", customerId, "user_list_id", userListId, "semantic_label", semanticLabel);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      UserListCustomerTypeName that = ((UserListCustomerTypeName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.userListId, that.userListId)
          && Objects.equals(this.semanticLabel, that.semanticLabel);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(userListId);
    h *= 1000003;
    h ^= Objects.hashCode(semanticLabel);
    return h;
  }

  /** Builder for customers/{customer_id}/userListCustomerTypes/{user_list_id}~{semantic_label}. */
  public static class Builder {
    private String customerId;
    private String userListId;
    private String semanticLabel;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getUserListId() {
      return userListId;
    }

    public String getSemanticLabel() {
      return semanticLabel;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setUserListId(String userListId) {
      this.userListId = userListId;
      return this;
    }

    public Builder setSemanticLabel(String semanticLabel) {
      this.semanticLabel = semanticLabel;
      return this;
    }

    private Builder(UserListCustomerTypeName userListCustomerTypeName) {
      this.customerId = userListCustomerTypeName.customerId;
      this.userListId = userListCustomerTypeName.userListId;
      this.semanticLabel = userListCustomerTypeName.semanticLabel;
    }

    public UserListCustomerTypeName build() {
      return new UserListCustomerTypeName(this);
    }
  }
}
