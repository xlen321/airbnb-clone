package com.example.airbnb.exceptions.domain;

public class BookingNotFoundException extends DomainException {
    public BookingNotFoundException(String message) {
        super(message);
    }
}
