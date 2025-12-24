package io.turgudguliyev.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum QrTag {

    TERMINAL_ID("07", "Terminal nömrəsi"),

    VERSION("00", "Versiya nömrəsi"),
    ID("03", "QR kodun unikal eyniləşdiricisi"),
    TERMINAL_TYPE("04", "Terminal növü"),
    ISSUED_AT("06", "AZQR kodun yaradılma vaxtı"),
    EXPIRATION_TIME("07", "AZQR kodun son istifadə müddəti"),

    PSEUDO_BIC("00", "AZQR kod təchizatçısının BİC-i və ya Pseudo BİC-i"),
    LOCAL_INSTRUMENT("01", "Əməliyyat kodu"),
    TRANSACTION_TYPE("02", "Tranzaksiya tipi"),

    ALIAS_TYPE("00", "Aliasın tipi"),
    ALIAS_VALUE("01", "Aliasın dəyəri"),
    BANK_BIC("02", "AZQR kod təqdim edən subyektin Bankının BIC-i"),

    PAYLOAD_FORMAT_INDICATOR("00", "EMV QR kod standartının versiyası"),
    POINT_OF_INITIATION_METHOD("01", "QR kodun növü"),

    MAIN_INFORMATION("26", "AZQR kod üzrə əsas məlumat"),
    SUBJECT_INFORMATION("27", "AZQR kodu təqdim edən subyektin unikal eyniləşdiricisi"),
    SPECIFIC_INFORMATION("36", "AÖS üzrə spesifik sahələr"),
    ADDITIONAL_INFORMATION("37", "AZQR kod üzrə əlavə məlumatlar"),
    SPECIFICATION_MODE("39", "AÖS-ün AZQR kod üzrə spesifikasiya versiyası"),
    GLOBAL_IDENTIFIER("40", "AÖS-ün AZQR kod üzrə identifikasiya nömrəsi [UUID]"),

    MERCHANT_CATEGORY_CODE("52", "Təsərrüfat subyektinin kateqoriya kodu"),
    TRANSACTION_CURRENCY("53", "Əməliyyat valyutası"),
    TRANSACTION_AMOUNT("54", "Əməliyyat məbləği"),

    COUNTRY_CODE("58", "Ölkə kodu"),
    MERCHANT_NAME("59", "AZQR kod təqdim edən subyektin adı"),
    MERCHANT_CITY("60", "AZQR kod təqdim edən subyektin şəhəri");

    private final String id;
    private final String description;
}