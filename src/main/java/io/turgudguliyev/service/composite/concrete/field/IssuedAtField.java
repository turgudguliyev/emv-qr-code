package io.turgudguliyev.service.composite.concrete.field;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.MainInformationField;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.ISSUED_AT;

@Component
public class IssuedAtField implements MainInformationField {

    @Override
    public String build(QrCompositeDto dto) {
        return format(ISSUED_AT.getId(), dto.getIssuedAt());
    }
}