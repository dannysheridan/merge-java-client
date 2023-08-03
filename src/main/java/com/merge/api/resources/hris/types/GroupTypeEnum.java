package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum GroupTypeEnum {
    TEAM("TEAM"),

    DEPARTMENT("DEPARTMENT"),

    COST_CENTER("COST_CENTER"),

    BUSINESS_UNIT("BUSINESS_UNIT"),

    GROUP("GROUP");

    private final String value;

    GroupTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
