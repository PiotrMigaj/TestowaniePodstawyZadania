package pl.migibud.bankaccount;

public class Owner {

    private String name;
    private String lastName;
    Address address;

    public Owner(String name, String lastName, Address address) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    static class Address{

        String street;
        String number;


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


}
