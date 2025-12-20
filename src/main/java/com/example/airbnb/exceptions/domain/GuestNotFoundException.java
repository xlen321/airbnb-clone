package com.example.airbnb.exceptions.domain;

public class GuestNotFoundException extends DomainException {
    public GuestNotFoundException(String message) {
        super(message);
    }
}
