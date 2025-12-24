package io.turgudguliyev.service.abstraction;

import io.turgudguliyev.model.request.QrOperationRequest;
import io.turgudguliyev.model.response.QrOperationResponse;

public interface QrOperationService {

    QrOperationResponse create(QrOperationRequest request);
}