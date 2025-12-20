package com.example.airbnb.dto.api.payment;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {
    private UUID bookingId;
    private BigDecimal amount;
    private String paymentMethod;
}
