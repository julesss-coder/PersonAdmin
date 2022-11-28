public class Address {
    private String streetName;
    private int streetNumber;
    private int doorNumber;
    private int zipCode;
    private String city;

    public Address(String streetName, int streetNumber, int doorNumber, int zipCode, String city) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.doorNumber = doorNumber;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getAddress() {
        return streetName + " " + streetNumber + "/" + doorNumber + ", " + zipCode + " " + city;
    }


}
