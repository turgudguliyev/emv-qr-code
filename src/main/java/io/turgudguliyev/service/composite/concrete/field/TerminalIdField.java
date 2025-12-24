package io.turgudguliyev.service.composite.concrete.field;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.AdditionalInformationField;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.TERMINAL_ID;

@Component
public class TerminalIdField implements AdditionalInformationField {

    @Override
    public String build(QrCompositeDto dto) {
        return format(TERMINAL_ID.getId(), dto.getTerminalId());
    }
}