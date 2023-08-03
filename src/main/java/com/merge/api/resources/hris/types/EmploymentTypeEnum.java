package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EmploymentTypeEnum {
    FULL_TIME("FULL_TIME"),

    PART_TIME("PART_TIME"),

    INTERN("INTERN"),

    CONTRACTOR("CONTRACTOR"),

    FREELANCE("FREELANCE");

    private final String value;

    EmploymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}