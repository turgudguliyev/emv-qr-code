package io.turgudguliyev.service.concrete;

import io.turgudguliyev.model.request.QrOperationRequest;
import io.turgudguliyev.model.response.QrOperationResponse;
import io.turgudguliyev.service.abstraction.QrOperationService;
import io.turgudguliyev.service.factory.QrPayloadFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static io.turgudguliyev.mapper.QrCompositeMapper.QR_COMPOSITE_MAPPER;
import static io.turgudguliyev.mapper.QrOperationMapper.QR_OPERATION_MAPPER;
import static io.turgudguliyev.util.IdentifierUtil.IDENTIFIER_UTIL;

@Service
@RequiredArgsConstructor
public class QrOperationServiceHandler implements QrOperationService {
    private final QrPayloadFactory qrPayloadFactory;

    @Override
    public QrOperationResponse create(QrOperationRequest request) {
        var dto = QR_COMPOSITE_MAPPER.toQrCompositeDto(IDENTIFIER_UTIL.generateOperationId(), request);
        var payload = qrPayloadFactory.preparePayload(dto);
        return QR_OPERATION_MAPPER.toQrOperationResponse(payload);
    }
}