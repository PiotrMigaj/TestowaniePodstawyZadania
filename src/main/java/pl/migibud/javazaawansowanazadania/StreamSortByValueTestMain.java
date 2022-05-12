package pl.migibud.javazaawansowanazadania;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSortByValueTestMain {

    public static void main(String[] args) {

        Map<String,Integer> myMap = new HashMap<>();
        myMap.put("Piotr",18);
        myMap.put("Rafał",40);
        myMap.put("Ania",28);
        myMap.put("Ania",28);
        myMap.put("Kasia",12);
        myMap.put("Basia",1);
        myMap.put("Asia",36);

        System.out.println(myMap);

        Map<String, Integer> mySortedByKeyMap = new TreeMap<>(myMap);
        System.out.println(mySortedByKeyMap);

        Map<String, Integer> mySortedByValueMap = myMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(v1, v2)->v1, LinkedHashMap::new));
        System.out.println(mySortedByValueMap);

        Set<Map.Entry<String,Integer>> entry = myMap.entrySet();
        System.out.println(entry);

        Set<Map.Entry<String,Integer>> sortedEntry = new TreeSet<>((v1,v2)->v2.getValue()- v1.getValue());
        sortedEntry.addAll(entry);
        System.out.println(sortedEntry);

        Map<String,Integer> sortedMap = sortedEntry.stream().collect(Collectors.toMap(v->v.getKey(),v->v.getValue(),(v1,v2)->v1));
        System.out.println(sortedMap);




/*
        Iterator<Map.Entry<String,Integer>> iterator = entry.iterator();
        System.out.println(iterator.next());
*/



    }

}
