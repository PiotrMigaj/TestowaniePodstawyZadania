package pl.migibud.polimorfizmtest;

public class Vehicle {

    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void ride(){
        System.out.println(this.name+" vehicle rides");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
