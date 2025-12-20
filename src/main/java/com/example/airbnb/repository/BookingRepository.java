package com.example.airbnb.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airbnb.models.booking.Booking;

public interface BookingRepository extends JpaRepository<Booking, UUID> {
    List<Booking> findByUserId(UUID userId);
    List<Booking> findByRoomIdAndCheckOutAfterAndCheckInBefore(
        UUID roomId,
        LocalDate checkIn,
        LocalDate checkOut
    );
}
