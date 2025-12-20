package com.example.airbnb.dto.api.room;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomResponse {
    private UUID id;
    private String roomType;
    private double basePrice;
    private boolean isActive;
}
