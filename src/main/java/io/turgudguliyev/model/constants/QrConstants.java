package io.turgudguliyev.model.constants;

import static com.google.zxing.EncodeHintType.CHARACTER_SET;
import static com.google.zxing.EncodeHintType.ERROR_CORRECTION;
import static com.google.zxing.EncodeHintType.MARGIN;
import static lombok.AccessLevel.PRIVATE;

import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = PRIVATE)
public final class QrConstants {
    public static final String QR_CODE_FORMAT = "PNG";
    public static final int QR_CODE_SIZE = 500;
    public static final Map<EncodeHintType, String> HINTS =
        Map.of(CHARACTER_SET, "utf-8", MARGIN, "0", ERROR_CORRECTION, ErrorCorrectionLevel.M.name());
    public static final String VERSION = "01";
    public static final String COUNTRY_CODE = "AZ";
    public static final int EXPIRATION_MINUTES = 3;
    public static final String CRC_TAG_AND_LENGTH = "6304";
}