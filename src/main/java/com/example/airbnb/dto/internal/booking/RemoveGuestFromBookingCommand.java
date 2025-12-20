package com.example.airbnb.dto.internal.booking;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RemoveGuestFromBookingCommand {
    private UUID bookingId;
    private Long guestId;
    private UUID requestedBy;
}
