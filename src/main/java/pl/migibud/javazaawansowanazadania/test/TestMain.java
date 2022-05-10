package pl.migibud.javazaawansowanazadania.test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf("test"));

        Integer integer = (Integer)list.get(0);




        System.out.println(integer);


    }

}
