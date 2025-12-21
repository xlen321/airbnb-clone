package com.example.airbnb.dto.api.hotel;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class HotelResponse {
    private UUID id;
    private String name;
    private String city;
    private boolean isActive;
}
