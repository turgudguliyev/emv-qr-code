package io.turgudguliyev.model.request;

import io.turgudguliyev.model.enums.AliasType;
import io.turgudguliyev.model.enums.Channel;
import io.turgudguliyev.model.enums.Currency;
import io.turgudguliyev.model.enums.QrType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QrOperationRequest {
    private QrType type;
    private Channel channel;

    private String bankBic;
    private String aliasValue;
    private AliasType aliasType;

    private Currency currency;
    private BigDecimal amount;

    private String terminalId;
    private String merchantName;
    private String merchantCity;
    private String merchantCategoryCode;
}