package com.example.airbnb.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airbnb.models.room.Room;

public interface RoomRepository extends JpaRepository<Room, UUID> {
    List<Room> findByHotelIdAndIsActiveTrue(UUID hotelId);
}
