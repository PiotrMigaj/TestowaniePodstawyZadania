package pl.migibud.streams;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsToMap {

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
        //System.out.println(totalPrice);

        Map<String,Car> carsMap = cars.stream().collect(Collectors.toMap(car->car.name,car->car));
        TreeMap<String,Car> treeMapCars = new TreeMap<>(carsMap);


        TreeMap<String,Car> treeMapCars2 = new TreeMap<>(Comparator.comparingInt(String::length));
        treeMapCars2.putAll(treeMapCars);

        System.out.println(treeMapCars2);


//        carsMy.put("Dodge",new Car("Dodge",250,300_000,4));
//        carsMy.put("Porsche",new Car("Porsche",300,800_000,5));
//        carsMy.put("GMC",new Car("GMC",170,100_000,3));



//        Iterator i = carsMy.entrySet().iterator();
//
//        while (i.hasNext()){
//            Map.Entry me = (Map.Entry) i.next();
//            System.out.println(me.getKey()+" - "+me.getValue());
//        }

//        Car car1 = carsMap.get("GMC");
//
//        Comparator<String> myComparator = (String s1,String s2)->s1.compareTo(s2);
//        TreeMap<String,Car> carsSMy = new TreeMap<>(myComparator);
//        carsSMy.putAll(carsMy);
//
//        System.out.println(carsSMy);

    }


}
