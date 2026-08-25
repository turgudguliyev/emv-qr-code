package io.turgudguliyev.service.composite.concrete.section;

import static io.turgudguliyev.model.enums.QrTag.CARD_PAN;

import io.turgudguliyev.model.dto.QrCompositeDto;
import io.turgudguliyev.service.composite.abstraction.section.QrSection;
import org.springframework.stereotype.Component;

@Component
public class CardPanSection implements QrSection {

  @Override
  public String build(QrCompositeDto dto) {
    return format(CARD_PAN.getId(), dto.getHashedCardPan());
  }
}