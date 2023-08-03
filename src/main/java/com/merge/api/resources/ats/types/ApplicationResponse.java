package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ApplicationResponse.Builder.class)
public final class ApplicationResponse {
    private final Application model;

    private final List<WarningValidationProblem> warnings;

    private final List<ErrorValidationProblem> errors;

    private final Optional<List<DebugModeLog>> logs;

    private ApplicationResponse(
            Application model,
            List<WarningValidationProblem> warnings,
            List<ErrorValidationProblem> errors,
            Optional<List<DebugModeLog>> logs) {
        this.model = model;
        this.warnings = warnings;
        this.errors = errors;
        this.logs = logs;
    }

    @JsonProperty("model")
    public Application getModel() {
        return model;
    }

    @JsonProperty("warnings")
    public List<WarningValidationProblem> getWarnings() {
        return warnings;
    }

    @JsonProperty("errors")
    public List<ErrorValidationProblem> getErrors() {
        return errors;
    }

    @JsonProperty("logs")
    public Optional<List<DebugModeLog>> getLogs() {
        return logs;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApplicationResponse && equalTo((ApplicationResponse) other);
    }

    private boolean equalTo(ApplicationResponse other) {
        return model.equals(other.model)
                && warnings.equals(other.warnings)
                && errors.equals(other.errors)
                && logs.equals(other.logs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.model, this.warnings, this.errors, this.logs);
    }

    @Override
    public String toString() {
        return "ApplicationResponse{" + "model: " + model + ", warnings: " + warnings + ", errors: " + errors
                + ", logs: " + logs + "}";
    }

    public static ModelStage builder() {
        return new Builder();
    }

    public interface ModelStage {
        _FinalStage model(Application model);

        Builder from(ApplicationResponse other);
    }

    public interface _FinalStage {
        ApplicationResponse build();

        _FinalStage warnings(List<WarningValidationProblem> warnings);

        _FinalStage addWarnings(WarningValidationProblem warnings);

        _FinalStage addAllWarnings(List<WarningValidationProblem> warnings);

        _FinalStage errors(List<ErrorValidationProblem> errors);

        _FinalStage addErrors(ErrorValidationProblem errors);

        _FinalStage addAllErrors(List<ErrorValidationProblem> errors);

        _FinalStage logs(Optional<List<DebugModeLog>> logs);

        _FinalStage logs(List<DebugModeLog> logs);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ModelStage, _FinalStage {
        private Application model;

        private Optional<List<DebugModeLog>> logs = Optional.empty();

        private List<ErrorValidationProblem> errors = new ArrayList<>();

        private List<WarningValidationProblem> warnings = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ApplicationResponse other) {
            model(other.getModel());
            warnings(other.getWarnings());
            errors(other.getErrors());
            logs(other.getLogs());
            return this;
        }

        @Override
        @JsonSetter("model")
        public _FinalStage model(Application model) {
            this.model = model;
            return this;
        }

        @Override
        public _FinalStage logs(List<DebugModeLog> logs) {
            this.logs = Optional.of(logs);
            return this;
        }

        @Override
        @JsonSetter(value = "logs", nulls = Nulls.SKIP)
        public _FinalStage logs(Optional<List<DebugModeLog>> logs) {
            this.logs = logs;
            return this;
        }

        @Override
        public _FinalStage addAllErrors(List<ErrorValidationProblem> errors) {
            this.errors.addAll(errors);
            return this;
        }

        @Override
        public _FinalStage addErrors(ErrorValidationProblem errors) {
            this.errors.add(errors);
            return this;
        }

        @Override
        @JsonSetter(value = "errors", nulls = Nulls.SKIP)
        public _FinalStage errors(List<ErrorValidationProblem> errors) {
            this.errors.clear();
            this.errors.addAll(errors);
            return this;
        }

        @Override
        public _FinalStage addAllWarnings(List<WarningValidationProblem> warnings) {
            this.warnings.addAll(warnings);
            return this;
        }

        @Override
        public _FinalStage addWarnings(WarningValidationProblem warnings) {
            this.warnings.add(warnings);
            return this;
        }

        @Override
        @JsonSetter(value = "warnings", nulls = Nulls.SKIP)
        public _FinalStage warnings(List<WarningValidationProblem> warnings) {
            this.warnings.clear();
            this.warnings.addAll(warnings);
            return this;
        }

        @Override
        public ApplicationResponse build() {
            return new ApplicationResponse(model, warnings, errors, logs);
        }
    }
}
