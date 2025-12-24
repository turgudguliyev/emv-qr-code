package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.MainInformationField;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static io.turgudguliyev.model.enums.QrTag.MAIN_INFORMATION;

@Component
@RequiredArgsConstructor
public class MainInformationSection implements QrSection {
    private final List<MainInformationField> fields;

    @Override
    public String build(QrCompositeDto dto) {
        var value = fields.stream()
                          .map(it -> it.build(dto))
                          .collect(Collectors.joining());
        return format(MAIN_INFORMATION.getId(), value);
    }
}