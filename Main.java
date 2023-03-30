package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();

        try {
            personManager.getUserInput();
        } catch (InvalidInputException | InvalidPersonNameException e) {
            e.printStackTrace();
        }

        personManager.createPerson("Julia", "F", LocalDate.of(1990, 01, 01), new Address("Hauptplatz", "1", "4040"), Sex.FEMALE);
        personManager.createPerson("Mandy", "Moore");
        personManager.createPerson("Jeffrey", "Lebowski", LocalDate.of(1990, 12, 15), Sex.MALE);

        try {
            personManager.getPerson("Lebowski");
        } catch (NullPointerException e) {
           e.printStackTrace();
        }

        personManager.listPersons();
        personManager.deletePerson("Lebowski");
        personManager.listPersons();

    }
}
