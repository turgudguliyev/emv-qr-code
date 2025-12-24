package io.turgudguliyev.service.composite.concrete.field;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.SpecificInformationField;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.TRANSACTION_TYPE;

@Component
public class TransactionTypeField implements SpecificInformationField {

    @Override
    public String build(QrCompositeDto dto) {
        return format(TRANSACTION_TYPE.getId(), dto.getTransactionType());
    }
}