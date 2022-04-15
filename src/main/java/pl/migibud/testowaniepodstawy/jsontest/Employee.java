package pl.migibud.testowaniepodstawy.jsontest;

public class Employee {

    private String name;
    private String city;

    public Employee(){}


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
