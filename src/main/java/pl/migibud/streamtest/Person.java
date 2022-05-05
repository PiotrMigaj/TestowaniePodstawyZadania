package pl.migibud.streamtest;

public class Person implements Human {

    private String fullName;
    private String city;

    public Person(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public void introduceYourSelf() {
        System.out.println("Hello, this is: "+this.fullName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
