package pl.migibud.polimorfizmtest;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Piotr");
        vehicle.ride();

        Vehicle vehicle1 = new Car("Ania");
        vehicle1.ride();
        Car car = (Car) vehicle1;
        car.rideCar();

        int x = 5;
        double y = x;
        System.out.println(y);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Piotr"));
        carList.add(new Car("Piotr2"));
        carList.add(new Car("Piotr3"));

        System.out.println(carList);

        carList.remove(carList.get(0));

        System.out.println(carList);
    }

}
