package io.turgudguliyev.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LocalInstrumentCode {
    MERCHANT_PRESENTED_QR("MPRQ");

    private final String code;
}