package com.example.airbnb.exceptions.domain;

public class RoomNotAvailableException extends DomainException {
    public RoomNotAvailableException(String message) {
        super(message);
    }
}
