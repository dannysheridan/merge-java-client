package com.merge.api.resources.hris.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TimesheetEntriesListRequestOrderBy {
    START_TIME_DESCENDING("-start_time"),

    START_TIME_ASCENDING("start_time");

    private final String value;

    TimesheetEntriesListRequestOrderBy(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
