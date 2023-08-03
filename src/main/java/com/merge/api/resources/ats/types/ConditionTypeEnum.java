package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ConditionTypeEnum {
    BOOLEAN("BOOLEAN"),

    DATE("DATE"),

    DATE_TIME("DATE_TIME"),

    INTEGER("INTEGER"),

    FLOAT("FLOAT"),

    STRING("STRING"),

    LIST_OF_STRINGS("LIST_OF_STRINGS");

    private final String value;

    ConditionTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
