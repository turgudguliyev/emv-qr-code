package io.turgudguliyev.service.composite.concrete.field;

import static io.turgudguliyev.model.enums.QrTag.CARD_PAN;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.field.QrField;
import org.springframework.stereotype.Component;

@Component
public class CardPanField implements QrField {

  @Override
  public String build(QrCompositeDto dto) {
    return format(CARD_PAN.getId(), dto.getHashedCardPan());
  }
}