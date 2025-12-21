package com.example.airbnb.dto.internal.guest;

import java.util.UUID;

import com.example.airbnb.models.guest.Gender;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateGuestDetailsCommand {
    @NotNull
    private UUID bookingId;

    @NotNull
    private Long guestId;

    @NotNull
    private UUID requestedBy;

    @NotBlank
    @Size(max = 100)
    private String fullName;

    @NotNull
    @Min(0)
    @Max(100)
    private Integer age;

    @NotNull
    private Gender gender;

    @NotBlank
    @Size(max = 50)
    private String documentId;
}
