package io.turgudguliyev.service.composite.abstraction;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public interface QrTagLengthValueFormatter {

    default String format(String id, String value) {
        return (value == null || value.isBlank()) ? EMPTY
                                                  : id + String.format("%02d", value.length()) + value;
    }
}