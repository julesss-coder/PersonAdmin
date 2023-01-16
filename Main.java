package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();

        // How can I step into `Address` from here?
        // Step into -> all methods you can step into are highlighted. Click Address.
        // OR: Set breakpoint in class Address and step into it.
        personManager.createPerson("Julia", "F", LocalDate.of(1990, 01, 01), new Address("Hauptplatz", "1", 1, "4040"), Sex.FEMALE);
        personManager.createPerson("Mandy", "Moore");
        personManager.createPerson("Jeffrey", "Lebowski", LocalDate.of(1990, 12, 15), Sex.MALE );

        System.out.println("Phone book after adding persons:");
        for (Person person: personManager.persons) {
            System.out.println(person.toString());
        }

        personManager.deletePerson("Lebowski");

        System.out.println("Phone book after deleting a person:");
        for (Person person: personManager.persons) {
            System.out.println(person.toString());
        }
    }
}
