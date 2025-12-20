package com.example.airbnb.dto.internal.guest;

import java.util.UUID;

import com.example.airbnb.models.guest.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateGuestDetailsCommand {
    private UUID bookingId;
    private Long guestId;
    private UUID requestedBy;
    private String fullName;
    private Integer age;
    private Gender gender;
    private String documentId;
}
