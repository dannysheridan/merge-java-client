package com.merge.api.resources.ats.regeneratekey.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.core.ObjectMappers;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RemoteKeyForRegenerationRequest.Builder.class)
public final class RemoteKeyForRegenerationRequest {
    private final String name;

    private RemoteKeyForRegenerationRequest(String name) {
        this.name = name;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RemoteKeyForRegenerationRequest && equalTo((RemoteKeyForRegenerationRequest) other);
    }

    private boolean equalTo(RemoteKeyForRegenerationRequest other) {
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        _FinalStage name(String name);

        Builder from(RemoteKeyForRegenerationRequest other);
    }

    public interface _FinalStage {
        RemoteKeyForRegenerationRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, _FinalStage {
        private String name;

        private Builder() {}

        @Override
        public Builder from(RemoteKeyForRegenerationRequest other) {
            name(other.getName());
            return this;
        }

        @Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        @Override
        public RemoteKeyForRegenerationRequest build() {
            return new RemoteKeyForRegenerationRequest(name);
        }
    }
}
