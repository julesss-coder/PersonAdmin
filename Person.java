public class Person {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Address address;
    private String sex; // should be enum

    // Overloading constructor
    // What is the return type of constructor?
    public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
    }

    // How to pass in address if it is a separate class with various attributes?
    public Person(String firstName, String lastName, String dateOfBirth, Address address, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.sex = sex;
    }

    public Person (String firstName, String lastName, String dateOfBirth, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
    }

    private Person createPerson(String firstName, String lastName) {
        return new Person(firstName, lastName);
    }

    private Person createPerson(String firstName, String lastName, String dateOfBirth, Address address, String sex) {
        return new Person(firstName, lastName, dateOfBirth, address, sex);
    }

    private Person createPerson(String firstName, String lastName, String dateOfBirth, String sex) {
        return new Person(firstName, lastName, dateOfBirth, sex);
    }

    // getters and setters
    // Q: Do I have to write a getter and setter for each attribute of Person object?
    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setAddress(String streetName, int streetNumber, int doorNumber, int zipCode, String city) {
        this.address = new Address(streetName, streetNumber, doorNumber, zipCode, city);
    }

    public String getAddress() {
        // How to return a string of the complete address?
        return this.address.getAddress();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex =  sex;
    }


}
