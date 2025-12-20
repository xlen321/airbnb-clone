package com.example.airbnb.dto.api.guest;

import com.example.airbnb.models.guest.Gender;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GuestResponse {
    private String fullName;
    private Integer age;
    private Gender gender;
}
