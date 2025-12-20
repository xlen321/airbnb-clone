package com.example.airbnb.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airbnb.models.user.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    Optional<User> findByEmOptional(String email);
    boolean existsByEmail(String email);
}
