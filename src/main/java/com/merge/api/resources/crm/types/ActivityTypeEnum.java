package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ActivityTypeEnum {
    CALL("CALL"),

    MEETING("MEETING"),

    EMAIL("EMAIL");

    private final String value;

    ActivityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}