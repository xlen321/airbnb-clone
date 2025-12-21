package com.example.airbnb.utils;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;


public final class PaginationUtil {
    private PaginationUtil() {}

    public static Pageable pageable(int page, int size) {
        return PageRequest.of(
            Math.max(page, 0),
            Math.min(size, 50)
        );
    }
}
