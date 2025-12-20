package com.example.airbnb.exceptions.domain;

public class BookingNotAllowedException extends DomainException {
    public BookingNotAllowedException(String message) {
        super(message);
    }
}
