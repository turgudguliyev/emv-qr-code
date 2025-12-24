package io.turgudguliyev.service.composite.abstraction;

import io.turgudguliyev.model.dto.QrCompositeDto;

public interface QrElement extends QrTagLengthValueFormatter {

    String build(QrCompositeDto dto);
}