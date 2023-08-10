package com.merge.api.resources.crm.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Contact.Builder.class)
public final class Contact {
    private final Optional<String> firstName;

    private final Optional<String> lastName;

    private final Optional<ContactAccount> account;

    private final Optional<List<Address>> addresses;

    private final Optional<List<EmailAddress>> emailAddresses;

    private final Optional<List<PhoneNumber>> phoneNumbers;

    private final Optional<OffsetDateTime> lastActivityAt;

    private final Optional<OffsetDateTime> remoteCreatedAt;

    private final Optional<Boolean> remoteWasDeleted;

    private final Optional<String> id;

    private final Optional<String> remoteId;

    private final Optional<OffsetDateTime> modifiedAt;

    private final Optional<Map<String, JsonNode>> fieldMappings;

    private final Optional<List<RemoteData>> remoteData;

    private final Optional<List<RemoteField>> remoteFields;

    private Contact(
            Optional<String> firstName,
            Optional<String> lastName,
            Optional<ContactAccount> account,
            Optional<List<Address>> addresses,
            Optional<List<EmailAddress>> emailAddresses,
            Optional<List<PhoneNumber>> phoneNumbers,
            Optional<OffsetDateTime> lastActivityAt,
            Optional<OffsetDateTime> remoteCreatedAt,
            Optional<Boolean> remoteWasDeleted,
            Optional<String> id,
            Optional<String> remoteId,
            Optional<OffsetDateTime> modifiedAt,
            Optional<Map<String, JsonNode>> fieldMappings,
            Optional<List<RemoteData>> remoteData,
            Optional<List<RemoteField>> remoteFields) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
        this.addresses = addresses;
        this.emailAddresses = emailAddresses;
        this.phoneNumbers = phoneNumbers;
        this.lastActivityAt = lastActivityAt;
        this.remoteCreatedAt = remoteCreatedAt;
        this.remoteWasDeleted = remoteWasDeleted;
        this.id = id;
        this.remoteId = remoteId;
        this.modifiedAt = modifiedAt;
        this.fieldMappings = fieldMappings;
        this.remoteData = remoteData;
        this.remoteFields = remoteFields;
    }

    /**
     * @return The contact's first name.
     */
    @JsonProperty("first_name")
    public Optional<String> getFirstName() {
        return firstName;
    }

    /**
     * @return The contact's last name.
     */
    @JsonProperty("last_name")
    public Optional<String> getLastName() {
        return lastName;
    }

    /**
     * @return The contact's account.
     */
    @JsonProperty("account")
    public Optional<ContactAccount> getAccount() {
        return account;
    }

    @JsonProperty("addresses")
    public Optional<List<Address>> getAddresses() {
        return addresses;
    }

    @JsonProperty("email_addresses")
    public Optional<List<EmailAddress>> getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("phone_numbers")
    public Optional<List<PhoneNumber>> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * @return When the contact's last activity occurred.
     */
    @JsonProperty("last_activity_at")
    public Optional<OffsetDateTime> getLastActivityAt() {
        return lastActivityAt;
    }

    /**
     * @return When the third party's contact was created.
     */
    @JsonProperty("remote_created_at")
    public Optional<OffsetDateTime> getRemoteCreatedAt() {
        return remoteCreatedAt;
    }

    @JsonProperty("remote_was_deleted")
    public Optional<Boolean> getRemoteWasDeleted() {
        return remoteWasDeleted;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    /**
     * @return The third-party API ID of the matching object.
     */
    @JsonProperty("remote_id")
    public Optional<String> getRemoteId() {
        return remoteId;
    }

    /**
     * @return This is the datetime that this object was last updated by Merge
     */
    @JsonProperty("modified_at")
    public Optional<OffsetDateTime> getModifiedAt() {
        return modifiedAt;
    }

    @JsonProperty("field_mappings")
    public Optional<Map<String, JsonNode>> getFieldMappings() {
        return fieldMappings;
    }

    @JsonProperty("remote_data")
    public Optional<List<RemoteData>> getRemoteData() {
        return remoteData;
    }

    @JsonProperty("remote_fields")
    public Optional<List<RemoteField>> getRemoteFields() {
        return remoteFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Contact && equalTo((Contact) other);
    }

    private boolean equalTo(Contact other) {
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && account.equals(other.account)
                && addresses.equals(other.addresses)
                && emailAddresses.equals(other.emailAddresses)
                && phoneNumbers.equals(other.phoneNumbers)
                && lastActivityAt.equals(other.lastActivityAt)
                && remoteCreatedAt.equals(other.remoteCreatedAt)
                && remoteWasDeleted.equals(other.remoteWasDeleted)
                && id.equals(other.id)
                && remoteId.equals(other.remoteId)
                && modifiedAt.equals(other.modifiedAt)
                && fieldMappings.equals(other.fieldMappings)
                && remoteData.equals(other.remoteData)
                && remoteFields.equals(other.remoteFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.firstName,
                this.lastName,
                this.account,
                this.addresses,
                this.emailAddresses,
                this.phoneNumbers,
                this.lastActivityAt,
                this.remoteCreatedAt,
                this.remoteWasDeleted,
                this.id,
                this.remoteId,
                this.modifiedAt,
                this.fieldMappings,
                this.remoteData,
                this.remoteFields);
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName: " + firstName + ", lastName: " + lastName + ", account: " + account
                + ", addresses: " + addresses + ", emailAddresses: " + emailAddresses + ", phoneNumbers: "
                + phoneNumbers + ", lastActivityAt: " + lastActivityAt + ", remoteCreatedAt: " + remoteCreatedAt
                + ", remoteWasDeleted: " + remoteWasDeleted + ", id: " + id + ", remoteId: " + remoteId
                + ", modifiedAt: " + modifiedAt + ", fieldMappings: " + fieldMappings + ", remoteData: " + remoteData
                + ", remoteFields: " + remoteFields + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> firstName = Optional.empty();

        private Optional<String> lastName = Optional.empty();

        private Optional<ContactAccount> account = Optional.empty();

        private Optional<List<Address>> addresses = Optional.empty();

        private Optional<List<EmailAddress>> emailAddresses = Optional.empty();

        private Optional<List<PhoneNumber>> phoneNumbers = Optional.empty();

        private Optional<OffsetDateTime> lastActivityAt = Optional.empty();

        private Optional<OffsetDateTime> remoteCreatedAt = Optional.empty();

        private Optional<Boolean> remoteWasDeleted = Optional.empty();

        private Optional<String> id = Optional.empty();

        private Optional<String> remoteId = Optional.empty();

        private Optional<OffsetDateTime> modifiedAt = Optional.empty();

        private Optional<Map<String, JsonNode>> fieldMappings = Optional.empty();

        private Optional<List<RemoteData>> remoteData = Optional.empty();

        private Optional<List<RemoteField>> remoteFields = Optional.empty();

        private Builder() {}

        public Builder from(Contact other) {
            firstName(other.getFirstName());
            lastName(other.getLastName());
            account(other.getAccount());
            addresses(other.getAddresses());
            emailAddresses(other.getEmailAddresses());
            phoneNumbers(other.getPhoneNumbers());
            lastActivityAt(other.getLastActivityAt());
            remoteCreatedAt(other.getRemoteCreatedAt());
            remoteWasDeleted(other.getRemoteWasDeleted());
            id(other.getId());
            remoteId(other.getRemoteId());
            modifiedAt(other.getModifiedAt());
            fieldMappings(other.getFieldMappings());
            remoteData(other.getRemoteData());
            remoteFields(other.getRemoteFields());
            return this;
        }

        @JsonSetter(value = "first_name", nulls = Nulls.SKIP)
        public Builder firstName(Optional<String> firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = Optional.of(firstName);
            return this;
        }

        @JsonSetter(value = "last_name", nulls = Nulls.SKIP)
        public Builder lastName(Optional<String> lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = Optional.of(lastName);
            return this;
        }

        @JsonSetter(value = "account", nulls = Nulls.SKIP)
        public Builder account(Optional<ContactAccount> account) {
            this.account = account;
            return this;
        }

        public Builder account(ContactAccount account) {
            this.account = Optional.of(account);
            return this;
        }

        @JsonSetter(value = "addresses", nulls = Nulls.SKIP)
        public Builder addresses(Optional<List<Address>> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder addresses(List<Address> addresses) {
            this.addresses = Optional.of(addresses);
            return this;
        }

        @JsonSetter(value = "email_addresses", nulls = Nulls.SKIP)
        public Builder emailAddresses(Optional<List<EmailAddress>> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }

        public Builder emailAddresses(List<EmailAddress> emailAddresses) {
            this.emailAddresses = Optional.of(emailAddresses);
            return this;
        }

        @JsonSetter(value = "phone_numbers", nulls = Nulls.SKIP)
        public Builder phoneNumbers(Optional<List<PhoneNumber>> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder phoneNumbers(List<PhoneNumber> phoneNumbers) {
            this.phoneNumbers = Optional.of(phoneNumbers);
            return this;
        }

        @JsonSetter(value = "last_activity_at", nulls = Nulls.SKIP)
        public Builder lastActivityAt(Optional<OffsetDateTime> lastActivityAt) {
            this.lastActivityAt = lastActivityAt;
            return this;
        }

        public Builder lastActivityAt(OffsetDateTime lastActivityAt) {
            this.lastActivityAt = Optional.of(lastActivityAt);
            return this;
        }

        @JsonSetter(value = "remote_created_at", nulls = Nulls.SKIP)
        public Builder remoteCreatedAt(Optional<OffsetDateTime> remoteCreatedAt) {
            this.remoteCreatedAt = remoteCreatedAt;
            return this;
        }

        public Builder remoteCreatedAt(OffsetDateTime remoteCreatedAt) {
            this.remoteCreatedAt = Optional.of(remoteCreatedAt);
            return this;
        }

        @JsonSetter(value = "remote_was_deleted", nulls = Nulls.SKIP)
        public Builder remoteWasDeleted(Optional<Boolean> remoteWasDeleted) {
            this.remoteWasDeleted = remoteWasDeleted;
            return this;
        }

        public Builder remoteWasDeleted(Boolean remoteWasDeleted) {
            this.remoteWasDeleted = Optional.of(remoteWasDeleted);
            return this;
        }

        @JsonSetter(value = "id", nulls = Nulls.SKIP)
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(String id) {
            this.id = Optional.of(id);
            return this;
        }

        @JsonSetter(value = "remote_id", nulls = Nulls.SKIP)
        public Builder remoteId(Optional<String> remoteId) {
            this.remoteId = remoteId;
            return this;
        }

        public Builder remoteId(String remoteId) {
            this.remoteId = Optional.of(remoteId);
            return this;
        }

        @JsonSetter(value = "modified_at", nulls = Nulls.SKIP)
        public Builder modifiedAt(Optional<OffsetDateTime> modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder modifiedAt(OffsetDateTime modifiedAt) {
            this.modifiedAt = Optional.of(modifiedAt);
            return this;
        }

        @JsonSetter(value = "field_mappings", nulls = Nulls.SKIP)
        public Builder fieldMappings(Optional<Map<String, JsonNode>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder fieldMappings(Map<String, JsonNode> fieldMappings) {
            this.fieldMappings = Optional.of(fieldMappings);
            return this;
        }

        @JsonSetter(value = "remote_data", nulls = Nulls.SKIP)
        public Builder remoteData(Optional<List<RemoteData>> remoteData) {
            this.remoteData = remoteData;
            return this;
        }

        public Builder remoteData(List<RemoteData> remoteData) {
            this.remoteData = Optional.of(remoteData);
            return this;
        }

        @JsonSetter(value = "remote_fields", nulls = Nulls.SKIP)
        public Builder remoteFields(Optional<List<RemoteField>> remoteFields) {
            this.remoteFields = remoteFields;
            return this;
        }

        public Builder remoteFields(List<RemoteField> remoteFields) {
            this.remoteFields = Optional.of(remoteFields);
            return this;
        }

        public Contact build() {
            return new Contact(
                    firstName,
                    lastName,
                    account,
                    addresses,
                    emailAddresses,
                    phoneNumbers,
                    lastActivityAt,
                    remoteCreatedAt,
                    remoteWasDeleted,
                    id,
                    remoteId,
                    modifiedAt,
                    fieldMappings,
                    remoteData,
                    remoteFields);
        }
    }
}
