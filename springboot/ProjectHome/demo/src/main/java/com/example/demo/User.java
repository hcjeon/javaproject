package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String address;

    private String postalCode;

    private String city;

    private String country;

    public User() {

    }

    public User(Long id, String firstName, String lastName, String email, String address, String postalCode, String city, String country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
}
