package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum OffersListRequestExpand {
    APPLICATION("application"),

    APPLICATION_CREATOR("application,creator"),

    CREATOR("creator");

    private final String value;

    OffersListRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
