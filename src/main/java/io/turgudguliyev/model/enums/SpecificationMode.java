package io.turgudguliyev.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SpecificationMode {
    MERCHANT_PRESENTED_MODE("MPV002");

    private final String code;
}