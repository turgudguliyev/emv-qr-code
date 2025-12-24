package io.turgudguliyev.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TransactionType {
    MOBILE_PURCHASE_QR("613");

    private final String code;
}