package com.example.airbnb.exceptions.domain;

public abstract class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
