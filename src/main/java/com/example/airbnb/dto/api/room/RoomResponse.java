package com.example.airbnb.dto.api.room;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RoomResponse {
    private UUID id;
    private String roomType;
    private double basePrice;
    private boolean isActive;
}
