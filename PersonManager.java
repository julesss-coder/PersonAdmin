package com.company;

import java.time.LocalDate;
import java.util.LinkedList;

public class PersonManager {
    private LinkedList<Person> persons = new LinkedList<Person>();

    // Object methods
    public void createPerson(String firstName, String lastName) {
        Person person = new Person(firstName, lastName);
        persons.add(person);
    }

    public void createPerson(String firstName, String lastName, LocalDate dateOfBirth, Address address, Sex sex) {
        Person person = new Person(firstName, lastName, dateOfBirth, address, sex);
        persons.add(person);
    }

    public void createPerson(String firstName, String lastName, LocalDate dateOfBirth, Sex sex) {
        Person person = new Person(firstName, lastName, dateOfBirth, sex);
        persons.add(person);
    }

    public void getPerson(String lastName) {
        for (Person person: persons) {
            if (person.lastName.equals(lastName)) {
                System.out.println(person.toString());
                return;
            }
        }
    }

    public void listPersons() {
        System.out.println("Current list of persons:");
        for (Person person: persons) {
            System.out.println(person.toString());
        }
    }

    // A getter/setter gets or sets the fields of this class, so this is not a getter/setter, as it changes only a single entry in `persons`:
    public void deletePerson(String lastName) {
        for (Person person: persons) {
            if (person.lastName.equals(lastName)) {
                persons.remove(person);
                return;
            }
        }
    }
}
