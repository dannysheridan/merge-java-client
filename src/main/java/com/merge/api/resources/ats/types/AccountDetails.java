package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AccountDetails.Builder.class)
public final class AccountDetails {
    private final Optional<String> id;

    private final Optional<String> integration;

    private final Optional<String> integrationSlug;

    private final Optional<CategoryEnum> category;

    private final Optional<String> endUserOriginId;

    private final Optional<String> endUserOrganizationName;

    private final Optional<String> endUserEmailAddress;

    private final Optional<String> status;

    private final Optional<String> webhookListenerUrl;

    private final Optional<Boolean> isDuplicate;

    private AccountDetails(
            Optional<String> id,
            Optional<String> integration,
            Optional<String> integrationSlug,
            Optional<CategoryEnum> category,
            Optional<String> endUserOriginId,
            Optional<String> endUserOrganizationName,
            Optional<String> endUserEmailAddress,
            Optional<String> status,
            Optional<String> webhookListenerUrl,
            Optional<Boolean> isDuplicate) {
        this.id = id;
        this.integration = integration;
        this.integrationSlug = integrationSlug;
        this.category = category;
        this.endUserOriginId = endUserOriginId;
        this.endUserOrganizationName = endUserOrganizationName;
        this.endUserEmailAddress = endUserEmailAddress;
        this.status = status;
        this.webhookListenerUrl = webhookListenerUrl;
        this.isDuplicate = isDuplicate;
    }

    @JsonProperty("id")
    public Optional<String> getId() {
        return id;
    }

    @JsonProperty("integration")
    public Optional<String> getIntegration() {
        return integration;
    }

    @JsonProperty("integration_slug")
    public Optional<String> getIntegrationSlug() {
        return integrationSlug;
    }

    @JsonProperty("category")
    public Optional<CategoryEnum> getCategory() {
        return category;
    }

    @JsonProperty("end_user_origin_id")
    public Optional<String> getEndUserOriginId() {
        return endUserOriginId;
    }

    @JsonProperty("end_user_organization_name")
    public Optional<String> getEndUserOrganizationName() {
        return endUserOrganizationName;
    }

    @JsonProperty("end_user_email_address")
    public Optional<String> getEndUserEmailAddress() {
        return endUserEmailAddress;
    }

    @JsonProperty("status")
    public Optional<String> getStatus() {
        return status;
    }

    @JsonProperty("webhook_listener_url")
    public Optional<String> getWebhookListenerUrl() {
        return webhookListenerUrl;
    }

    /**
     * @return Whether a Production Linked Account's credentials match another existing Production Linked Account. This field is <code>null</code> for Test Linked Accounts, incomplete Production Linked Accounts, and ignored duplicate Production Linked Account sets.
     */
    @JsonProperty("is_duplicate")
    public Optional<Boolean> getIsDuplicate() {
        return isDuplicate;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccountDetails && equalTo((AccountDetails) other);
    }

    private boolean equalTo(AccountDetails other) {
        return id.equals(other.id)
                && integration.equals(other.integration)
                && integrationSlug.equals(other.integrationSlug)
                && category.equals(other.category)
                && endUserOriginId.equals(other.endUserOriginId)
                && endUserOrganizationName.equals(other.endUserOrganizationName)
                && endUserEmailAddress.equals(other.endUserEmailAddress)
                && status.equals(other.status)
                && webhookListenerUrl.equals(other.webhookListenerUrl)
                && isDuplicate.equals(other.isDuplicate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.id,
                this.integration,
                this.integrationSlug,
                this.category,
                this.endUserOriginId,
                this.endUserOrganizationName,
                this.endUserEmailAddress,
                this.status,
                this.webhookListenerUrl,
                this.isDuplicate);
    }

    @Override
    public String toString() {
        return "AccountDetails{" + "id: " + id + ", integration: " + integration + ", integrationSlug: "
                + integrationSlug + ", category: " + category + ", endUserOriginId: " + endUserOriginId
                + ", endUserOrganizationName: " + endUserOrganizationName + ", endUserEmailAddress: "
                + endUserEmailAddress + ", status: " + status + ", webhookListenerUrl: " + webhookListenerUrl
                + ", isDuplicate: " + isDuplicate + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> id = Optional.empty();

        private Optional<String> integration = Optional.empty();

        private Optional<String> integrationSlug = Optional.empty();

        private Optional<CategoryEnum> category = Optional.empty();

        private Optional<String> endUserOriginId = Optional.empty();

        private Optional<String> endUserOrganizationName = Optional.empty();

        private Optional<String> endUserEmailAddress = Optional.empty();

        private Optional<String> status = Optional.empty();

        private Optional<String> webhookListenerUrl = Optional.empty();

        private Optional<Boolean> isDuplicate = Optional.empty();

        private Builder() {}

        public Builder from(AccountDetails other) {
            id(other.getId());
            integration(other.getIntegration());
            integrationSlug(other.getIntegrationSlug());
            category(other.getCategory());
            endUserOriginId(other.getEndUserOriginId());
            endUserOrganizationName(other.getEndUserOrganizationName());
            endUserEmailAddress(other.getEndUserEmailAddress());
            status(other.getStatus());
            webhookListenerUrl(other.getWebhookListenerUrl());
            isDuplicate(other.getIsDuplicate());
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

        @JsonSetter(value = "integration", nulls = Nulls.SKIP)
        public Builder integration(Optional<String> integration) {
            this.integration = integration;
            return this;
        }

        public Builder integration(String integration) {
            this.integration = Optional.of(integration);
            return this;
        }

        @JsonSetter(value = "integration_slug", nulls = Nulls.SKIP)
        public Builder integrationSlug(Optional<String> integrationSlug) {
            this.integrationSlug = integrationSlug;
            return this;
        }

        public Builder integrationSlug(String integrationSlug) {
            this.integrationSlug = Optional.of(integrationSlug);
            return this;
        }

        @JsonSetter(value = "category", nulls = Nulls.SKIP)
        public Builder category(Optional<CategoryEnum> category) {
            this.category = category;
            return this;
        }

        public Builder category(CategoryEnum category) {
            this.category = Optional.of(category);
            return this;
        }

        @JsonSetter(value = "end_user_origin_id", nulls = Nulls.SKIP)
        public Builder endUserOriginId(Optional<String> endUserOriginId) {
            this.endUserOriginId = endUserOriginId;
            return this;
        }

        public Builder endUserOriginId(String endUserOriginId) {
            this.endUserOriginId = Optional.of(endUserOriginId);
            return this;
        }

        @JsonSetter(value = "end_user_organization_name", nulls = Nulls.SKIP)
        public Builder endUserOrganizationName(Optional<String> endUserOrganizationName) {
            this.endUserOrganizationName = endUserOrganizationName;
            return this;
        }

        public Builder endUserOrganizationName(String endUserOrganizationName) {
            this.endUserOrganizationName = Optional.of(endUserOrganizationName);
            return this;
        }

        @JsonSetter(value = "end_user_email_address", nulls = Nulls.SKIP)
        public Builder endUserEmailAddress(Optional<String> endUserEmailAddress) {
            this.endUserEmailAddress = endUserEmailAddress;
            return this;
        }

        public Builder endUserEmailAddress(String endUserEmailAddress) {
            this.endUserEmailAddress = Optional.of(endUserEmailAddress);
            return this;
        }

        @JsonSetter(value = "status", nulls = Nulls.SKIP)
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(String status) {
            this.status = Optional.of(status);
            return this;
        }

        @JsonSetter(value = "webhook_listener_url", nulls = Nulls.SKIP)
        public Builder webhookListenerUrl(Optional<String> webhookListenerUrl) {
            this.webhookListenerUrl = webhookListenerUrl;
            return this;
        }

        public Builder webhookListenerUrl(String webhookListenerUrl) {
            this.webhookListenerUrl = Optional.of(webhookListenerUrl);
            return this;
        }

        @JsonSetter(value = "is_duplicate", nulls = Nulls.SKIP)
        public Builder isDuplicate(Optional<Boolean> isDuplicate) {
            this.isDuplicate = isDuplicate;
            return this;
        }

        public Builder isDuplicate(Boolean isDuplicate) {
            this.isDuplicate = Optional.of(isDuplicate);
            return this;
        }

        public AccountDetails build() {
            return new AccountDetails(
                    id,
                    integration,
                    integrationSlug,
                    category,
                    endUserOriginId,
                    endUserOrganizationName,
                    endUserEmailAddress,
                    status,
                    webhookListenerUrl,
                    isDuplicate);
        }
    }
}
