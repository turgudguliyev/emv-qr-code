package io.turgudguliyev.service.composite.concrete.field;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.SubjectInformationField;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.ALIAS_VALUE;

@Component
public class AliasValueField implements SubjectInformationField {

    @Override
    public String build(QrCompositeDto dto) {
        return format(ALIAS_VALUE.getId(), dto.getAliasValue());
    }
}