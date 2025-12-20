package com.example.airbnb.dto.api.payment;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentResponse {
    private String paymentId;
    private String bookingId;
    private String paymentStatus;
    private BigDecimal amount; 
}
