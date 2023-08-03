package com.merge.api.resources.crm.leads.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.resources.crm.types.LeadsRetrieveRequestExpand;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = LeadsRetrieveRequest.Builder.class)
public final class LeadsRetrieveRequest {
    private final Optional<LeadsRetrieveRequestExpand> expand;

    private final Optional<Boolean> includeRemoteData;

    private final Optional<Boolean> includeRemoteFields;

    private LeadsRetrieveRequest(
            Optional<LeadsRetrieveRequestExpand> expand,
            Optional<Boolean> includeRemoteData,
            Optional<Boolean> includeRemoteFields) {
        this.expand = expand;
        this.includeRemoteData = includeRemoteData;
        this.includeRemoteFields = includeRemoteFields;
    }

    /**
     * @return Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
     */
    @JsonProperty("expand")
    public Optional<LeadsRetrieveRequestExpand> getExpand() {
        return expand;
    }

    /**
     * @return Whether to include the original data Merge fetched from the third-party to produce these models.
     */
    @JsonProperty("include_remote_data")
    public Optional<Boolean> getIncludeRemoteData() {
        return includeRemoteData;
    }

    /**
     * @return Whether to include all remote fields, including fields that Merge did not map to common models, in a normalized format.
     */
    @JsonProperty("include_remote_fields")
    public Optional<Boolean> getIncludeRemoteFields() {
        return includeRemoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof LeadsRetrieveRequest && equalTo((LeadsRetrieveRequest) other);
    }

    private boolean equalTo(LeadsRetrieveRequest other) {
        return expand.equals(other.expand)
                && includeRemoteData.equals(other.includeRemoteData)
                && includeRemoteFields.equals(other.includeRemoteFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.expand, this.includeRemoteData, this.includeRemoteFields);
    }

    @Override
    public String toString() {
        return "LeadsRetrieveRequest{" + "expand: " + expand + ", includeRemoteData: " + includeRemoteData
                + ", includeRemoteFields: " + includeRemoteFields + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<LeadsRetrieveRequestExpand> expand = Optional.empty();

        private Optional<Boolean> includeRemoteData = Optional.empty();

        private Optional<Boolean> includeRemoteFields = Optional.empty();

        private Builder() {}

        public Builder from(LeadsRetrieveRequest other) {
            expand(other.getExpand());
            includeRemoteData(other.getIncludeRemoteData());
            includeRemoteFields(other.getIncludeRemoteFields());
            return this;
        }

        @JsonSetter(value = "expand", nulls = Nulls.SKIP)
        public Builder expand(Optional<LeadsRetrieveRequestExpand> expand) {
            this.expand = expand;
            return this;
        }

        public Builder expand(LeadsRetrieveRequestExpand expand) {
            this.expand = Optional.of(expand);
            return this;
        }

        @JsonSetter(value = "include_remote_data", nulls = Nulls.SKIP)
        public Builder includeRemoteData(Optional<Boolean> includeRemoteData) {
            this.includeRemoteData = includeRemoteData;
            return this;
        }

        public Builder includeRemoteData(Boolean includeRemoteData) {
            this.includeRemoteData = Optional.of(includeRemoteData);
            return this;
        }

        @JsonSetter(value = "include_remote_fields", nulls = Nulls.SKIP)
        public Builder includeRemoteFields(Optional<Boolean> includeRemoteFields) {
            this.includeRemoteFields = includeRemoteFields;
            return this;
        }

        public Builder includeRemoteFields(Boolean includeRemoteFields) {
            this.includeRemoteFields = Optional.of(includeRemoteFields);
            return this;
        }

        public LeadsRetrieveRequest build() {
            return new LeadsRetrieveRequest(expand, includeRemoteData, includeRemoteFields);
        }
    }
}