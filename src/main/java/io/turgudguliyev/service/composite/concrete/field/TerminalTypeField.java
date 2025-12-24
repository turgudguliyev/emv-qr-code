package io.turgudguliyev.service.composite.concrete.field;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.MainInformationField;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.TERMINAL_TYPE;

@Component
public class TerminalTypeField implements MainInformationField {

    @Override
    public String build(QrCompositeDto dto) {
        return format(TERMINAL_TYPE.getId(), dto.getTerminalType());
    }
}