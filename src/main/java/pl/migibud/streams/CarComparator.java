package pl.migibud.streams;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.name.length()-o2.name.length();
    }
}
