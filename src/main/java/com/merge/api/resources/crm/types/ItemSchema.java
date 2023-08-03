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
@JsonDeserialize(builder = ItemSchema.Builder.class)
public final class ItemSchema {
    private final Optional<ItemTypeEnum> itemType;

    private final Optional<ItemFormatEnum> itemFormat;

    private final Optional<List<String>> itemChoices;

    private ItemSchema(
            Optional<ItemTypeEnum> itemType, Optional<ItemFormatEnum> itemFormat, Optional<List<String>> itemChoices) {
        this.itemType = itemType;
        this.itemFormat = itemFormat;
        this.itemChoices = itemChoices;
    }

    @JsonProperty("item_type")
    public Optional<ItemTypeEnum> getItemType() {
        return itemType;
    }

    @JsonProperty("item_format")
    public Optional<ItemFormatEnum> getItemFormat() {
        return itemFormat;
    }

    @JsonProperty("item_choices")
    public Optional<List<String>> getItemChoices() {
        return itemChoices;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ItemSchema && equalTo((ItemSchema) other);
    }

    private boolean equalTo(ItemSchema other) {
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
        return "ItemSchema{" + "itemType: " + itemType + ", itemFormat: " + itemFormat + ", itemChoices: " + itemChoices
                + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<ItemTypeEnum> itemType = Optional.empty();

        private Optional<ItemFormatEnum> itemFormat = Optional.empty();

        private Optional<List<String>> itemChoices = Optional.empty();

        private Builder() {}

        public Builder from(ItemSchema other) {
            itemType(other.getItemType());
            itemFormat(other.getItemFormat());
            itemChoices(other.getItemChoices());
            return this;
        }

        @JsonSetter(value = "item_type", nulls = Nulls.SKIP)
        public Builder itemType(Optional<ItemTypeEnum> itemType) {
            this.itemType = itemType;
            return this;
        }

        public Builder itemType(ItemTypeEnum itemType) {
            this.itemType = Optional.of(itemType);
            return this;
        }

        @JsonSetter(value = "item_format", nulls = Nulls.SKIP)
        public Builder itemFormat(Optional<ItemFormatEnum> itemFormat) {
            this.itemFormat = itemFormat;
            return this;
        }

        public Builder itemFormat(ItemFormatEnum itemFormat) {
            this.itemFormat = Optional.of(itemFormat);
            return this;
        }

        @JsonSetter(value = "item_choices", nulls = Nulls.SKIP)
        public Builder itemChoices(Optional<List<String>> itemChoices) {
            this.itemChoices = itemChoices;
            return this;
        }

        public Builder itemChoices(List<String> itemChoices) {
            this.itemChoices = Optional.of(itemChoices);
            return this;
        }

        public ItemSchema build() {
            return new ItemSchema(itemType, itemFormat, itemChoices);
        }
    }
}