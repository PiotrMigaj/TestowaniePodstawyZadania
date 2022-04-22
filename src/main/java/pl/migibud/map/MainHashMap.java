package pl.migibud.map;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {

    public static void main(String[] args) {

        Map<Integer,String> integerStringMap = new HashMap<>();

        integerStringMap.put(123, "Hash map");
        integerStringMap.put(10, "LinkedHash map");
        integerStringMap.put(220, "Tree map");
        integerStringMap.put(1100, "Mapa map");

        integerStringMap.forEach((integer,s)->{
            System.out.println(integer +" "+ s);
        });

    }

}
