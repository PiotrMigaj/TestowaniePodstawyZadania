package pl.migibud.polimorfizmtest;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    public void ride() {
        System.out.println(this.getName()+" car rides");
    }

    public void rideCar(){
        System.out.println(this.getName()+" car rides SECOND");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + getName() + '\'' +
                '}';
    }



}
