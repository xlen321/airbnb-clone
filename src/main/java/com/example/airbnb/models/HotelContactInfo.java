package com.example.airbnb.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class HotelContactInfo {
    /* ---------- Address ---------- */
    @Column(name = "address_line_1")
    private String addressLine1;

    @Column(name = "address_line_2")
    private String addressLine2;

    private String city;
    private String state;
    private String country;
    private String zipCode;

    /* ---------- Geo Location ---------- */
    private Double latitude;
    private Double longitude;

    /* ---------- Contact ---------- */
    private String phone;
    private String email;
}
