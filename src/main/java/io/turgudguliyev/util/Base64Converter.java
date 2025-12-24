package io.turgudguliyev.util;

import java.util.Base64;
import java.util.Base64.Encoder;

public enum Base64Converter {
    BASE_64_CONVERTER;

    private final Encoder encoder = Base64.getEncoder();

    public String encodeToString(byte[] source) {
        return encoder.encodeToString(source);
    }
}