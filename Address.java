package com.company;

public class Address {
    String streetName;
    String streetNumber;
    String zipCode; // Data type string, as zip codes can include characters other than numbers.

    Address(String streetName, String streetNumber, String zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
