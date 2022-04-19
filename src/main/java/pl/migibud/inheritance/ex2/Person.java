package pl.migibud.inheritance.ex2;

public class Person {

    String name, address;

    public Person(){
        this.name="";
        this.address="";
    }

    public Person(Person person) {
        this.name = person.name;
        this.address = person.address;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%s -> %s",this.name,this.address);
    }
}

