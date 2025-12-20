package com.example.airbnb.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.airbnb.models.payment.Payment;
import com.example.airbnb.models.payment.PaymentStatus;


public interface PaymentRepository extends JpaRepository<Payment, UUID> {
    List<Payment> findByBookingId(UUID bookingId);
    List<Payment> findByStatus(PaymentStatus status);
}
