package com.example.airbnb.dto.api.booking;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingResponse {
    private UUID bookingId;
    private UUID roomId;
    private UUID userId;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private BigDecimal totalPrice;
    private String bookingStatus;
}
