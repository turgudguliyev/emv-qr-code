package io.turgudguliyev.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AliasType {

    PIN("01"),
    MOBILE_NUMBER("02"),
    EMAIL("03"),
    IBAN("04"),
    TAX_ID("05"),
    MERCHANT_ID("06"),
    OBJECT_CODE("07");

    private final String code;
}