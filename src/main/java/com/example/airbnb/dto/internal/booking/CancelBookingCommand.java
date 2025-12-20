package com.example.airbnb.dto.internal.booking;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancelBookingCommand {
    private UUID bookingId;
    private UUID requestedBy;
    private String reason;
}
