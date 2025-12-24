package io.turgudguliyev.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum QrType {
    STATIC("11"),
    DYNAMIC("12");

    private final String code;
}