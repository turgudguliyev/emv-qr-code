package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.COUNTRY_CODE;

@Component
public class CountryCodeSection implements QrSection {

    @Override
    public String build(QrCompositeDto dto) {
        return format(COUNTRY_CODE.getId(), dto.getCountryCode());
    }
}