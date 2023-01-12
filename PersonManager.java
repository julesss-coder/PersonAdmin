package com.company;

import java.util.ArrayList;
import java.util.Date;

public class PersonManager {
//    ArrayList<Person> persons; // turn into LinkedList
    ArrayList<Person> persons = new ArrayList();

    // no custom constructor necessary, as there are not parameters to pass in?

    // Object methods
    void createPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
       // add person here, on in separate method?
        persons.add(person);
    }

    void createPerson(String firstName, String lastName, Date dateOfBirth, Address address, String sex) {
        Person person = new Person(firstName, lastName, dateOfBirth, address, sex);
       // add person here, on in separate method?
        persons.add(person);
    }

    void createPerson(String firstName, String lastName, Date dateOfBirth, String sex) {
        Person person = new Person(firstName, lastName, dateOfBirth, sex);
       // add person here, on in separate method?
        persons.add(person);
    }
}
