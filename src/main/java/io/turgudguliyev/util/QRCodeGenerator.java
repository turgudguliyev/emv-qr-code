package io.turgudguliyev.util;

import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Writer;
import lombok.SneakyThrows;

import java.io.ByteArrayOutputStream;

import static io.turgudguliyev.model.constants.QrConstants.*;
import static io.turgudguliyev.util.Base64Converter.BASE_64_CONVERTER;
import static com.google.zxing.BarcodeFormat.QR_CODE;
import static com.google.zxing.client.j2se.MatrixToImageWriter.writeToStream;

public enum QRCodeGenerator {
    QR_CODE_GENERATOR;

    private final Writer writer = new MultiFormatWriter();

    @SneakyThrows
    public String generateQR(String payload) {
        var bitMatrix = writer.encode(payload, QR_CODE, QR_CODE_SIZE, QR_CODE_SIZE, HINTS);
        try (var outputStream = new ByteArrayOutputStream()) {
            writeToStream(bitMatrix, QR_CODE_FORMAT, outputStream);
            return BASE_64_CONVERTER.encodeToString(outputStream.toByteArray());
        }
    }
}