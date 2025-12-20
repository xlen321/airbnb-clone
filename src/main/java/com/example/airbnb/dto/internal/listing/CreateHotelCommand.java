package com.example.airbnb.dto.internal.listing;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateHotelCommand {
    private UUID hostUserId;
    private String name;
    private String city;
    private boolean submitForReview;
}
