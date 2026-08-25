package io.turgudguliyev.mapper;

import static io.turgudguliyev.util.QRCodeGenerator.QR_CODE_GENERATOR;

import io.turgudguliyev.model.response.QrOperationResponse;

public enum QrOperationMapper {
    QR_OPERATION_MAPPER;

    public QrOperationResponse toQrOperationResponse(String payload) {
        return QrOperationResponse.of(QR_CODE_GENERATOR.generateQR(payload), payload);
    }
}