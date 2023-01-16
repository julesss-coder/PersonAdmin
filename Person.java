package com.company;

import java.time.LocalDate;

public class Person {
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    Address address;
    Sex sex;

    Person(String firstName, String lastName) {
        this(firstName, lastName, null, null);
    }

    Person(String firstName, String lastName, LocalDate dateOfBirth, Address address, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.sex = sex;
    }

    Person(String firstName, String lastName, LocalDate dateOfBirth, Sex sex) {
        this(firstName, lastName, dateOfBirth, null, sex);
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address=" + address +
                ", sex='" + sex + '\'' +
                '}';
    }
}
