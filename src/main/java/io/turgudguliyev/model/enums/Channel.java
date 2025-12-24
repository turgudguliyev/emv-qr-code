package io.turgudguliyev.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import static io.turgudguliyev.model.enums.SpecificationMode.MERCHANT_PRESENTED_MODE;
import static io.turgudguliyev.model.enums.TransactionType.MOBILE_PURCHASE_QR;

@Getter
@RequiredArgsConstructor
public enum Channel {
    MERCHANT(MERCHANT_PRESENTED_MODE.getCode(), MOBILE_PURCHASE_QR.getCode());

    private final String specificationMode;
    private final String transactionType;
}