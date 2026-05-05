package com.example.advancePoly;

public class Address {

    private String city;
    private String street;

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getFullAddress(){
        return street+", "+city;
    }
}
