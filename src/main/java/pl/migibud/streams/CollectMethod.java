package pl.migibud.streams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Dodge",250,300_000,4));
        cars.add(new Car("Citroen",180,200_000,3));
        cars.add(new Car("Opel",220, 150_000,4));
        cars.add(new Car("Merc",250,400_000,5));
        cars.add(new Car("GMC",170,100_000,3));
        cars.add(new Car("Porsche",300,800_000,5));
        cars.add(new Car("BMW",240,300_000,5));

        List<Car> list = cars.stream().filter(car -> car.price<300_000)
                .collect(Collectors.toList());

        ArrayList<Car> carArrayList = new ArrayList<>(list);

        Iterator<Car> iterator = carArrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
