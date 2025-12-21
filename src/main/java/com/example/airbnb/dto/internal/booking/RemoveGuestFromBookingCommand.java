package com.example.airbnb.dto.internal.booking;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RemoveGuestFromBookingCommand {
    @NotNull
    private UUID bookingId;

    @NotNull
    private Long guestId;

    @NotNull
    private UUID requestedBy;
}
