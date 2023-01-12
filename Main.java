// Keine usereingaben machen, sondern einfach direkt im Code Personen hinzufuegen
// ArrayList zu LinkedList machen, bevor ich getter und setter-Methoden umsetze
// Date ist deprecated --> LocalDate

package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        personManager.createPerson("Julia", "F", new Date(05, 12, 1982), new Address("Neufelderstrasse", "10b", 12, "4030"), "female");
        personManager.createPerson("Mandy", "Moore");
        personManager.createPerson("Jeffrey", "Lebowski", new Date(01, 05, 1957), "male");
    }
}
