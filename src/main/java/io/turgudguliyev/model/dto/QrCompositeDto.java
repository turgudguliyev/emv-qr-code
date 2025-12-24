package io.turgudguliyev.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QrCompositeDto {
    private String id;
    private String type;

    private String amount;
    private String currency;
    private String terminalId;

    private String merchantName;
    private String merchantCity;
    private String merchantCategoryCode;

    private String version;
    private String terminalType;
    private String specificationMode;

    private String aliasType;
    private String aliasValue;

    private String pseudoBic;
    private String countryCode;
    private String transactionType;
    private String localInstrument;

    private String issuedAt;
    private String expirationTime;
}