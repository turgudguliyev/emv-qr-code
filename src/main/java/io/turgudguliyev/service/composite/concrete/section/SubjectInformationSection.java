package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.SubjectInformationField;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static io.turgudguliyev.model.enums.QrTag.SUBJECT_INFORMATION;

@Component
@RequiredArgsConstructor
public class SubjectInformationSection implements QrSection {
    private final List<SubjectInformationField> fields;

    @Override
    public String build(QrCompositeDto dto) {
        var value = fields.stream()
                          .map(it -> it.build(dto))
                          .collect(Collectors.joining());
        return format(SUBJECT_INFORMATION.getId(), value);
    }
}