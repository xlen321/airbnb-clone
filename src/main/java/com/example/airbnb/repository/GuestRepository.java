package com.example.airbnb.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airbnb.models.guest.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByBookingId(UUID bookingId);
}
