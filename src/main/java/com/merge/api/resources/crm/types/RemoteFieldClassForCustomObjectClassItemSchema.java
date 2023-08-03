package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = RemoteFieldClassForCustomObjectClassItemSchema.Builder.class)
public final class RemoteFieldClassForCustomObjectClassItemSchema {
    private final Optional<String> itemType;

    private final Optional<String> itemFormat;

    private final Optional<List<Optional<String>>> itemChoices;

    private RemoteFieldClassForCustomObjectClassItemSchema(
            Optional<String> itemType, Optional<String> itemFormat, Optional<List<Optional<String>>> itemChoices) {
        this.itemType = itemType;
        this.itemFormat = itemFormat;
        this.itemChoices = itemChoices;
    }

    @JsonProperty("item_type")
    public Optional<String> getItemType() {
        return itemType;
    }

    @JsonProperty("item_format")
    public Optional<String> getItemFormat() {
        return itemFormat;
    }

    @JsonProperty("item_choices")
    public Optional<List<Optional<String>>> getItemChoices() {
        return itemChoices;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof RemoteFieldClassForCustomObjectClassItemSchema
                && equalTo((RemoteFieldClassForCustomObjectClassItemSchema) other);
    }

    private boolean equalTo(RemoteFieldClassForCustomObjectClassItemSchema other) {
        return itemType.equals(other.itemType)
                && itemFormat.equals(other.itemFormat)
                && itemChoices.equals(other.itemChoices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.itemType, this.itemFormat, this.itemChoices);
    }

    @Override
    public String toString() {
        return "RemoteFieldClassForCustomObjectClassItemSchema{" + "itemType: " + itemType + ", itemFormat: "
                + itemFormat + ", itemChoices: " + itemChoices + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> itemType = Optional.empty();

        private Optional<String> itemFormat = Optional.empty();

        private Optional<List<Optional<String>>> itemChoices = Optional.empty();

        private Builder() {}

        public Builder from(RemoteFieldClassForCustomObjectClassItemSchema other) {
            itemType(other.getItemType());
            itemFormat(other.getItemFormat());
            itemChoices(other.getItemChoices());
            return this;
        }

        @JsonSetter(value = "item_type", nulls = Nulls.SKIP)
        public Builder itemType(Optional<String> itemType) {
            this.itemType = itemType;
            return this;
        }

        public Builder itemType(String itemType) {
            this.itemType = Optional.of(itemType);
            return this;
        }

        @JsonSetter(value = "item_format", nulls = Nulls.SKIP)
        public Builder itemFormat(Optional<String> itemFormat) {
            this.itemFormat = itemFormat;
            return this;
        }

        public Builder itemFormat(String itemFormat) {
            this.itemFormat = Optional.of(itemFormat);
            return this;
        }

        @JsonSetter(value = "item_choices", nulls = Nulls.SKIP)
        public Builder itemChoices(Optional<List<Optional<String>>> itemChoices) {
            this.itemChoices = itemChoices;
            return this;
        }

        public Builder itemChoices(List<Optional<String>> itemChoices) {
            this.itemChoices = Optional.of(itemChoices);
            return this;
        }

        public RemoteFieldClassForCustomObjectClassItemSchema build() {
            return new RemoteFieldClassForCustomObjectClassItemSchema(itemType, itemFormat, itemChoices);
        }
    }
}