package pl.migibud.testowanieZadaniaSDA.ex5;

public class Owner {

    private String firstName;
    private String lastName;
    private Address address;

    public Owner(String firstName, String lastName, String street, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(street,number);
    }

    public Address getAddress() {
        return address;
    }

    private static class Address{

        private String street;
        private String number;



        public Address(String street, String number) {
            this.street = street;
            this.number = number;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }
}
