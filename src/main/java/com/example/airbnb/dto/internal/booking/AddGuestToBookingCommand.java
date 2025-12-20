package com.example.airbnb.dto.internal.booking;

import java.util.UUID;

import com.example.airbnb.dto.api.guest.GuestRequest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddGuestToBookingCommand {
    private UUID bookingId;
    private GuestRequest guest;
    private UUID requestedBy;
}
