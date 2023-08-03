package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CategoryEnum {
    HRIS("hris"),

    ATS("ats"),

    ACCOUNTING("accounting"),

    TICKETING("ticketing"),

    CRM("crm"),

    MKTG("mktg"),

    FILESTORAGE("filestorage");

    private final String value;

    CategoryEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
