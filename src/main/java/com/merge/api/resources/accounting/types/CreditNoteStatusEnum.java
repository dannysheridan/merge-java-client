package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CreditNoteStatusEnum {
    SUBMITTED("SUBMITTED"),

    AUTHORIZED("AUTHORIZED"),

    PAID("PAID");

    private final String value;

    CreditNoteStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}