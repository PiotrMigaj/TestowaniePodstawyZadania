package pl.migibud.javazaawansowanazadania.kolekcje.ex3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> listOfRandoms = new ArrayList<>();
        for (int i=0;i<100;i++){
            listOfRandoms.add(random.nextInt(51));
        }
        System.out.println(listOfRandoms);
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (Integer listOfRandom : listOfRandoms) {
            if (!uniqueElements.add(listOfRandom)) {
                duplicateElements.add(listOfRandom);
            }
        }

        System.out.println(uniqueElements);
        System.out.println(duplicateElements);







    }

}
