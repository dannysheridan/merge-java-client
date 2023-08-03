package com.merge.api.resources.accounting.accounts.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.merge.api.resources.accounting.types.AccountsRetrieveRequestRemoteFields;
import com.merge.api.resources.accounting.types.AccountsRetrieveRequestShowEnumOrigins;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccountsRetrieveRequest.Builder.class)
public final class AccountsRetrieveRequest {
    private final Optional<String> expand;

    private final Optional<Boolean> includeRemoteData;

    private final Optional<AccountsRetrieveRequestRemoteFields> remoteFields;

    private final Optional<AccountsRetrieveRequestShowEnumOrigins> showEnumOrigins;

    private AccountsRetrieveRequest(
            Optional<String> expand,
            Optional<Boolean> includeRemoteData,
            Optional<AccountsRetrieveRequestRemoteFields> remoteFields,
            Optional<AccountsRetrieveRequestShowEnumOrigins> showEnumOrigins) {
        this.expand = expand;
        this.includeRemoteData = includeRemoteData;
        this.remoteFields = remoteFields;
        this.showEnumOrigins = showEnumOrigins;
    }

    /**
     * @return Which relations should be returned in expanded form. Multiple relation names should be comma separated without spaces.
     */
    @JsonProperty("expand")
    public Optional<String> getExpand() {
        return expand;
    }

    /**
     * @return Whether to include the original data Merge fetched from the third-party to produce these models.
     */
    @JsonProperty("include_remote_data")
    public Optional<Boolean> getIncludeRemoteData() {
        return includeRemoteData;
    }

    /**
     * @return Deprecated. Use show_enum_origins.
     */
    @JsonProperty("remote_fields")
    public Optional<AccountsRetrieveRequestRemoteFields> getRemoteFields() {
        return remoteFields;
    }

    /**
     * @return Which fields should be returned in non-normalized form.
     */
    @JsonProperty("show_enum_origins")
    public Optional<AccountsRetrieveRequestShowEnumOrigins> getShowEnumOrigins() {
        return showEnumOrigins;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccountsRetrieveRequest && equalTo((AccountsRetrieveRequest) other);
    }

    private boolean equalTo(AccountsRetrieveRequest other) {
        return expand.equals(other.expand)
                && includeRemoteData.equals(other.includeRemoteData)
                && remoteFields.equals(other.remoteFields)
                && showEnumOrigins.equals(other.showEnumOrigins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.expand, this.includeRemoteData, this.remoteFields, this.showEnumOrigins);
    }

    @Override
    public String toString() {
        return "AccountsRetrieveRequest{" + "expand: " + expand + ", includeRemoteData: " + includeRemoteData
                + ", remoteFields: " + remoteFields + ", showEnumOrigins: " + showEnumOrigins + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> expand = Optional.empty();

        private Optional<Boolean> includeRemoteData = Optional.empty();

        private Optional<AccountsRetrieveRequestRemoteFields> remoteFields = Optional.empty();

        private Optional<AccountsRetrieveRequestShowEnumOrigins> showEnumOrigins = Optional.empty();

        private Builder() {}

        public Builder from(AccountsRetrieveRequest other) {
            expand(other.getExpand());
            includeRemoteData(other.getIncludeRemoteData());
            remoteFields(other.getRemoteFields());
            showEnumOrigins(other.getShowEnumOrigins());
            return this;
        }

        @JsonSetter(value = "expand", nulls = Nulls.SKIP)
        public Builder expand(Optional<String> expand) {
            this.expand = expand;
            return this;
        }

        public Builder expand(String expand) {
            this.expand = Optional.of(expand);
            return this;
        }

        @JsonSetter(value = "include_remote_data", nulls = Nulls.SKIP)
        public Builder includeRemoteData(Optional<Boolean> includeRemoteData) {
            this.includeRemoteData = includeRemoteData;
            return this;
        }

        public Builder includeRemoteData(Boolean includeRemoteData) {
            this.includeRemoteData = Optional.of(includeRemoteData);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<AccountsRetrieveRequestRemoteFields> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(AccountsRetrieveRequestRemoteFields remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        @JsonSetter(value = "show_enum_origins", nulls = Nulls.SKIP)
        public Builder showEnumOrigins(Optional<AccountsRetrieveRequestShowEnumOrigins> showEnumOrigins) {
            this.showEnumOrigins = showEnumOrigins;
            return this;
        }

        public Builder showEnumOrigins(AccountsRetrieveRequestShowEnumOrigins showEnumOrigins) {
            this.showEnumOrigins = Optional.of(showEnumOrigins);
            return this;
        }

        public AccountsRetrieveRequest build() {
            return new AccountsRetrieveRequest(expand, includeRemoteData, remoteFields, showEnumOrigins);
        }
    }
}