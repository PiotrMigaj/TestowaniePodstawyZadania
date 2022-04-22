package pl.migibud.TreeSet;

import java.util.Comparator;

class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o2.name.length() - o1.name.length();
    }
}
