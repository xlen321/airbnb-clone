package com.example.airbnb.dto.internal.booking;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CancelBookingCommand {
    @NotNull
    private UUID bookingId;

    @NotNull
    private UUID requestedBy;

    @NotBlank
    @Size(max = 255)
    private String reason;
}
