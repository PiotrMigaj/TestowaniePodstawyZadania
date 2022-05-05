package pl.migibud.testarraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>();
        test.add(32);
        test.add(15);
        test.add(12);

        System.out.println(test);

        for (int i =0;i<test.size();i++){
            if (test.get(i)<30){
                test.remove(i);
            }

        }

        System.out.println(test);

    }

}
