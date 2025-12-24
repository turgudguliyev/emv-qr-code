package io.turgudguliyev.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TerminalType {

    PHYSICAL_PRINT("01", "Fiziki çap"),
    POS_TERMINAL("02", "POS terminal"),
    SELF_SERVICE_TERMINAL("03", "Özünəxidmət terminalı"),
    ATM("04", "Bankomat"),
    WEB_SITE("05", "İnternet səhifəsi"),
    MOBILE_APP("06", "Mobil tətbiq"),
    OTHER("07", "Digər");

    private final String code;
    private final String description;
}