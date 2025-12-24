package io.turgudguliyev.util;

import java.util.UUID;

public enum IdentifierUtil {
    IDENTIFIER_UTIL;

    public String generateOperationId() {
        return UUID.randomUUID()
                   .toString()
                   .replaceAll("-", "");
    }
}