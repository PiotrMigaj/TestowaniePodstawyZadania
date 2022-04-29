package pl.migibud.generics.ex2ex3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{32,122,3,15,6,4};
        int value = Utils.countIf(integers,s->s>20);
        System.out.println(value);

        System.out.println(Arrays.toString(integers));
        Utils.swap(integers,0,20);
        System.out.println(Arrays.toString(integers));
    }
}
