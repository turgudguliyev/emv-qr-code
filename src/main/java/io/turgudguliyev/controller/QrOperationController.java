package io.turgudguliyev.controller;

import io.turgudguliyev.model.request.QrOperationRequest;
import io.turgudguliyev.model.response.QrOperationResponse;
import io.turgudguliyev.service.abstraction.QrOperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("v1/qr-operations")
@RequiredArgsConstructor
public class QrOperationController {
    private final QrOperationService qrOperationService;

    @PostMapping
    @ResponseStatus(CREATED)
    public QrOperationResponse create(@RequestBody QrOperationRequest request) {
        return qrOperationService.create(request);
    }
}