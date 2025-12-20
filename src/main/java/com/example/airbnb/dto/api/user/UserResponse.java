package com.example.airbnb.dto.api.user;

import java.util.Set;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private UUID id;
    private String fullName;
    private String email;
    private  String profileImageUrl;
    private Set<String> roles;
}
