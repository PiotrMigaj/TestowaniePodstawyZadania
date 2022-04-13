package pl.migibud.workexamples.funcinter.workerexample;

public class Worker {

    private String name;
    private Address address;

    public Worker(String name, String street,String number) {
        this.name = name;
        this.address = new Address();
        this.address.setStreet(street);
        this.address.setNumber(number);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static class Address{

        private String street;
        private String number;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
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
