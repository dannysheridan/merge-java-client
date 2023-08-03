package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccessRoleEnum {
    SUPER_ADMIN("SUPER_ADMIN"),

    ADMIN("ADMIN"),

    TEAM_MEMBER("TEAM_MEMBER"),

    LIMITED_TEAM_MEMBER("LIMITED_TEAM_MEMBER"),

    INTERVIEWER("INTERVIEWER");

    private final String value;

    AccessRoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}