package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.MERCHANT_CITY;

@Component
public class MerchantCitySection implements QrSection {

    @Override
    public String build(QrCompositeDto dto) {
        return format(MERCHANT_CITY.getId(), dto.getMerchantCity());
    }
}