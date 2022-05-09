package pl.migibud.javaadvexes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ex1 {

    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();

        queue.add("Piotr");
        queue.add("Ania");

        System.out.println(queue.peekFirst());


    }

}
