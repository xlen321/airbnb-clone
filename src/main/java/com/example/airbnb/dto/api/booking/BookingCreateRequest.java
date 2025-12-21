package com.example.airbnb.dto.api.booking;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class BookingCreateRequest {
    @NotNull(message = "Room id is required")
    private UUID roomId;
    
    @NotNull(message = "Check-in date is required")
    @Future(message = "Check-in date must be in future")
    private LocalDate checkIn;
    
    @NotNull(message = "Check-out date is required")
    @Future(message = "Check-out date must be in future")
    private LocalDateTime checkOut;
}
