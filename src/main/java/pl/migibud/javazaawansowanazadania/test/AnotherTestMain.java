package pl.migibud.javazaawansowanazadania.test;

import java.util.*;

public class AnotherTestMain {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Piotr");
        list.add("Ania");

        List<String> linkedList = new LinkedList<>(list);

        Queue<String> queue = new PriorityQueue<>(list);
        System.out.println(queue.peek());

        Object[] objects = {"Jeden","Dwa"};
        String[] strings = (String[]) objects;
        System.out.println(Arrays.toString(strings));


    }
}
