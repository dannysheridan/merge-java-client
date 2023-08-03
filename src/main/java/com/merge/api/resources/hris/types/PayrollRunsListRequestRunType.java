package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PayrollRunsListRequestRunType {
    CORRECTION("CORRECTION"),

    OFF_CYCLE("OFF_CYCLE"),

    REGULAR("REGULAR"),

    SIGN_ON_BONUS("SIGN_ON_BONUS"),

    TERMINATION("TERMINATION");

    private final String value;

    PayrollRunsListRequestRunType(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
