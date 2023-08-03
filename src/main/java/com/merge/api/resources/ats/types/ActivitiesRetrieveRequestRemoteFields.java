package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ActivitiesRetrieveRequestRemoteFields {
    ACTIVITY_TYPE("activity_type"),

    ACTIVITY_TYPE_VISIBILITY("activity_type,visibility"),

    VISIBILITY("visibility");

    private final String value;

    ActivitiesRetrieveRequestRemoteFields(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}