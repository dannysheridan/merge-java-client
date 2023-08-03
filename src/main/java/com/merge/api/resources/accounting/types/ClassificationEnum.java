package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ClassificationEnum {
    ASSET("ASSET"),

    EQUITY("EQUITY"),

    EXPENSE("EXPENSE"),

    LIABILITY("LIABILITY"),

    REVENUE("REVENUE");

    private final String value;

    ClassificationEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}