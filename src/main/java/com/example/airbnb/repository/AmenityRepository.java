package com.example.airbnb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airbnb.models.amenity.Amenity;

public interface AmenityRepository extends JpaRepository<Amenity, Long> {
    List<Amenity> findByNameContainingIgnoreCase(String name);
}
