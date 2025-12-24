package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.PAYLOAD_FORMAT_INDICATOR;

@Component
public class FormatIndicatorSection implements QrSection {

    @Override
    public String build(QrCompositeDto dto) {
        return format(PAYLOAD_FORMAT_INDICATOR.getId(), dto.getVersion());
    }
}