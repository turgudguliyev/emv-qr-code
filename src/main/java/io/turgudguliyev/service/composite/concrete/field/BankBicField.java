package io.turgudguliyev.service.composite.concrete.field;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.SubjectInformationField;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.BANK_BIC;

@Component
public class BankBicField implements SubjectInformationField {

    @Override
    public String build(QrCompositeDto dto) {
        return format(BANK_BIC.getId(), dto.getPseudoBic());
    }
}