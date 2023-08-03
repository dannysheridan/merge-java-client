package com.merge.api.resources.ats.applications.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.resources.ats.types.ApplicationRequest;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ApplicationEndpointRequest.Builder.class)
public final class ApplicationEndpointRequest {
    private final Optional<Boolean> isDebugMode;

    private final Optional<Boolean> runAsync;

    private final ApplicationRequest model;

    private final String remoteUserId;

    private ApplicationEndpointRequest(
            Optional<Boolean> isDebugMode, Optional<Boolean> runAsync, ApplicationRequest model, String remoteUserId) {
        this.isDebugMode = isDebugMode;
        this.runAsync = runAsync;
        this.model = model;
        this.remoteUserId = remoteUserId;
    }

    /**
     * @return Whether to include debug fields (such as log file links) in the response.
     */
    @JsonProperty("is_debug_mode")
    public Optional<Boolean> getIsDebugMode() {
        return isDebugMode;
    }

    /**
     * @return Whether or not third-party updates should be run asynchronously.
     */
    @JsonProperty("run_async")
    public Optional<Boolean> getRunAsync() {
        return runAsync;
    }

    @JsonProperty("model")
    public ApplicationRequest getModel() {
        return model;
    }

    @JsonProperty("remote_user_id")
    public String getRemoteUserId() {
        return remoteUserId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ApplicationEndpointRequest && equalTo((ApplicationEndpointRequest) other);
    }

    private boolean equalTo(ApplicationEndpointRequest other) {
        return isDebugMode.equals(other.isDebugMode)
                && runAsync.equals(other.runAsync)
                && model.equals(other.model)
                && remoteUserId.equals(other.remoteUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.isDebugMode, this.runAsync, this.model, this.remoteUserId);
    }

    @Override
    public String toString() {
        return "ApplicationEndpointRequest{" + "isDebugMode: " + isDebugMode + ", runAsync: " + runAsync + ", model: "
                + model + ", remoteUserId: " + remoteUserId + "}";
    }

    public static ModelStage builder() {
        return new Builder();
    }

    public interface ModelStage {
        RemoteUserIdStage model(ApplicationRequest model);

        Builder from(ApplicationEndpointRequest other);
    }

    public interface RemoteUserIdStage {
        _FinalStage remoteUserId(String remoteUserId);
    }

    public interface _FinalStage {
        ApplicationEndpointRequest build();

        _FinalStage isDebugMode(Optional<Boolean> isDebugMode);

        _FinalStage isDebugMode(Boolean isDebugMode);

        _FinalStage runAsync(Optional<Boolean> runAsync);

        _FinalStage runAsync(Boolean runAsync);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ModelStage, RemoteUserIdStage, _FinalStage {
        private ApplicationRequest model;

        private String remoteUserId;

        private Optional<Boolean> runAsync = Optional.empty();

        private Optional<Boolean> isDebugMode = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(ApplicationEndpointRequest other) {
            isDebugMode(other.getIsDebugMode());
            runAsync(other.getRunAsync());
            model(other.getModel());
            remoteUserId(other.getRemoteUserId());
            return this;
        }

        @Override
        @JsonSetter("model")
        public RemoteUserIdStage model(ApplicationRequest model) {
            this.model = model;
            return this;
        }

        @Override
        @JsonSetter("remote_user_id")
        public _FinalStage remoteUserId(String remoteUserId) {
            this.remoteUserId = remoteUserId;
            return this;
        }

        /**
         * <p>Whether or not third-party updates should be run asynchronously.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage runAsync(Boolean runAsync) {
            this.runAsync = Optional.of(runAsync);
            return this;
        }

        @Override
        @JsonSetter(value = "run_async", nulls = Nulls.SKIP)
        public _FinalStage runAsync(Optional<Boolean> runAsync) {
            this.runAsync = runAsync;
            return this;
        }

        /**
         * <p>Whether to include debug fields (such as log file links) in the response.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage isDebugMode(Boolean isDebugMode) {
            this.isDebugMode = Optional.of(isDebugMode);
            return this;
        }

        @Override
        @JsonSetter(value = "is_debug_mode", nulls = Nulls.SKIP)
        public _FinalStage isDebugMode(Optional<Boolean> isDebugMode) {
            this.isDebugMode = isDebugMode;
            return this;
        }

        @Override
        public ApplicationEndpointRequest build() {
            return new ApplicationEndpointRequest(isDebugMode, runAsync, model, remoteUserId);
        }
    }
}