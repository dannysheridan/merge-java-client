package com.merge.api.resources.ats.types;

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
@JsonDeserialize(builder = AccountIntegration.Builder.class)
public final class AccountIntegration {
    private final String name;

    private final Optional<List<CategoriesEnum>> categories;

    private final Optional<String> image;

    private final Optional<String> squareImage;

    private final Optional<String> color;

    private final Optional<String> slug;

    private final Optional<Boolean> isInBeta;

    private final Optional<Map<String, JsonNode>> apiEndpointsToDocumentationUrls;

    private AccountIntegration(
            String name,
            Optional<List<CategoriesEnum>> categories,
            Optional<String> image,
            Optional<String> squareImage,
            Optional<String> color,
            Optional<String> slug,
            Optional<Boolean> isInBeta,
            Optional<Map<String, JsonNode>> apiEndpointsToDocumentationUrls) {
        this.name = name;
        this.categories = categories;
        this.image = image;
        this.squareImage = squareImage;
        this.color = color;
        this.slug = slug;
        this.isInBeta = isInBeta;
        this.apiEndpointsToDocumentationUrls = apiEndpointsToDocumentationUrls;
    }

    /**
     * @return Company name.
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @return Category or categories this integration belongs to. Multiple categories should be comma separated, i.e. [ats, hris].
     */
    @JsonProperty("categories")
    public Optional<List<CategoriesEnum>> getCategories() {
        return categories;
    }

    /**
     * @return Company logo in rectangular shape. &lt;b&gt;Upload an image with a clear background.&lt;/b&gt;
     */
    @JsonProperty("image")
    public Optional<String> getImage() {
        return image;
    }

    /**
     * @return Company logo in square shape. &lt;b&gt;Upload an image with a white background.&lt;/b&gt;
     */
    @JsonProperty("square_image")
    public Optional<String> getSquareImage() {
        return squareImage;
    }

    /**
     * @return The color of this integration used for buttons and text throughout the app and landing pages. &lt;b&gt;Choose a darker, saturated color.&lt;/b&gt; &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 18 characters</code>&lt;/span&gt;
     */
    @JsonProperty("color")
    public Optional<String> getColor() {
        return color;
    }

    @JsonProperty("slug")
    public Optional<String> getSlug() {
        return slug;
    }

    /**
     * @return If checked, this integration will not appear in the linking flow, and will appear elsewhere with a Beta tag.
     */
    @JsonProperty("is_in_beta")
    public Optional<Boolean> getIsInBeta() {
        return isInBeta;
    }

    /**
     * @return Mapping of API endpoints to documentation urls for support. Example: {'GET': [['/common-model-scopes', 'https://docs.merge.dev/accounting/common-model-scopes/#common_model_scopes_retrieve'],['/common-model-actions', 'https://docs.merge.dev/accounting/common-model-actions/#common_model_actions_retrieve']], 'POST': []}
     */
    @JsonProperty("api_endpoints_to_documentation_urls")
    public Optional<Map<String, JsonNode>> getApiEndpointsToDocumentationUrls() {
        return apiEndpointsToDocumentationUrls;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccountIntegration && equalTo((AccountIntegration) other);
    }

    private boolean equalTo(AccountIntegration other) {
        return name.equals(other.name)
                && categories.equals(other.categories)
                && image.equals(other.image)
                && squareImage.equals(other.squareImage)
                && color.equals(other.color)
                && slug.equals(other.slug)
                && isInBeta.equals(other.isInBeta)
                && apiEndpointsToDocumentationUrls.equals(other.apiEndpointsToDocumentationUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                this.name,
                this.categories,
                this.image,
                this.squareImage,
                this.color,
                this.slug,
                this.isInBeta,
                this.apiEndpointsToDocumentationUrls);
    }

    @Override
    public String toString() {
        return "AccountIntegration{" + "name: " + name + ", categories: " + categories + ", image: " + image
                + ", squareImage: " + squareImage + ", color: " + color + ", slug: " + slug + ", isInBeta: " + isInBeta
                + ", apiEndpointsToDocumentationUrls: " + apiEndpointsToDocumentationUrls + "}";
    }

    public static NameStage builder() {
        return new Builder();
    }

    public interface NameStage {
        _FinalStage name(String name);

        Builder from(AccountIntegration other);
    }

    public interface _FinalStage {
        AccountIntegration build();

        _FinalStage categories(Optional<List<CategoriesEnum>> categories);

        _FinalStage categories(List<CategoriesEnum> categories);

        _FinalStage image(Optional<String> image);

        _FinalStage image(String image);

        _FinalStage squareImage(Optional<String> squareImage);

        _FinalStage squareImage(String squareImage);

        _FinalStage color(Optional<String> color);

        _FinalStage color(String color);

        _FinalStage slug(Optional<String> slug);

        _FinalStage slug(String slug);

        _FinalStage isInBeta(Optional<Boolean> isInBeta);

        _FinalStage isInBeta(Boolean isInBeta);

        _FinalStage apiEndpointsToDocumentationUrls(Optional<Map<String, JsonNode>> apiEndpointsToDocumentationUrls);

        _FinalStage apiEndpointsToDocumentationUrls(Map<String, JsonNode> apiEndpointsToDocumentationUrls);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NameStage, _FinalStage {
        private String name;

        private Optional<Map<String, JsonNode>> apiEndpointsToDocumentationUrls = Optional.empty();

        private Optional<Boolean> isInBeta = Optional.empty();

        private Optional<String> slug = Optional.empty();

        private Optional<String> color = Optional.empty();

        private Optional<String> squareImage = Optional.empty();

        private Optional<String> image = Optional.empty();

        private Optional<List<CategoriesEnum>> categories = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccountIntegration other) {
            name(other.getName());
            categories(other.getCategories());
            image(other.getImage());
            squareImage(other.getSquareImage());
            color(other.getColor());
            slug(other.getSlug());
            isInBeta(other.getIsInBeta());
            apiEndpointsToDocumentationUrls(other.getApiEndpointsToDocumentationUrls());
            return this;
        }

        /**
         * <p>Company name.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        @JsonSetter("name")
        public _FinalStage name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Mapping of API endpoints to documentation urls for support. Example: {'GET': [['/common-model-scopes', 'https://docs.merge.dev/accounting/common-model-scopes/#common_model_scopes_retrieve'],['/common-model-actions', 'https://docs.merge.dev/accounting/common-model-actions/#common_model_actions_retrieve']], 'POST': []}</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage apiEndpointsToDocumentationUrls(Map<String, JsonNode> apiEndpointsToDocumentationUrls) {
            this.apiEndpointsToDocumentationUrls = Optional.of(apiEndpointsToDocumentationUrls);
            return this;
        }

        @Override
        @JsonSetter(value = "api_endpoints_to_documentation_urls", nulls = Nulls.SKIP)
        public _FinalStage apiEndpointsToDocumentationUrls(
                Optional<Map<String, JsonNode>> apiEndpointsToDocumentationUrls) {
            this.apiEndpointsToDocumentationUrls = apiEndpointsToDocumentationUrls;
            return this;
        }

        /**
         * <p>If checked, this integration will not appear in the linking flow, and will appear elsewhere with a Beta tag.</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage isInBeta(Boolean isInBeta) {
            this.isInBeta = Optional.of(isInBeta);
            return this;
        }

        @Override
        @JsonSetter(value = "is_in_beta", nulls = Nulls.SKIP)
        public _FinalStage isInBeta(Optional<Boolean> isInBeta) {
            this.isInBeta = isInBeta;
            return this;
        }

        @Override
        public _FinalStage slug(String slug) {
            this.slug = Optional.of(slug);
            return this;
        }

        @Override
        @JsonSetter(value = "slug", nulls = Nulls.SKIP)
        public _FinalStage slug(Optional<String> slug) {
            this.slug = slug;
            return this;
        }

        /**
         * <p>The color of this integration used for buttons and text throughout the app and landing pages. &lt;b&gt;Choose a darker, saturated color.&lt;/b&gt; &lt;span style=&quot;white-space: nowrap&quot;&gt;<code>&lt;= 18 characters</code>&lt;/span&gt;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage color(String color) {
            this.color = Optional.of(color);
            return this;
        }

        @Override
        @JsonSetter(value = "color", nulls = Nulls.SKIP)
        public _FinalStage color(Optional<String> color) {
            this.color = color;
            return this;
        }

        /**
         * <p>Company logo in square shape. &lt;b&gt;Upload an image with a white background.&lt;/b&gt;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage squareImage(String squareImage) {
            this.squareImage = Optional.of(squareImage);
            return this;
        }

        @Override
        @JsonSetter(value = "square_image", nulls = Nulls.SKIP)
        public _FinalStage squareImage(Optional<String> squareImage) {
            this.squareImage = squareImage;
            return this;
        }

        /**
         * <p>Company logo in rectangular shape. &lt;b&gt;Upload an image with a clear background.&lt;/b&gt;</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage image(String image) {
            this.image = Optional.of(image);
            return this;
        }

        @Override
        @JsonSetter(value = "image", nulls = Nulls.SKIP)
        public _FinalStage image(Optional<String> image) {
            this.image = image;
            return this;
        }

        /**
         * <p>Category or categories this integration belongs to. Multiple categories should be comma separated, i.e. [ats, hris].</p>
         * @return Reference to {@code this} so that method calls can be chained together.
         */
        @Override
        public _FinalStage categories(List<CategoriesEnum> categories) {
            this.categories = Optional.of(categories);
            return this;
        }

        @Override
        @JsonSetter(value = "categories", nulls = Nulls.SKIP)
        public _FinalStage categories(Optional<List<CategoriesEnum>> categories) {
            this.categories = categories;
            return this;
        }

        @Override
        public AccountIntegration build() {
            return new AccountIntegration(
                    name, categories, image, squareImage, color, slug, isInBeta, apiEndpointsToDocumentationUrls);
        }
    }
}