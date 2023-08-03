package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = AttachmentRequest.Builder.class)
public final class AttachmentRequest {
    private final Optional<String> fileName;

    private final Optional<String> fileUrl;

    private final Optional<String> candidate;

    private final Optional<AttachmentRequestAttachmentType> attachmentType;

    private final Optional<Map<String, JsonNode>> integrationParams;

    private final Optional<Map<String, JsonNode>> linkedAccountParams;

    private AttachmentRequest(
            Optional<String> fileName,
            Optional<String> fileUrl,
            Optional<String> candidate,
            Optional<AttachmentRequestAttachmentType> attachmentType,
            Optional<Map<String, JsonNode>> integrationParams,
            Optional<Map<String, JsonNode>> linkedAccountParams) {
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.candidate = candidate;
        this.attachmentType = attachmentType;
        this.integrationParams = integrationParams;
        this.linkedAccountParams = linkedAccountParams;
    }

    /**
     * @return The attachment's name.
     */
    @JsonProperty("file_name")
    public Optional<String> getFileName() {
        return fileName;
    }

    /**
     * @return The attachment's url.
     */
    @JsonProperty("file_url")
    public Optional<String> getFileUrl() {
        return fileUrl;
    }

    /**
     * @return
     */
    @JsonProperty("candidate")
    public Optional<String> getCandidate() {
        return candidate;
    }

    /**
     * @return The attachment's type.
     * <ul>
     * <li><code>RESUME</code> - RESUME</li>
     * <li><code>COVER_LETTER</code> - COVER_LETTER</li>
     * <li><code>OFFER_LETTER</code> - OFFER_LETTER</li>
     * <li><code>OTHER</code> - OTHER</li>
     * </ul>
     */
    @JsonProperty("attachment_type")
    public Optional<AttachmentRequestAttachmentType> getAttachmentType() {
        return attachmentType;
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
        return other instanceof AttachmentRequest && equalTo((AttachmentRequest) other);
    }

    private boolean equalTo(AttachmentRequest other) {
        return fileName.equals(other.fileName)
                && fileUrl.equals(other.fileUrl)
                && candidate.equals(other.candidate)
                && attachmentType.equals(other.attachmentType)
                && integrationParams.equals(other.integrationParams)
                && linkedAccountParams.equals(other.linkedAccountParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.fileName,
                this.fileUrl,
                this.candidate,
                this.attachmentType,
                this.integrationParams,
                this.linkedAccountParams);
    }

    @Override
    public String toString() {
        return "AttachmentRequest{" + "fileName: " + fileName + ", fileUrl: " + fileUrl + ", candidate: " + candidate
                + ", attachmentType: " + attachmentType + ", integrationParams: " + integrationParams
                + ", linkedAccountParams: " + linkedAccountParams + "}";
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> fileName = Optional.empty();

        private Optional<String> fileUrl = Optional.empty();

        private Optional<String> candidate = Optional.empty();

        private Optional<AttachmentRequestAttachmentType> attachmentType = Optional.empty();

        private Optional<Map<String, JsonNode>> integrationParams = Optional.empty();

        private Optional<Map<String, JsonNode>> linkedAccountParams = Optional.empty();

        private Builder() {}

        public Builder from(AttachmentRequest other) {
            fileName(other.getFileName());
            fileUrl(other.getFileUrl());
            candidate(other.getCandidate());
            attachmentType(other.getAttachmentType());
            integrationParams(other.getIntegrationParams());
            linkedAccountParams(other.getLinkedAccountParams());
            return this;
        }

        @JsonSetter(value = "file_name", nulls = Nulls.SKIP)
        public Builder fileName(Optional<String> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder fileName(String fileName) {
            this.fileName = Optional.of(fileName);
            return this;
        }

        @JsonSetter(value = "file_url", nulls = Nulls.SKIP)
        public Builder fileUrl(Optional<String> fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        public Builder fileUrl(String fileUrl) {
            this.fileUrl = Optional.of(fileUrl);
            return this;
        }

        @JsonSetter(value = "candidate", nulls = Nulls.SKIP)
        public Builder candidate(Optional<String> candidate) {
            this.candidate = candidate;
            return this;
        }

        public Builder candidate(String candidate) {
            this.candidate = Optional.of(candidate);
            return this;
        }

        @JsonSetter(value = "attachment_type", nulls = Nulls.SKIP)
        public Builder attachmentType(Optional<AttachmentRequestAttachmentType> attachmentType) {
            this.attachmentType = attachmentType;
            return this;
        }

        public Builder attachmentType(AttachmentRequestAttachmentType attachmentType) {
            this.attachmentType = Optional.of(attachmentType);
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

        public AttachmentRequest build() {
            return new AttachmentRequest(
                    fileName, fileUrl, candidate, attachmentType, integrationParams, linkedAccountParams);
        }
    }
}