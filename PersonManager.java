package com.company;

import java.time.LocalDate;
import java.util.LinkedList;

public class PersonManager {
    LinkedList<Person> persons = new LinkedList<Person>();

    // Object methods
    void createPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
        persons.add(person);
    }

    void createPerson(String firstName, String lastName, LocalDate dateOfBirth, Address address, Sex sex) {
        Person person = new Person(firstName, lastName, dateOfBirth, address, sex);
        persons.add(person);
    }

    void createPerson(String firstName, String lastName, LocalDate dateOfBirth, Sex sex) {
        Person person = new Person(firstName, lastName, dateOfBirth, sex);
        persons.add(person);
    }

    void deletePerson(String lastName) {
        for (Person person: persons) {
            if (person.lastName.equals(lastName)) {
                persons.remove(person);
                return;
            }
        }
    }
}
