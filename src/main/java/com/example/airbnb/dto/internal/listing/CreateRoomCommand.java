package com.example.airbnb.dto.internal.listing;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateRoomCommand {
    @NotNull
    private UUID hotelId;

    @NotBlank
    private String roomType;

    @NotNull
    @DecimalMin(value = "0.01")
    private BigDecimal basePrice;
}
