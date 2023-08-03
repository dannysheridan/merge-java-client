package com.merge.api.resources.ats.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.merge.api.core.ObjectMappers;
import java.io.IOException;
import java.util.Objects;

@JsonDeserialize(using = EeocVeteranStatus.Deserializer.class)
public final class EeocVeteranStatus {
    private final Object value;

    private final int type;

    private EeocVeteranStatus(Object value, int type) {
        this.value = value;
        this.type = type;
    }

    @JsonValue
    public Object get() {
        return this.value;
    }

    public <T> T visit(Visitor<T> visitor) {
        if (this.type == 0) {
            return visitor.visit((VeteranStatusEnum) this.value);
        } else if (this.type == 1) {
            return visitor.visit((String) this.value);
        }
        throw new IllegalStateException("Failed to visit value. This should never happen.");
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof EeocVeteranStatus && equalTo((EeocVeteranStatus) other);
    }

    private boolean equalTo(EeocVeteranStatus other) {
        return value.equals(other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    public static EeocVeteranStatus of(VeteranStatusEnum value) {
        return new EeocVeteranStatus(value, 0);
    }

    public static EeocVeteranStatus of(String value) {
        return new EeocVeteranStatus(value, 1);
    }

    public interface Visitor<T> {
        T visit(VeteranStatusEnum value);

        T visit(String value);
    }

    static final class Deserializer extends StdDeserializer<EeocVeteranStatus> {
        Deserializer() {
            super(EeocVeteranStatus.class);
        }

        @Override
        public EeocVeteranStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
            Object value = p.readValueAs(Object.class);
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, VeteranStatusEnum.class));
            } catch (IllegalArgumentException e) {
            }
            try {
                return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
            } catch (IllegalArgumentException e) {
            }
            throw new JsonParseException(p, "Failed to deserialize");
        }
    }
}