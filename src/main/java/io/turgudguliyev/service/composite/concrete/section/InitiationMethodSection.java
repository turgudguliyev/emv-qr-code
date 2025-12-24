package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.POINT_OF_INITIATION_METHOD;

@Component
public class InitiationMethodSection implements QrSection {

    @Override
    public String build(QrCompositeDto dto) {
        return format(POINT_OF_INITIATION_METHOD.getId(), dto.getType());
    }
}