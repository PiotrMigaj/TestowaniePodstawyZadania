package pl.migibud.javazaawansowanazadania.students.studentsdatacontainer;

public class Address {

    String city;
    String street;
    String numberOfHouse;

    public Address(String city, String street, String numberOfHouse) {
        this.city = city;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", numberOfHouse='" + numberOfHouse + '\'' +
                '}';
    }
}
