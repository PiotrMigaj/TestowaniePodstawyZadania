package pl.migibud.streams;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class SummingInt {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Dodge",250,300_000,4));
        cars.add(new Car("Citroen",180,200_000,3));
        cars.add(new Car("Opel",220, 150_000,4));
        cars.add(new Car("Merc",250,400_000,5));
        cars.add(new Car("GMC",170,100_000,3));
        cars.add(new Car("Porsche",300,800_000,5));
        cars.add(new Car("BMW",240,300_000,5));

        int totalPrice = cars.stream().collect(Collectors.summingInt(car-> car.price));
        System.out.println(totalPrice);
    }
}
