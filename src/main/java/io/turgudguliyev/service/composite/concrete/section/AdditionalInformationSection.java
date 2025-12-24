package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.AdditionalInformationField;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static io.turgudguliyev.model.enums.QrTag.ADDITIONAL_INFORMATION;

@Component
@RequiredArgsConstructor
public class AdditionalInformationSection implements QrSection {
    private final List<AdditionalInformationField> fields;

    @Override
    public String build(QrCompositeDto dto) {
        var value = fields.stream()
                          .map(it -> it.build(dto))
                          .collect(Collectors.joining());
        return format(ADDITIONAL_INFORMATION.getId(), value);
    }
}