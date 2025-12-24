package io.turgudguliyev.service.composite.concrete.section;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import org.springframework.stereotype.Component;

import static io.turgudguliyev.model.enums.QrTag.MERCHANT_CATEGORY_CODE;

@Component
public class MerchantCategoryCodeSection implements QrSection {

    @Override
    public String build(QrCompositeDto dto) {
        return format(MERCHANT_CATEGORY_CODE.getId(), dto.getMerchantCategoryCode());
    }
}