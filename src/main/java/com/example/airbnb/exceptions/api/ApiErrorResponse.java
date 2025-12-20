package com.example.airbnb.exceptions.api;

import java.time.Instant;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ApiErrorResponse {
    private String statusCode;
    private String message;
    private Instant timestamp;

    public ApiErrorResponse(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
        this.timestamp = Instant.now();
    }
}
