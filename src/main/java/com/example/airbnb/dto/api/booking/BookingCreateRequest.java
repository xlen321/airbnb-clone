package com.example.airbnb.dto.api.booking;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingCreateRequest {
    private UUID roomId;
    private LocalDate checkIn;
    private LocalDateTime checkOut;
}
