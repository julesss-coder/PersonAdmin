package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.Scanner;

public class PersonManager {
    private LinkedList<Person> persons = new LinkedList<Person>(); // was heisst ~~?

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
        throw new NullPointerException();
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

    public void getUserInput() throws InvalidInputException, InvalidPersonNameException {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter first name.");
        System.out.println("To terminate, write `:q!`");
        // How do I check if user wants to quit?
        String firstName = myScanner.nextLine();
        this.registerUserTermination(firstName);
        if (this.checkNameForDigit(firstName)) {
            throw new InvalidPersonNameException("The name must not contain a digit.");
        }
        if (firstName.trim().length() == 0) {
            throw new InvalidInputException("You did not enter an input.");
        }

        System.out.println("Enter last name.");
        String lastName = myScanner.nextLine();
        this.registerUserTermination(lastName);
        if (this.checkNameForDigit(lastName)) {
            throw new InvalidPersonNameException("The name must not contain a digit.");
        }

        if (lastName.trim().length() == 0) {
            throw new InvalidInputException("You did not enter an input.");
        }

        System.out.println("Enter date of birth (format: YYYY-MM-DD.");
        String dob = myScanner.nextLine();
        this.registerUserTermination(dob);
        if (dob.trim().length() == 0) {
            throw new InvalidInputException("You did not enter an input.");
        }
        LocalDate dateOfBirth = null;
        try {
            dateOfBirth = LocalDate.parse(dob); // should throw an exception if format not correct
        } catch (DateTimeParseException e){
            e.printStackTrace();
            System.out.println("Date must be in YYYY-MM-DD format.");
        }

        System.out.println("Enter an address:");
        System.out.println("Enter a street name:");
        String streetName = myScanner.nextLine();
        this.registerUserTermination(streetName);
        if (streetName.trim().length() == 0) {
            throw new InvalidInputException("You did not enter an input.");
            // assign null, as it is not a required field?
        }

        System.out.println("Enter a street number:");
        String streetNumber = myScanner.nextLine();
        this.registerUserTermination(streetNumber);
        if (streetNumber.trim().length() == 0) {
            throw new InvalidInputException("You did not enter an input.");
            // assign null?
        }

        System.out.println("Enter a ZIP code:");
        String zipCode = myScanner.nextLine();
        this.registerUserTermination(zipCode);
        if (zipCode.trim().length() == 0) {
            throw new InvalidInputException("You did not enter an input.");
        }

        System.out.println("Enter the person's sex (F for female, M for male):");
        String sex = myScanner.nextLine().toUpperCase();
        this.registerUserTermination(sex);
        if (sex.trim().length() == 0) {
            throw new InvalidInputException("You did not enter an input.");
        // Does not work: F or M input does not pass test
        } else if (!(sex.equals("M") || sex.equals("F"))) {
            throw new InvalidInputException("`Sex` can only be `F` or `M`.");
        }

        // How to make `sex` into data type `Sex`?
        if (sex.equals("F")){
            sex = "FEMALE";
        } else{
            sex = "MALE";
        }

        this.createPerson(firstName, lastName, dateOfBirth, new Address(streetName, streetNumber, zipCode), Sex.valueOf(sex));
    }

    public Boolean checkNameForDigit(String userInput) {
        char[] chars = userInput.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public Boolean registerUserTermination(String userInput) {
        if (userInput.equals(":q!")) {
            return true;
        }
        return false;
    }
}
