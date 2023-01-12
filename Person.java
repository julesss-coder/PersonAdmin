package com.company;

import java.util.Date;

public class Person {
    String firstName;
    String lastName;
    Date dateOfBirth;
    Address address;
    // Change to enum
    String sex;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(String firstName, String lastName, Date dateOfBirth, Address address, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.sex = sex;
    }

    Person(String firstName, String lastName, Date dateOfBirth, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }


}
