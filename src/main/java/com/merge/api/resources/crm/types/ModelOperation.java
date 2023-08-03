package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ModelOperation.Builder.class)
public final class ModelOperation {
    private final String modelName;

    private final List<String> availableOperations;

    private final List<String> requiredPostParameters;

    private final List<String> supportedFields;

    private ModelOperation(
            String modelName,
            List<String> availableOperations,
            List<String> requiredPostParameters,
            List<String> supportedFields) {
        this.modelName = modelName;
        this.availableOperations = availableOperations;
        this.requiredPostParameters = requiredPostParameters;
        this.supportedFields = supportedFields;
    }

    @JsonProperty("model_name")
    public String getModelName() {
        return modelName;
    }

    @JsonProperty("available_operations")
    public List<String> getAvailableOperations() {
        return availableOperations;
    }

    @JsonProperty("required_post_parameters")
    public List<String> getRequiredPostParameters() {
        return requiredPostParameters;
    }

    @JsonProperty("supported_fields")
    public List<String> getSupportedFields() {
        return supportedFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ModelOperation && equalTo((ModelOperation) other);
    }

    private boolean equalTo(ModelOperation other) {
        return modelName.equals(other.modelName)
                && availableOperations.equals(other.availableOperations)
                && requiredPostParameters.equals(other.requiredPostParameters)
                && supportedFields.equals(other.supportedFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.modelName, this.availableOperations, this.requiredPostParameters, this.supportedFields);
    }

    @Override
    public String toString() {
        return "ModelOperation{" + "modelName: " + modelName + ", availableOperations: " + availableOperations
                + ", requiredPostParameters: " + requiredPostParameters + ", supportedFields: " + supportedFields + "}";
    }

    public static ModelNameStage builder() {
        return new Builder();
    }

    public interface ModelNameStage {
        _FinalStage modelName(String modelName);

        Builder from(ModelOperation other);
    }

    public interface _FinalStage {
        ModelOperation build();

        _FinalStage availableOperations(List<String> availableOperations);

        _FinalStage addAvailableOperations(String availableOperations);

        _FinalStage addAllAvailableOperations(List<String> availableOperations);

        _FinalStage requiredPostParameters(List<String> requiredPostParameters);

        _FinalStage addRequiredPostParameters(String requiredPostParameters);

        _FinalStage addAllRequiredPostParameters(List<String> requiredPostParameters);

        _FinalStage supportedFields(List<String> supportedFields);

        _FinalStage addSupportedFields(String supportedFields);

        _FinalStage addAllSupportedFields(List<String> supportedFields);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ModelNameStage, _FinalStage {
        private String modelName;

        private List<String> supportedFields = new ArrayList<>();

        private List<String> requiredPostParameters = new ArrayList<>();

        private List<String> availableOperations = new ArrayList<>();

        private Builder() {}

        @Override
        public Builder from(ModelOperation other) {
            modelName(other.getModelName());
            availableOperations(other.getAvailableOperations());
            requiredPostParameters(other.getRequiredPostParameters());
            supportedFields(other.getSupportedFields());
            return this;
        }

        @Override
        @JsonSetter("model_name")
        public _FinalStage modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        @Override
        public _FinalStage addAllSupportedFields(List<String> supportedFields) {
            this.supportedFields.addAll(supportedFields);
            return this;
        }

        @Override
        public _FinalStage addSupportedFields(String supportedFields) {
            this.supportedFields.add(supportedFields);
            return this;
        }

        @Override
        @JsonSetter(value = "supported_fields", nulls = Nulls.SKIP)
        public _FinalStage supportedFields(List<String> supportedFields) {
            this.supportedFields.clear();
            this.supportedFields.addAll(supportedFields);
            return this;
        }

        @Override
        public _FinalStage addAllRequiredPostParameters(List<String> requiredPostParameters) {
            this.requiredPostParameters.addAll(requiredPostParameters);
            return this;
        }

        @Override
        public _FinalStage addRequiredPostParameters(String requiredPostParameters) {
            this.requiredPostParameters.add(requiredPostParameters);
            return this;
        }

        @Override
        @JsonSetter(value = "required_post_parameters", nulls = Nulls.SKIP)
        public _FinalStage requiredPostParameters(List<String> requiredPostParameters) {
            this.requiredPostParameters.clear();
            this.requiredPostParameters.addAll(requiredPostParameters);
            return this;
        }

        @Override
        public _FinalStage addAllAvailableOperations(List<String> availableOperations) {
            this.availableOperations.addAll(availableOperations);
            return this;
        }

        @Override
        public _FinalStage addAvailableOperations(String availableOperations) {
            this.availableOperations.add(availableOperations);
            return this;
        }

        @Override
        @JsonSetter(value = "available_operations", nulls = Nulls.SKIP)
        public _FinalStage availableOperations(List<String> availableOperations) {
            this.availableOperations.clear();
            this.availableOperations.addAll(availableOperations);
            return this;
        }

        @Override
        public ModelOperation build() {
            return new ModelOperation(modelName, availableOperations, requiredPostParameters, supportedFields);
        }
    }
}