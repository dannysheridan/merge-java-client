package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.time.OffsetDateTime;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = TimesheetEntryRequest.Builder.class)
public final class TimesheetEntryRequest {
    private final Optional<String> employee;

    private final Optional<Double> hoursWorked;

    private final Optional<OffsetDateTime> startTime;

    private final Optional<OffsetDateTime> endTime;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private TimesheetEntryRequest(
            Optional<String> employee,
            Optional<Double> hoursWorked,
            Optional<OffsetDateTime> startTime,
            Optional<OffsetDateTime> endTime,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams) {
        this.employee = employee;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
        this.endTime = endTime;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
    }

    /**
     * @return The employee the timesheet entry is for.
     */
    @JsonProperty("employee")
    public Optional<String> getEmployee() {
        return employee;
    }

    /**
     * @return The number of hours logged by the employee.
     */
    @JsonProperty("hours_worked")
    public Optional<Double> getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @return The time at which the employee started work.
     */
    @JsonProperty("start_time")
    public Optional<OffsetDateTime> getStartTime() {
        return startTime;
    }

    /**
     * @return The time at which the employee ended work.
     */
    @JsonProperty("end_time")
    public Optional<OffsetDateTime> getEndTime() {
        return endTime;
    }

    @JsonProperty("integration_params")
    public Optional<Map<String, JsonNode>> getIntegrationParams() {
        return integrationParams;
    }

    @JsonProperty("linked_account_params")
    public Optional<Map<String, JsonNode>> getLinkedAccountParams() {
        return linkedAccountParams;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof TimesheetEntryRequest && equalTo((TimesheetEntryRequest) other);
    }

    private boolean equalTo(TimesheetEntryRequest other) {
        return employee.equals(other.employee)
                && hoursWorked.equals(other.hoursWorked)
                && startTime.equals(other.startTime)
                && endTime.equals(other.endTime)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.employee,
                this.hoursWorked,
                this.startTime,
                this.endTime,
                this.integrationParams,
                this.linkedAccountParams);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> employee = Optional.empty();

        private Optional<Double> hoursWorked = Optional.empty();

        private Optional<OffsetDateTime> startTime = Optional.empty();

        private Optional<OffsetDateTime> endTime = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        private Builder() {}

        public Builder from(TimesheetEntryRequest other) {
            employee(other.getEmployee());
            hoursWorked(other.getHoursWorked());
            startTime(other.getStartTime());
            endTime(other.getEndTime());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
            return this;
        }

        @JsonSetter(value = "employee", nulls = Nulls.SKIP)
        public Builder employee(Optional<String> employee) {
            this.employee = employee;
            return this;
        }

        public Builder employee(String employee) {
            this.employee = Optional.of(employee);
            return this;
        }

        @JsonSetter(value = "hours_worked", nulls = Nulls.SKIP)
        public Builder hoursWorked(Optional<Double> hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder hoursWorked(Double hoursWorked) {
            this.hoursWorked = Optional.of(hoursWorked);
            return this;
        }

        @JsonSetter(value = "start_time", nulls = Nulls.SKIP)
        public Builder startTime(Optional<OffsetDateTime> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder startTime(OffsetDateTime startTime) {
            this.startTime = Optional.of(startTime);
            return this;
        }

        @JsonSetter(value = "end_time", nulls = Nulls.SKIP)
        public Builder endTime(Optional<OffsetDateTime> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder endTime(OffsetDateTime endTime) {
            this.endTime = Optional.of(endTime);
            return this;
        }

        @JsonSetter(value = "integration_params", nulls = Nulls.SKIP)
        public Builder integrationParams(Optional<Map<String, JsonNode>> integrationParams) {
            this.integrationParams = integrationParams;
            return this;
        }

        public Builder integrationParams(Map<String, JsonNode> integrationParams) {
            this.integrationParams = Optional.of(integrationParams);
            return this;
        }

        @JsonSetter(value = "linked_account_params", nulls = Nulls.SKIP)
        public Builder linkedAccountParams(Optional<Map<String, JsonNode>> linkedAccountParams) {
            this.linkedAccountParams = linkedAccountParams;
            return this;
        }

        public Builder linkedAccountParams(Map<String, JsonNode> linkedAccountParams) {
            this.linkedAccountParams = Optional.of(linkedAccountParams);
            return this;
        }

        public TimesheetEntryRequest build() {
            return new TimesheetEntryRequest(
                    employee, hoursWorked, startTime, endTime, integrationParams, linkedAccountParams);
        }
    }
}