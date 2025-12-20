package com.example.airbnb.dto.api.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest {
    private String fullName;
    private String email;
    private String password;
}
