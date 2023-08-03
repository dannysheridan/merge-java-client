package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountTypeEnum {
    SAVINGS("SAVINGS"),

    CHECKING("CHECKING");

    private final String value;

    AccountTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}