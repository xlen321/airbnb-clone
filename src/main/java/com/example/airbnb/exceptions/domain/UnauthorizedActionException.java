package com.example.airbnb.exceptions.domain;

public class UnauthorizedActionException extends DomainException {
    public UnauthorizedActionException(String message) {
        super(message);
    }
}
