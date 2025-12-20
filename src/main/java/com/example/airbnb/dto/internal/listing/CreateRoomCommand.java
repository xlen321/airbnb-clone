package com.example.airbnb.dto.internal.listing;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateRoomCommand {
    private UUID hotelId;
    private String roomType;
    private BigDecimal basePrice;
}
