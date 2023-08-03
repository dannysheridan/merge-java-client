package com.merge.api.resources.ticketing.types;

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
@JsonDeserialize(builder = Issue.Builder.class)
public final class Issue {
    private final Optional<String> id;

    private final Optional<IssueStatus> status;

    private final String errorDescription;

    private final Optional<Map<String, JsonNode>> endUser;

    private final Optional<OffsetDateTime> firstIncidentTime;

    private final Optional<OffsetDateTime> lastIncidentTime;

    private final Optional<Boolean> isMuted;

    private final Optional<List<String>> errorDetails;

    private Issue(
            Optional<String> id,
            Optional<IssueStatus> status,
            String errorDescription,
            Optional<Map<String, JsonNode>> endUser,
            Optional<OffsetDateTime> firstIncidentTime,
            Optional<OffsetDateTime> lastIncidentTime,
            Optional<Boolean> isMuted,
            Optional<List<String>> errorDetails) {
        this.id = id;
        this.status = status;
        this.errorDescription = errorDescription;
        this.endUser = endUser;
        this.firstIncidentTime = firstIncidentTime;
        this.lastIncidentTime = lastIncidentTime;
        this.isMuted = isMuted;
        this.errorDetails = errorDetails;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return Status of the issue. Options: ('ONGOING', 'RESOLVED')
     * <ul>
     * <li><code>ONGOING</code> - ONGOING</li>
     * <li><code>RESOLVED</code> - RESOLVED</li>
     * </ul>
     */
    @JsonProperty("status")
    public Optional<IssueStatus> getStatus() {
        return status;
    }

    @JsonProperty("error_description")
    public String getErrorDescription() {
        return errorDescription;
    }

    @JsonProperty("end_user")
    public Optional<Map<String, JsonNode>> getEndUser() {
        return endUser;
    }

    @JsonProperty("first_incident_time")
    public Optional<OffsetDateTime> getFirstIncidentTime() {
        return firstIncidentTime;
    }

    @JsonProperty("last_incident_time")
    public Optional<OffsetDateTime> getLastIncidentTime() {
        return lastIncidentTime;
    }

    @JsonProperty("is_muted")
    public Optional<Boolean> getIsMuted() {
        return isMuted;
    }

    @JsonProperty("error_details")
    public Optional<List<String>> getErrorDetails() {
        return errorDetails;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Issue && equalTo((Issue) other);
    }

    private boolean equalTo(Issue other) {
        return id.equals(other.id)
                && status.equals(other.status)
                && errorDescription.equals(other.errorDescription)
                && endUser.equals(other.endUser)
                && firstIncidentTime.equals(other.firstIncidentTime)
                && lastIncidentTime.equals(other.lastIncidentTime)
                && isMuted.equals(other.isMuted)
                && errorDetails.equals(other.errorDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.status,
                this.errorDescription,
                this.endUser,
                this.firstIncidentTime,
                this.lastIncidentTime,
                this.isMuted,
                this.errorDetails);
    }

    @Override
    public String toString() {
        return "Issue{" + "id: " + id + ", status: " + status + ", errorDescription: " + errorDescription
                + ", endUser: " + endUser + ", firstIncidentTime: " + firstIncidentTime + ", lastIncidentTime: "
                + lastIncidentTime + ", isMuted: " + isMuted + ", errorDetails: " + errorDetails + "}";
    }

    public static ErrorDescriptionStage builder() {
        return new Builder();
    }

    public interface ErrorDescriptionStage {
        _FinalStage errorDescription(String errorDescription);

        Builder from(Issue other);
    }

    public interface _FinalStage {
        Issue build();

        _FinalStage id(Optional<String> id);

        _FinalStage id(String id);

        _FinalStage status(Optional<IssueStatus> status);

        _FinalStage status(IssueStatus status);

        _FinalStage endUser(Optional<Map<String, JsonNode>> endUser);

        _FinalStage endUser(Map<String, JsonNode> endUser);

        _FinalStage firstIncidentTime(Optional<OffsetDateTime> firstIncidentTime);

        _FinalStage firstIncidentTime(OffsetDateTime firstIncidentTime);

        _FinalStage lastIncidentTime(Optional<OffsetDateTime> lastIncidentTime);

        _FinalStage lastIncidentTime(OffsetDateTime lastIncidentTime);

        _FinalStage isMuted(Optional<Boolean> isMuted);

        _FinalStage isMuted(Boolean isMuted);

        _FinalStage errorDetails(Optional<List<String>> errorDetails);

        _FinalStage errorDetails(List<String> errorDetails);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ErrorDescriptionStage, _FinalStage {
        private String errorDescription;

        private Optional<List<String>> errorDetails = Optional.empty();

        private Optional<Boolean> isMuted = Optional.empty();

        private Optional<OffsetDateTime> lastIncidentTime = Optional.empty();

        private Optional<OffsetDateTime> firstIncidentTime = Optional.empty();

        private Optional<Map<String, JsonNode>> endUser = Optional.empty();

        private Optional<IssueStatus> status = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(Issue other) {
            id(other.getId());
            status(other.getStatus());
            errorDescription(other.getErrorDescription());
            endUser(other.getEndUser());
            firstIncidentTime(other.getFirstIncidentTime());
            lastIncidentTime(other.getLastIncidentTime());
            isMuted(other.getIsMuted());
            errorDetails(other.getErrorDetails());
            return this;
        }

        @Override
        @JsonSetter("error_description")
        public _FinalStage errorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            return this;
        }

        @Override
        public _FinalStage errorDetails(List<String> errorDetails) {
            this.errorDetails = Optional.of(errorDetails);
            return this;
        }

        @Override
        @JsonSetter(value = "error_details", nulls = Nulls.SKIP)
        public _FinalStage errorDetails(Optional<List<String>> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }

        @Override
        public _FinalStage isMuted(Boolean isMuted) {
            this.isMuted = Optional.of(isMuted);
            return this;
        }

        @Override
        @JsonSetter(value = "is_muted", nulls = Nulls.SKIP)
        public _FinalStage isMuted(Optional<Boolean> isMuted) {
            this.isMuted = isMuted;
            return this;
        }

        @Override
        public _FinalStage lastIncidentTime(OffsetDateTime lastIncidentTime) {
            this.lastIncidentTime = Optional.of(lastIncidentTime);
            return this;
        }

        @Override
        @JsonSetter(value = "last_incident_time", nulls = Nulls.SKIP)
        public _FinalStage lastIncidentTime(Optional<OffsetDateTime> lastIncidentTime) {
            this.lastIncidentTime = lastIncidentTime;
            return this;
        }

        @Override
        public _FinalStage firstIncidentTime(OffsetDateTime firstIncidentTime) {
            this.firstIncidentTime = Optional.of(firstIncidentTime);
            return this;
        }

        @Override
        @JsonSetter(value = "first_incident_time", nulls = Nulls.SKIP)
        public _FinalStage firstIncidentTime(Optional<OffsetDateTime> firstIncidentTime) {
            this.firstIncidentTime = firstIncidentTime;
            return this;
        }

        @Override
        public _FinalStage endUser(Map<String, JsonNode> endUser) {
            this.endUser = Optional.of(endUser);
            return this;
        }

        @Override
        @JsonSetter(value = "end_user", nulls = Nulls.SKIP)
        public _FinalStage endUser(Optional<Map<String, JsonNode>> endUser) {
            this.endUser = endUser;
            return this;
        }

        /**
         * <p>Status of the issue. Options: ('ONGOING', 'RESOLVED')</p>
         * <ul>
         * <li><code>ONGOING</code> - ONGOING</li>
         * <li><code>RESOLVED</code> - RESOLVED</li>
         * </ul>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage status(IssueStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @Override
        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public _FinalStage status(Optional<IssueStatus> status) {
            this.status = status;
            return this;
        }

        @Override
        public _FinalStage id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @Override
        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public _FinalStage id(Optional<String> id) {
            this.id = id;
            return this;
        }

        @Override
        public Issue build() {
            return new Issue(
                    id, status, errorDescription, endUser, firstIncidentTime, lastIncidentTime, isMuted, errorDetails);
        }
    }
}