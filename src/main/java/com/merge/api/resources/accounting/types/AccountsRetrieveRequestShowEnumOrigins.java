package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountsRetrieveRequestShowEnumOrigins {
    CLASSIFICATION("classification"),

    CLASSIFICATION_STATUS("classification,status"),

    STATUS("status");

    private final String value;

    AccountsRetrieveRequestShowEnumOrigins(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
