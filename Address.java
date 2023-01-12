package com.company;

public class Address {
    String streetName;
    String streetNumber;
    int houseNumber;
    String zipCode; // zip codes can include characters other than numbers

    Address(String streetName, String streetNumber, int houseNumber, String zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                ", houseNumber=" + houseNumber +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
