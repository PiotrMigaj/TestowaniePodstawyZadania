package pl.migibud.workexamples.funcinter.testing.Worker;

public class Worker {

    private String firstName;
    private String lastName;
    private Address address;

    public Worker(String firstName, String lastName, String street, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = new Address(street,number);

    }

    public Address getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Address{

        private String street;
        private String number;

        public Address(String street, String number) {
            this.street = street;
            this.number = number;
        }


        public void setStreet(String street) {
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", number='" + number + '\'' +
                    '}';
        }
    }
}
