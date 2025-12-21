package com.example.airbnb.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public final class TimeUtil {
    private TimeUtil() {}

    public static LocalDate today() {
        return LocalDate.now(ZoneOffset.UTC);
    }
    
    public static LocalDateTime now() {
        return LocalDateTime.now(ZoneOffset.UTC);
    }
}
