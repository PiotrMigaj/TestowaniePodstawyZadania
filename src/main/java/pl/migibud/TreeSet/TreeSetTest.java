package pl.migibud.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetTest {



    public static void main(String[] args) {

        Comparator<Car> comparator = (Car o1, Car o2)->o2.name.length() - o1.name.length();

        TreeSet<Car> treeSet = new TreeSet<>(comparator);
        treeSet.add(new Car("Ford",3));
        treeSet.add(new Car("VW",34));
        treeSet.add(new Car("Citroen",38));

        System.out.println(treeSet);

    }


}
