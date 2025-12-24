package io.turgudguliyev.mapper;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.model.enums.Currency;
import io.turgudguliyev.model.request.QrOperationRequest;

import java.math.BigDecimal;

import static io.turgudguliyev.model.constants.QrConstants.*;
import static io.turgudguliyev.model.enums.LocalInstrumentCode.MERCHANT_PRESENTED_QR;
import static io.turgudguliyev.model.enums.QrType.DYNAMIC;
import static io.turgudguliyev.model.enums.TerminalType.WEB_SITE;
import static io.turgudguliyev.util.DateTimeUtil.DATE_TIME_UTIL;
import static io.turgudguliyev.util.FunctionUtil.FUNCTION_UTIL;

public enum QrCompositeMapper {
    QR_COMPOSITE_MAPPER;

    public QrCompositeDto toQrCompositeDto(String id, QrOperationRequest request) {
        var type = request.getType();
        var channel = request.getChannel();
        var currency = request.getCurrency();

        var dto = QrCompositeDto.builder()
                                .id(id)
                                .type(type.getCode())
                                .terminalId(request.getTerminalId())
                                .amount(FUNCTION_UTIL.applyNullSafety(request.getAmount(), BigDecimal::toEngineeringString))
                                .currency(FUNCTION_UTIL.applyNullSafety(currency, Currency::getCode))
                                .merchantName(request.getMerchantName())
                                .merchantCity(request.getMerchantCity())
                                .merchantCategoryCode(request.getMerchantCategoryCode())
                                .version(VERSION)
                                .terminalType(WEB_SITE.getCode())
                                .specificationMode(channel.getSpecificationMode())
                                .aliasType(request.getAliasType().getCode())
                                .aliasValue(request.getAliasValue())
                                .pseudoBic(request.getBankBic())
                                .countryCode(COUNTRY_CODE)
                                .transactionType(channel.getTransactionType())
                                .localInstrument(MERCHANT_PRESENTED_QR.getCode())
                                .build();

        addAvailabilityTime(dto);

        return dto;
    }

    private void addAvailabilityTime(QrCompositeDto dto) {
        var isDynamic = DYNAMIC.getCode()
                               .equals(dto.getType());

        if (isDynamic) {
            var issuedAt = DATE_TIME_UTIL.getCurrentTime();
            var expirationTime = DATE_TIME_UTIL.addMinutes(issuedAt, EXPIRATION_MINUTES);

            dto.setIssuedAt(DATE_TIME_UTIL.formatDate(issuedAt));
            dto.setExpirationTime(DATE_TIME_UTIL.formatDate(expirationTime));
        }
    }
}