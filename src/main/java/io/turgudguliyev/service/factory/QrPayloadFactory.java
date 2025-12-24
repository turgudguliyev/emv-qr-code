package io.turgudguliyev.service.factory;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static io.turgudguliyev.util.CyclicRedundancyCheckUtil.CRC;

@Component
@RequiredArgsConstructor
public class QrPayloadFactory {
    private final List<QrSection> sections;

    public String preparePayload(QrCompositeDto dto) {
        var payload = sections.stream()
                              .map(it -> it.build(dto))
                              .collect(Collectors.joining());
        return CRC.append(payload);
    }
}