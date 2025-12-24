package io.turgudguliyev.util;

import static io.turgudguliyev.model.constants.QrConstants.CRC_TAG_AND_LENGTH;

public enum CyclicRedundancyCheckUtil {
    CRC;

    private static final int MSB = 0x8000;
    private static final int INIT = 0xFFFF;
    private static final int POLY = 0x1021;

    public String append(String payload) {
        var data = payload.concat(CRC_TAG_AND_LENGTH);
        var crc = Integer.toHexString(calculateCrc(data))
                         .toUpperCase();
        return data.concat(crc);
    }

    private int calculateCrc(String data) {
        var crc = INIT;

        for (var b : data.getBytes()) {
            crc ^= (b & 0xFF) << 8;
            for (var i = 0; i < 8; i++) {
                crc = (crc & MSB) != 0 ? (crc << 1) ^ POLY
                                       : (crc << 1);
            }
        }

        return crc & 0xFFFF;
    }
}