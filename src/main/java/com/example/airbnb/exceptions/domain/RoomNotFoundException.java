package com.example.airbnb.exceptions.domain;

public class RoomNotFoundException extends DomainException {
    public RoomNotFoundException(String message) {
        super(message);
    }
}
