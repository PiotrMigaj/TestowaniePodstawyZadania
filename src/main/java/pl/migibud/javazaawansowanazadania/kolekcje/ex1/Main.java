package pl.migibud.javazaawansowanazadania.kolekcje.ex1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SDAArrayList<Fruit> sdaArrayList = new SDAArrayList<>();

        sdaArrayList.add(new Fruit(20));
        sdaArrayList.add(new Fruit(20));
        sdaArrayList.add(new Fruit(20));
        sdaArrayList.add(new Fruit(20));
        sdaArrayList.add(new Fruit(20));
        sdaArrayList.add(new Fruit(20));
        sdaArrayList.add(new Fruit(20));

        System.out.println(Arrays.toString(sdaArrayList.tArray));
        System.out.println(sdaArrayList.actualSize);

        sdaArrayList.display();

    }

}
