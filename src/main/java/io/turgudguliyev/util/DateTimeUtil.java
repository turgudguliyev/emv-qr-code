package io.turgudguliyev.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static io.turgudguliyev.model.constants.DateTimeConstants.DATE_TIME_FORMAT;

public enum DateTimeUtil {
    DATE_TIME_UTIL;

    public String formatDate(LocalDateTime time) {
        return DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)
                                .format(time);
    }

    public LocalDateTime getCurrentTime() {
        return LocalDateTime.now();
    }

    public LocalDateTime addMinutes(LocalDateTime now, int minutes) {
        return now.plusMinutes(minutes);
    }
}