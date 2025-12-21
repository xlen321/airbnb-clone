package com.example.airbnb.dto.internal.booking;

import java.util.UUID;

import com.example.airbnb.dto.api.guest.GuestRequest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddGuestToBookingCommand {
    @NotNull
    private UUID bookingId;

    @NotNull
    @Valid
    private GuestRequest guest;

    @NotNull
    private UUID requestedBy;
}
