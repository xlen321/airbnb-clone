package com.example.airbnb.dto.api.payment;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PaymentResponse {
    private String paymentId;
    private String bookingId;
    private String paymentStatus;
    private BigDecimal amount; 
}
