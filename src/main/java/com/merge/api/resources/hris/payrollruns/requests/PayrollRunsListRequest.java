package com.merge.api.resources.hris.payrollruns.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.resources.hris.types.PayrollRunsListRequestRemoteFields;
import com.merge.api.resources.hris.types.PayrollRunsListRequestRunType;
import com.merge.api.resources.hris.types.PayrollRunsListRequestShowEnumOrigins;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = PayrollRunsListRequest.Builder.class)
public final class PayrollRunsListRequest {
    private final Optional<OffsetDateTime> createdAfter;

    private final Optional<OffsetDateTime> createdBefore;

    private final Optional<String> cursor;

    private final Optional<OffsetDateTime> endedAfter;

    private final Optional<OffsetDateTime> endedBefore;

    private final Optional<Boolean> includeDeletedData;

    private final Optional<Boolean> includeRemoteData;

    private final Optional<OffsetDateTime> modifiedAfter;

    private final Optional<OffsetDateTime> modifiedBefore;

    private final Optional<Integer> pageSize;

    private final Optional<PayrollRunsListRequestRemoteFields> remoteFields;

    private final Optional<String> remoteId;

    private final Optional<PayrollRunsListRequestRunType> runType;

    private final Optional<PayrollRunsListRequestShowEnumOrigins> showEnumOrigins;

    private final Optional<OffsetDateTime> startedAfter;

    private final Optional<OffsetDateTime> startedBefore;

    private PayrollRunsListRequest(
            Optional<OffsetDateTime> createdAfter,
            Optional<OffsetDateTime> createdBefore,
            Optional<String> cursor,
            Optional<OffsetDateTime> endedAfter,
            Optional<OffsetDateTime> endedBefore,
            Optional<Boolean> includeDeletedData,
            Optional<Boolean> includeRemoteData,
            Optional<OffsetDateTime> modifiedAfter,
            Optional<OffsetDateTime> modifiedBefore,
            Optional<Integer> pageSize,
            Optional<PayrollRunsListRequestRemoteFields> remoteFields,
            Optional<String> remoteId,
            Optional<PayrollRunsListRequestRunType> runType,
            Optional<PayrollRunsListRequestShowEnumOrigins> showEnumOrigins,
            Optional<OffsetDateTime> startedAfter,
            Optional<OffsetDateTime> startedBefore) {
        this.createdAfter = createdAfter;
        this.createdBefore = createdBefore;
        this.cursor = cursor;
        this.endedAfter = endedAfter;
        this.endedBefore = endedBefore;
        this.includeDeletedData = includeDeletedData;
        this.includeRemoteData = includeRemoteData;
        this.modifiedAfter = modifiedAfter;
        this.modifiedBefore = modifiedBefore;
        this.pageSize = pageSize;
        this.remoteFields = remoteFields;
        this.remoteId = remoteId;
        this.runType = runType;
        this.showEnumOrigins = showEnumOrigins;
        this.startedAfter = startedAfter;
        this.startedBefore = startedBefore;
    }

    /**
     * @return If provided, will only return objects created after this datetime.
     */
    @JsonProperty("created_after")
    public Optional<OffsetDateTime> getCreatedAfter() {
        return createdAfter;
    }

    /**
     * @return If provided, will only return objects created before this datetime.
     */
    @JsonProperty("created_before")
    public Optional<OffsetDateTime> getCreatedBefore() {
        return createdBefore;
    }

    /**
     * @return The pagination cursor value.
     */
    @JsonProperty("cursor")
    public Optional<String> getCursor() {
        return cursor;
    }

    /**
     * @return If provided, will only return payroll runs ended after this datetime.
     */
    @JsonProperty("ended_after")
    public Optional<OffsetDateTime> getEndedAfter() {
        return endedAfter;
    }

    /**
     * @return If provided, will only return payroll runs ended before this datetime.
     */
    @JsonProperty("ended_before")
    public Optional<OffsetDateTime> getEndedBefore() {
        return endedBefore;
    }

    /**
     * @return Whether to include data that was marked as deleted by third party webhooks.
     */
    @JsonProperty("include_deleted_data")
    public Optional<Boolean> getIncludeDeletedData() {
        return includeDeletedData;
    }

    /**
     * @return Whether to include the original data Merge fetched from the third-party to produce these models.
     */
    @JsonProperty("include_remote_data")
    public Optional<Boolean> getIncludeRemoteData() {
        return includeRemoteData;
    }

    /**
     * @return If provided, only objects synced by Merge after this date time will be returned.
     */
    @JsonProperty("modified_after")
    public Optional<OffsetDateTime> getModifiedAfter() {
        return modifiedAfter;
    }

    /**
     * @return If provided, only objects synced by Merge before this date time will be returned.
     */
    @JsonProperty("modified_before")
    public Optional<OffsetDateTime> getModifiedBefore() {
        return modifiedBefore;
    }

    /**
     * @return Number of results to return per page.
     */
    @JsonProperty("page_size")
    public Optional<Integer> getPageSize() {
        return pageSize;
    }

    /**
     * @return Deprecated. Use show_enum_origins.
     */
    @JsonProperty("remote_fields")
    public Optional<PayrollRunsListRequestRemoteFields> getRemoteFields() {
        return remoteFields;
    }

    /**
     * @return The API provider's ID for the given object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return If provided, will only return PayrollRun's with this status. Options: ('REGULAR', 'OFF_CYCLE', 'CORRECTION', 'TERMINATION', 'SIGN_ON_BONUS')
     * <ul>
     * <li><code>REGULAR</code> - REGULAR</li>
     * <li><code>OFF_CYCLE</code> - OFF_CYCLE</li>
     * <li><code>CORRECTION</code> - CORRECTION</li>
     * <li><code>TERMINATION</code> - TERMINATION</li>
     * <li><code>SIGN_ON_BONUS</code> - SIGN_ON_BONUS</li>
     * </ul>
     */
    @JsonProperty("run_type")
    public Optional<PayrollRunsListRequestRunType> getRunType() {
        return runType;
    }

    /**
     * @return Which fields should be returned in non-normalized form.
     */
    @JsonProperty("show_enum_origins")
    public Optional<PayrollRunsListRequestShowEnumOrigins> getShowEnumOrigins() {
        return showEnumOrigins;
    }

    /**
     * @return If provided, will only return payroll runs started after this datetime.
     */
    @JsonProperty("started_after")
    public Optional<OffsetDateTime> getStartedAfter() {
        return startedAfter;
    }

    /**
     * @return If provided, will only return payroll runs started before this datetime.
     */
    @JsonProperty("started_before")
    public Optional<OffsetDateTime> getStartedBefore() {
        return startedBefore;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof PayrollRunsListRequest && equalTo((PayrollRunsListRequest) other);
    }

    private boolean equalTo(PayrollRunsListRequest other) {
        return createdAfter.equals(other.createdAfter)
                && createdBefore.equals(other.createdBefore)
                && cursor.equals(other.cursor)
                && endedAfter.equals(other.endedAfter)
                && endedBefore.equals(other.endedBefore)
                && includeDeletedData.equals(other.includeDeletedData)
                && includeRemoteData.equals(other.includeRemoteData)
                && modifiedAfter.equals(other.modifiedAfter)
                && modifiedBefore.equals(other.modifiedBefore)
                && pageSize.equals(other.pageSize)
                && remoteFields.equals(other.remoteFields)
                && remoteId.equals(other.remoteId)
                && runType.equals(other.runType)
                && showEnumOrigins.equals(other.showEnumOrigins)
                && startedAfter.equals(other.startedAfter)
                && startedBefore.equals(other.startedBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.createdAfter,
                this.createdBefore,
                this.cursor,
                this.endedAfter,
                this.endedBefore,
                this.includeDeletedData,
                this.includeRemoteData,
                this.modifiedAfter,
                this.modifiedBefore,
                this.pageSize,
                this.remoteFields,
                this.remoteId,
                this.runType,
                this.showEnumOrigins,
                this.startedAfter,
                this.startedBefore);
    }

    @Override
    public String toString() {
        return "PayrollRunsListRequest{" + "createdAfter: " + createdAfter + ", createdBefore: " + createdBefore
                + ", cursor: " + cursor + ", endedAfter: " + endedAfter + ", endedBefore: " + endedBefore
                + ", includeDeletedData: " + includeDeletedData + ", includeRemoteData: " + includeRemoteData
                + ", modifiedAfter: " + modifiedAfter + ", modifiedBefore: " + modifiedBefore + ", pageSize: "
                + pageSize + ", remoteFields: " + remoteFields + ", remoteId: " + remoteId + ", runType: " + runType
                + ", showEnumOrigins: " + showEnumOrigins + ", startedAfter: " + startedAfter + ", startedBefore: "
                + startedBefore + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<OffsetDateTime> createdAfter = Optional.empty();

        private Optional<OffsetDateTime> createdBefore = Optional.empty();

        private Optional<String> cursor = Optional.empty();

        private Optional<OffsetDateTime> endedAfter = Optional.empty();

        private Optional<OffsetDateTime> endedBefore = Optional.empty();

        private Optional<Boolean> includeDeletedData = Optional.empty();

        private Optional<Boolean> includeRemoteData = Optional.empty();

        private Optional<OffsetDateTime> modifiedAfter = Optional.empty();

        private Optional<OffsetDateTime> modifiedBefore = Optional.empty();

        private Optional<Integer> pageSize = Optional.empty();

        private Optional<PayrollRunsListRequestRemoteFields> remoteFields = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<PayrollRunsListRequestRunType> runType = Optional.empty();

        private Optional<PayrollRunsListRequestShowEnumOrigins> showEnumOrigins = Optional.empty();

        private Optional<OffsetDateTime> startedAfter = Optional.empty();

        private Optional<OffsetDateTime> startedBefore = Optional.empty();

        private Builder() {}

        public Builder from(PayrollRunsListRequest other) {
            createdAfter(other.getCreatedAfter());
            createdBefore(other.getCreatedBefore());
            cursor(other.getCursor());
            endedAfter(other.getEndedAfter());
            endedBefore(other.getEndedBefore());
            includeDeletedData(other.getIncludeDeletedData());
            includeRemoteData(other.getIncludeRemoteData());
            modifiedAfter(other.getModifiedAfter());
            modifiedBefore(other.getModifiedBefore());
            pageSize(other.getPageSize());
            remoteFields(other.getRemoteFields());
            remoteId(other.getRemoteId());
            runType(other.getRunType());
            showEnumOrigins(other.getShowEnumOrigins());
            startedAfter(other.getStartedAfter());
            startedBefore(other.getStartedBefore());
            return this;
        }

        @JsonSetter(value = "created_after", nulls = Nulls.SKIP)
        public Builder createdAfter(Optional<OffsetDateTime> createdAfter) {
            this.createdAfter = createdAfter;
            return this;
        }

        public Builder createdAfter(OffsetDateTime createdAfter) {
            this.createdAfter = Optional.of(createdAfter);
            return this;
        }

        @JsonSetter(value = "created_before", nulls = Nulls.SKIP)
        public Builder createdBefore(Optional<OffsetDateTime> createdBefore) {
            this.createdBefore = createdBefore;
            return this;
        }

        public Builder createdBefore(OffsetDateTime createdBefore) {
            this.createdBefore = Optional.of(createdBefore);
            return this;
        }

        @JsonSetter(value = "cursor", nulls = Nulls.SKIP)
        public Builder cursor(Optional<String> cursor) {
            this.cursor = cursor;
            return this;
        }

        public Builder cursor(String cursor) {
            this.cursor = Optional.of(cursor);
            return this;
        }

        @JsonSetter(value = "ended_after", nulls = Nulls.SKIP)
        public Builder endedAfter(Optional<OffsetDateTime> endedAfter) {
            this.endedAfter = endedAfter;
            return this;
        }

        public Builder endedAfter(OffsetDateTime endedAfter) {
            this.endedAfter = Optional.of(endedAfter);
            return this;
        }

        @JsonSetter(value = "ended_before", nulls = Nulls.SKIP)
        public Builder endedBefore(Optional<OffsetDateTime> endedBefore) {
            this.endedBefore = endedBefore;
            return this;
        }

        public Builder endedBefore(OffsetDateTime endedBefore) {
            this.endedBefore = Optional.of(endedBefore);
            return this;
        }

        @JsonSetter(value = "include_deleted_data", nulls = Nulls.SKIP)
        public Builder includeDeletedData(Optional<Boolean> includeDeletedData) {
            this.includeDeletedData = includeDeletedData;
            return this;
        }

        public Builder includeDeletedData(Boolean includeDeletedData) {
            this.includeDeletedData = Optional.of(includeDeletedData);
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

        @JsonSetter(value = "modified_after", nulls = Nulls.SKIP)
        public Builder modifiedAfter(Optional<OffsetDateTime> modifiedAfter) {
            this.modifiedAfter = modifiedAfter;
            return this;
        }

        public Builder modifiedAfter(OffsetDateTime modifiedAfter) {
            this.modifiedAfter = Optional.of(modifiedAfter);
            return this;
        }

        @JsonSetter(value = "modified_before", nulls = Nulls.SKIP)
        public Builder modifiedBefore(Optional<OffsetDateTime> modifiedBefore) {
            this.modifiedBefore = modifiedBefore;
            return this;
        }

        public Builder modifiedBefore(OffsetDateTime modifiedBefore) {
            this.modifiedBefore = Optional.of(modifiedBefore);
            return this;
        }

        @JsonSetter(value = "page_size", nulls = Nulls.SKIP)
        public Builder pageSize(Optional<Integer> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            this.pageSize = Optional.of(pageSize);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<PayrollRunsListRequestRemoteFields> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(PayrollRunsListRequestRemoteFields remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
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

        @JsonSetter(value = "run_type", nulls = Nulls.SKIP)
        public Builder runType(Optional<PayrollRunsListRequestRunType> runType) {
            this.runType = runType;
            return this;
        }

        public Builder runType(PayrollRunsListRequestRunType runType) {
            this.runType = Optional.of(runType);
            return this;
        }

        @JsonSetter(value = "show_enum_origins", nulls = Nulls.SKIP)
        public Builder showEnumOrigins(Optional<PayrollRunsListRequestShowEnumOrigins> showEnumOrigins) {
            this.showEnumOrigins = showEnumOrigins;
            return this;
        }

        public Builder showEnumOrigins(PayrollRunsListRequestShowEnumOrigins showEnumOrigins) {
            this.showEnumOrigins = Optional.of(showEnumOrigins);
            return this;
        }

        @JsonSetter(value = "started_after", nulls = Nulls.SKIP)
        public Builder startedAfter(Optional<OffsetDateTime> startedAfter) {
            this.startedAfter = startedAfter;
            return this;
        }

        public Builder startedAfter(OffsetDateTime startedAfter) {
            this.startedAfter = Optional.of(startedAfter);
            return this;
        }

        @JsonSetter(value = "started_before", nulls = Nulls.SKIP)
        public Builder startedBefore(Optional<OffsetDateTime> startedBefore) {
            this.startedBefore = startedBefore;
            return this;
        }

        public Builder startedBefore(OffsetDateTime startedBefore) {
            this.startedBefore = Optional.of(startedBefore);
            return this;
        }

        public PayrollRunsListRequest build() {
            return new PayrollRunsListRequest(
                    createdAfter,
                    createdBefore,
                    cursor,
                    endedAfter,
                    endedBefore,
                    includeDeletedData,
                    includeRemoteData,
                    modifiedAfter,
                    modifiedBefore,
                    pageSize,
                    remoteFields,
                    remoteId,
                    runType,
                    showEnumOrigins,
                    startedAfter,
                    startedBefore);
        }
    }
}