package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LocationsListRequestLocationType {
    HOME("HOME"),

    WORK("WORK");

    private final String value;

    LocationsListRequestLocationType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
