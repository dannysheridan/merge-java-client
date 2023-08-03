package com.merge.api.resources.accounting.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = ContactRequest.Builder.class)
public final class ContactRequest {
    private final Optional<String> name;

    private final Optional<Boolean> isSupplier;

    private final Optional<Boolean> isCustomer;

    private final Optional<String> emailAddress;

    private final Optional<String> taxNumber;

    private final Optional<ContactRequestStatus> status;

    private final Optional<String> currency;

    private final Optional<String> company;

    private final Optional<List<Optional<String>>> addresses;

    private final Optional<List<AccountingPhoneNumberRequest>> phoneNumbers;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private ContactRequest(
            Optional<String> name,
            Optional<Boolean> isSupplier,
            Optional<Boolean> isCustomer,
            Optional<String> emailAddress,
            Optional<String> taxNumber,
            Optional<ContactRequestStatus> status,
            Optional<String> currency,
            Optional<String> company,
            Optional<List<Optional<String>>> addresses,
            Optional<List<AccountingPhoneNumberRequest>> phoneNumbers,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams) {
        this.name = name;
        this.isSupplier = isSupplier;
        this.isCustomer = isCustomer;
        this.emailAddress = emailAddress;
        this.taxNumber = taxNumber;
        this.status = status;
        this.currency = currency;
        this.company = company;
        this.addresses = addresses;
        this.phoneNumbers = phoneNumbers;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
    }

    /**
     * @return The contact's name.
     */
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    /**
     * @return Whether the contact is a supplier.
     */
    @JsonProperty("is_supplier")
    public Optional<Boolean> getIsSupplier() {
        return isSupplier;
    }

    /**
     * @return Whether the contact is a customer.
     */
    @JsonProperty("is_customer")
    public Optional<Boolean> getIsCustomer() {
        return isCustomer;
    }

    /**
     * @return The contact's email address.
     */
    @JsonProperty("email_address")
    public Optional<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * @return The contact's tax number.
     */
    @JsonProperty("tax_number")
    public Optional<String> getTaxNumber() {
        return taxNumber;
    }

    /**
     * @return The contact's status
     * <ul>
     * <li><code>ACTIVE</code> - ACTIVE</li>
     * <li><code>ARCHIVED</code> - ARCHIVED</li>
     * </ul>
     */
    @JsonProperty("status")
    public Optional<ContactRequestStatus> getStatus() {
        return status;
    }

    /**
     * @return The currency the contact's transactions are in.
     */
    @JsonProperty("currency")
    public Optional<String> getCurrency() {
        return currency;
    }

    /**
     * @return The company the contact belongs to.
     */
    @JsonProperty("company")
    public Optional<String> getCompany() {
        return company;
    }

    /**
     * @return <code>Address</code> object IDs for the given <code>Contacts</code> object.
     */
    @JsonProperty("addresses")
    public Optional<List<Optional<String>>> getAddresses() {
        return addresses;
    }

    /**
     * @return <code>AccountingPhoneNumber</code> object for the given <code>Contacts</code> object.
     */
    @JsonProperty("phone_numbers")
    public Optional<List<AccountingPhoneNumberRequest>> getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("integration_params")
    public Optional<Map<String, JsonNode>> getIntegrationParams() {
        return integrationParams;
    }

    @JsonProperty("linked_account_params")
    public Optional<Map<String, JsonNode>> getLinkedAccountParams() {
        return linkedAccountParams;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof ContactRequest && equalTo((ContactRequest) other);
    }

    private boolean equalTo(ContactRequest other) {
        return name.equals(other.name)
                && isSupplier.equals(other.isSupplier)
                && isCustomer.equals(other.isCustomer)
                && emailAddress.equals(other.emailAddress)
                && taxNumber.equals(other.taxNumber)
                && status.equals(other.status)
                && currency.equals(other.currency)
                && company.equals(other.company)
                && addresses.equals(other.addresses)
                && phoneNumbers.equals(other.phoneNumbers)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.isSupplier,
                this.isCustomer,
                this.emailAddress,
                this.taxNumber,
                this.status,
                this.currency,
                this.company,
                this.addresses,
                this.phoneNumbers,
                this.integrationParams,
                this.linkedAccountParams);
    }

    @Override
    public String toString() {
        return "ContactRequest{" + "name: " + name + ", isSupplier: " + isSupplier + ", isCustomer: " + isCustomer
                + ", emailAddress: " + emailAddress + ", taxNumber: " + taxNumber + ", status: " + status
                + ", currency: " + currency + ", company: " + company + ", addresses: " + addresses + ", phoneNumbers: "
                + phoneNumbers + ", integrationParams: " + integrationParams + ", linkedAccountParams: "
                + linkedAccountParams + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> name = Optional.empty();

        private Optional<Boolean> isSupplier = Optional.empty();

        private Optional<Boolean> isCustomer = Optional.empty();

        private Optional<String> emailAddress = Optional.empty();

        private Optional<String> taxNumber = Optional.empty();

        private Optional<ContactRequestStatus> status = Optional.empty();

        private Optional<String> currency = Optional.empty();

        private Optional<String> company = Optional.empty();

        private Optional<List<Optional<String>>> addresses = Optional.empty();

        private Optional<List<AccountingPhoneNumberRequest>> phoneNumbers = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        private Builder() {}

        public Builder from(ContactRequest other) {
            name(other.getName());
            isSupplier(other.getIsSupplier());
            isCustomer(other.getIsCustomer());
            emailAddress(other.getEmailAddress());
            taxNumber(other.getTaxNumber());
            status(other.getStatus());
            currency(other.getCurrency());
            company(other.getCompany());
            addresses(other.getAddresses());
            phoneNumbers(other.getPhoneNumbers());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
            return this;
        }

        @JsonSetter(value = "name", nulls = Nulls.SKIP)
        public Builder name(Optional<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(String name) {
            this.name = Optional.of(name);
            return this;
        }

        @JsonSetter(value = "is_supplier", nulls = Nulls.SKIP)
        public Builder isSupplier(Optional<Boolean> isSupplier) {
            this.isSupplier = isSupplier;
            return this;
        }

        public Builder isSupplier(Boolean isSupplier) {
            this.isSupplier = Optional.of(isSupplier);
            return this;
        }

        @JsonSetter(value = "is_customer", nulls = Nulls.SKIP)
        public Builder isCustomer(Optional<Boolean> isCustomer) {
            this.isCustomer = isCustomer;
            return this;
        }

        public Builder isCustomer(Boolean isCustomer) {
            this.isCustomer = Optional.of(isCustomer);
            return this;
        }

        @JsonSetter(value = "email_address", nulls = Nulls.SKIP)
        public Builder emailAddress(Optional<String> emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Optional.of(emailAddress);
            return this;
        }

        @JsonSetter(value = "tax_number", nulls = Nulls.SKIP)
        public Builder taxNumber(Optional<String> taxNumber) {
            this.taxNumber = taxNumber;
            return this;
        }

        public Builder taxNumber(String taxNumber) {
            this.taxNumber = Optional.of(taxNumber);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<ContactRequestStatus> status) {
            this.status = status;
            return this;
        }

        public Builder status(ContactRequestStatus status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "currency", nulls = Nulls.SKIP)
        public Builder currency(Optional<String> currency) {
            this.currency = currency;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = Optional.of(currency);
            return this;
        }

        @JsonSetter(value = "company", nulls = Nulls.SKIP)
        public Builder company(Optional<String> company) {
            this.company = company;
            return this;
        }

        public Builder company(String company) {
            this.company = Optional.of(company);
            return this;
        }

        @JsonSetter(value = "addresses", nulls = Nulls.SKIP)
        public Builder addresses(Optional<List<Optional<String>>> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder addresses(List<Optional<String>> addresses) {
            this.addresses = Optional.of(addresses);
            return this;
        }

        @JsonSetter(value = "phone_numbers", nulls = Nulls.SKIP)
        public Builder phoneNumbers(Optional<List<AccountingPhoneNumberRequest>> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public Builder phoneNumbers(List<AccountingPhoneNumberRequest> phoneNumbers) {
            this.phoneNumbers = Optional.of(phoneNumbers);
            return this;
        }

        @JsonSetter(value = "integration_params", nulls = Nulls.SKIP)
        public Builder integrationParams(Optional<Map<String, JsonNode>> integrationParams) {
            this.integrationParams = integrationParams;
            return this;
        }

        public Builder integrationParams(Map<String, JsonNode> integrationParams) {
            this.integrationParams = Optional.of(integrationParams);
            return this;
        }

        @JsonSetter(value = "linked_account_params", nulls = Nulls.SKIP)
        public Builder linkedAccountParams(Optional<Map<String, JsonNode>> linkedAccountParams) {
            this.linkedAccountParams = linkedAccountParams;
            return this;
        }

        public Builder linkedAccountParams(Map<String, JsonNode> linkedAccountParams) {
            this.linkedAccountParams = Optional.of(linkedAccountParams);
            return this;
        }

        public ContactRequest build() {
            return new ContactRequest(
                    name,
                    isSupplier,
                    isCustomer,
                    emailAddress,
                    taxNumber,
                    status,
                    currency,
                    company,
                    addresses,
                    phoneNumbers,
                    integrationParams,
                    linkedAccountParams);
        }
    }
}
