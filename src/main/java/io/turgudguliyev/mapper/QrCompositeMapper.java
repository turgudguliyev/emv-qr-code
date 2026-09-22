package io.turgudguliyev.mapper;

import static io.turgudguliyev.model.constants.QrConstants.COUNTRY_CODE;
import static io.turgudguliyev.model.constants.QrConstants.VERSION;
import static io.turgudguliyev.model.enums.LocalInstrumentCode.MERCHANT_PRESENTED_QR;
import static io.turgudguliyev.model.enums.TerminalType.WEB_SITE;
import static io.turgudguliyev.util.DateTimeUtil.DATE_TIME_UTIL;
import static io.turgudguliyev.util.FunctionUtil.FUNCTION_UTIL;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.model.enums.AliasType;
import io.turgudguliyev.model.enums.Channel;
import io.turgudguliyev.model.enums.Currency;
import io.turgudguliyev.model.enums.QrType;
import io.turgudguliyev.model.request.QrOperationRequest;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public enum QrCompositeMapper {
    QR_COMPOSITE_MAPPER;

    public QrCompositeDto toQrCompositeDto(String id, QrOperationRequest request) {
        var type = request.getType();
        var channel = request.getChannel();
        var currency = request.getCurrency();
        var aliasType = request.getAliasType();
        var countryCode = request.getCountryCode();

        var dto = QrCompositeDto.builder()
                                .id(id)
                                .type(FUNCTION_UTIL.applyNullSafety(type, QrType::getCode))
                                .terminalId(request.getTerminalId())
                                .amount(FUNCTION_UTIL.applyNullSafety(request.getAmount(), BigDecimal::toEngineeringString))
                                .currency(FUNCTION_UTIL.applyNullSafety(currency, Currency::getCode))
                                .merchantName(request.getMerchantName())
                                .merchantCity(request.getMerchantCity())
                                .merchantCategoryCode(request.getMerchantCategoryCode())
                                .version(VERSION)
                                .terminalType(WEB_SITE.getCode())
                                .specificationMode(FUNCTION_UTIL.applyNullSafety(channel, Channel::getSpecificationMode))
                                .aliasType(FUNCTION_UTIL.applyNullSafety(aliasType, AliasType::getCode))
                                .aliasValue(request.getAliasValue())
                                .pseudoBic(request.getBankBic())
                                .countryCode(countryCode == null ? COUNTRY_CODE : countryCode)
                                .transactionType(FUNCTION_UTIL.applyNullSafety(channel, Channel::getTransactionType))
                                .localInstrument(MERCHANT_PRESENTED_QR.getCode())
                                .hashedCardPan(request.getHashedCardPan())
                                .hashedCardExpiryDate(request.getHashedCardExpiryDate())
                                .build();

        addAvailabilityTime(dto, request.getExpirationDate());

        return dto;
    }

    private void addAvailabilityTime(QrCompositeDto dto, LocalDateTime expirationDate) {
        var issuedAt = DATE_TIME_UTIL.getCurrentTime();
        dto.setIssuedAt(DATE_TIME_UTIL.formatDate(issuedAt));
        dto.setExpirationTime(
            FUNCTION_UTIL.applyNullSafety(expirationDate, DATE_TIME_UTIL::formatDate)
        );
    }
}
