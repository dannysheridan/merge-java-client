package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum VeteranStatusEnum {
    I_AM_NOT_A_PROTECTED_VETERAN("I_AM_NOT_A_PROTECTED_VETERAN"),

    I_IDENTIFY_AS_ONE_OR_MORE_OF_THE_CLASSIFICATIONS_OF_A_PROTECTED_VETERAN(
            "I_IDENTIFY_AS_ONE_OR_MORE_OF_THE_CLASSIFICATIONS_OF_A_PROTECTED_VETERAN"),

    I_DONT_WISH_TO_ANSWER("I_DONT_WISH_TO_ANSWER");

    private final String value;

    VeteranStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}