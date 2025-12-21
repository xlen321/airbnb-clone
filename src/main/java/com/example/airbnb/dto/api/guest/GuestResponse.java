package com.example.airbnb.dto.api.guest;

import com.example.airbnb.models.guest.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GuestResponse {
    private String fullName;
    private Integer age;
    private Gender gender;
}
