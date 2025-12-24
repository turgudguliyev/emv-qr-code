package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.GLOBAL_IDENTIFIER;

@Component
public class GlobalIdentifierSection implements QrSection {

    @Override
    public String build(QrCompositeDto dto) {
        return format(GLOBAL_IDENTIFIER.getId(), dto.getId());
    }
}