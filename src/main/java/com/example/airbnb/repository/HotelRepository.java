package com.example.airbnb.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airbnb.models.hotel.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, UUID> {
    List<Hotel> findByIsActiveTrue();
    List<Hotel> findByCityIgnoreCaseAndIsActiveTrue(String city);
}
