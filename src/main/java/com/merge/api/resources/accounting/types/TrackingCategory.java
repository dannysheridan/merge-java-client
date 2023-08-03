package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TrackingCategory.Builder.class)
public final class TrackingCategory {
    private final Optional<String> name;

    private final Optional<TrackingCategoryStatus> status;

    private final Optional<TrackingCategoryCategoryType> categoryType;

    private final Optional<String> parentCategory;

    private final Optional<String> company;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private TrackingCategory(
            Optional<String> name,
            Optional<TrackingCategoryStatus> status,
            Optional<TrackingCategoryCategoryType> categoryType,
            Optional<String> parentCategory,
            Optional<String> company,
            Optional<Boolean> remoteWasDeleted,
            Optional<String> id,
            Optional<String> remoteId,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData) {
        this.name = name;
        this.status = status;
        this.categoryType = categoryType;
        this.parentCategory = parentCategory;
        this.company = company;
        this.remoteWasDeleted = remoteWasDeleted;
        this.id = id;
        this.remoteId = remoteId;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
    }

    /**
     * @return The tracking category's name.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return The tracking category's status.
     * <ul>
     * <li><code>ACTIVE</code> - ACTIVE</li>
     * <li><code>ARCHIVED</code> - ARCHIVED</li>
     * </ul>
     */
    @JsonProperty("status")
    public Optional<TrackingCategoryStatus> getStatus() {
        return status;
    }

    /**
     * @return The tracking category’s type.
     * <ul>
     * <li><code>CLASS</code> - CLASS</li>
     * <li><code>DEPARTMENT</code> - DEPARTMENT</li>
     * </ul>
     */
    @JsonProperty("category_type")
    public Optional<TrackingCategoryCategoryType> getCategoryType() {
        return categoryType;
    }

    /**
     * @return ID of the parent tracking category.
     */
    @JsonProperty("parent_category")
    public Optional<String> getParentCategory() {
        return parentCategory;
    }

    /**
     * @return The company the tracking category belongs to.
     */
    @JsonProperty("company")
    public Optional<String> getCompany() {
        return company;
    }

    /**
     * @return Indicates whether or not this object has been deleted by third party webhooks.
     */
    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("field_mappings")
    public Optional<Map<String, JsonNode>> getFieldMappings() {
        return fieldMappings;
    }

    @JsonProperty("remote_data")
    public Optional<List<RemoteData>> getRemoteData() {
        return remoteData;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TrackingCategory && equalTo((TrackingCategory) other);
    }

    private boolean equalTo(TrackingCategory other) {
        return name.equals(other.name)
                && status.equals(other.status)
                && categoryType.equals(other.categoryType)
                && parentCategory.equals(other.parentCategory)
                && company.equals(other.company)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && modifiedAt.equals(other.modifiedAt)
                && fieldMappings.equals(other.fieldMappings)
                && remoteData.equals(other.remoteData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.status,
                this.categoryType,
                this.parentCategory,
                this.company,
                this.remoteWasDeleted,
                this.id,
                this.remoteId,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData);
    }

    @Override
    public String toString() {
        return "TrackingCategory{" + "name: " + name + ", status: " + status + ", categoryType: " + categoryType
                + ", parentCategory: " + parentCategory + ", company: " + company + ", remoteWasDeleted: "
                + remoteWasDeleted + ", id: " + id + ", remoteId: " + remoteId + ", modifiedAt: " + modifiedAt
                + ", fieldMappings: " + fieldMappings + ", remoteData: " + remoteData + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Optional<TrackingCategoryStatus> status = Optional.empty();

        private Optional<TrackingCategoryCategoryType> categoryType = Optional.empty();

        private Optional<String> parentCategory = Optional.empty();

        private Optional<String> company = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Builder() {}

        public Builder from(TrackingCategory other) {
            name(other.getName());
            status(other.getStatus());
            categoryType(other.getCategoryType());
            parentCategory(other.getParentCategory());
            company(other.getCompany());
            remoteWasDeleted(other.getRemoteWasDeleted());
            id(other.getId());
            remoteId(other.getRemoteId());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<TrackingCategoryStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(TrackingCategoryStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "category_type", nulls = Nulls.SKIP)
        public Builder categoryType(Optional<TrackingCategoryCategoryType> categoryType) {
            this.categoryType = categoryType;
            return this;
        }

        public Builder categoryType(TrackingCategoryCategoryType categoryType) {
            this.categoryType = Optional.of(categoryType);
            return this;
        }

        @JsonSetter(value = "parent_category", nulls = Nulls.SKIP)
        public Builder parentCategory(Optional<String> parentCategory) {
            this.parentCategory = parentCategory;
            return this;
        }

        public Builder parentCategory(String parentCategory) {
            this.parentCategory = Optional.of(parentCategory);
            return this;
        }

        @JsonSetter(value = "company", nulls = Nulls.SKIP)
        public Builder company(Optional<String> company) {
            this.company = company;
            return this;
        }

        public Builder company(String company) {
            this.company = Optional.of(company);
            return this;
        }

        @JsonSetter(value = "remote_was_deleted", nulls = Nulls.SKIP)
        public Builder remoteWasDeleted(Optional<Boolean> remoteWasDeleted) {
            this.remoteWasDeleted = remoteWasDeleted;
            return this;
        }

        public Builder remoteWasDeleted(Boolean remoteWasDeleted) {
            this.remoteWasDeleted = Optional.of(remoteWasDeleted);
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
            return this;
        }

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.of(modifiedAt);
            return this;
        }

        @JsonSetter(value = "field_mappings", nulls = Nulls.SKIP)
        public Builder fieldMappings(Optional<Map<String, JsonNode>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(Map<String, JsonNode> fieldMappings) {
            this.fieldMappings = Optional.of(fieldMappings);
            return this;
        }

        @JsonSetter(value = "remote_data", nulls = Nulls.SKIP)
        public Builder remoteData(Optional<List<RemoteData>> remoteData) {
            this.remoteData = remoteData;
            return this;
        }

        public Builder remoteData(List<RemoteData> remoteData) {
            this.remoteData = Optional.of(remoteData);
            return this;
        }

        public TrackingCategory build() {
            return new TrackingCategory(
                    name,
                    status,
                    categoryType,
                    parentCategory,
                    company,
                    remoteWasDeleted,
                    id,
                    remoteId,
                    modifiedAt,
                    fieldMappings,
                    remoteData);
        }
    }
}