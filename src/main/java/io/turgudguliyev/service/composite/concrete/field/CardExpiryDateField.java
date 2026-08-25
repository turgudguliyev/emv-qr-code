package io.turgudguliyev.service.composite.concrete.field;

import static io.turgudguliyev.model.enums.QrTag.CARD_EXPIRY_DATE;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.QrField;
import org.springframework.stereotype.Component;

@Component
public class CardExpiryDateField implements QrField {

  @Override
  public String build(QrCompositeDto dto) {
    return format(CARD_EXPIRY_DATE.getId(), dto.getHashedCardExpiryDate());
  }
}