package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum IssuesListRequestStatus {
    ONGOING("ONGOING"),

    RESOLVED("RESOLVED");

    private final String value;

    IssuesListRequestStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
