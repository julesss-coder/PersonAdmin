import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    // Only one class in project needs to have main method. It is used to actually run the code in the other classes
    public static void main(String[] args) {
        Person newPerson = new Person("Julia", "F", "5. Dezember 1982", "f");
        System.out.println(newPerson.getSex());
        newPerson.setAddress("Strasse", 12, 45, 4030, "Linz");
        String newAddress = newPerson.getAddress();
        System.out.println(newAddress);



        /*
        ### Main
        - generates new PersonAdmin

        ### Classes
        ---------------------------------------
        - PersonAdmin
            #### Attributes

            #### Methods
            // createPerson with name only
            - createPerson
                Call new Person()
            // createPerson with all values
            - createPerson
                Call new Person()
            // createPerson with name, sex, DOB
            - createPerson
                Call new Person()

        ---------------------------------------
        - Person
            #### Attributes
            - firstName
            - lastName
            - dateOfBirth
            - address:
                call new Address()
            - sex // Enum
            #### Methods

        ---------------------------------------
        - Address
            #### Attributes
            - streetName
            - streetNumber
            - city
            - zip code
            - country
            - email
            - phone

         */


    }
}
