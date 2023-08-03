package com.merge.api.resources.ticketing.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UsersRetrieveRequestExpand {
    ROLES("roles"),

    TEAMS("teams"),

    TEAMS_ROLES("teams,roles");

    private final String value;

    UsersRetrieveRequestExpand(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
