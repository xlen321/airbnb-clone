package com.example.airbnb.dto.api.hotel;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelResponse {
    private UUID id;
    private String name;
    private String city;
    private boolean isActive;
}
