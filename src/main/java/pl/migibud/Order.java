package pl.migibud;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Order {

    public static void main(String[] args) {
//        String initialString = "4of Fo1r pe6ople g3ood th5e the2";
//        String[] strings = initialString.split(" ");
//        List<String> stringList = Arrays.stream(strings).collect(Collectors.toList());
//        System.out.println(stringList);
//        List<String> numbers = stringList.stream().map(v->v.replaceAll("[a-zA-Z]","")).collect(Collectors.toList());
//        System.out.println(numbers);
//
//        Map<Integer,String> myMap = stringList.stream().collect(Collectors.toMap(v->Integer.parseInt(v.replaceAll("[a-zA-Z]","")),Function.identity()));
//        System.out.println(myMap);
//
//        List<String> resultsList = new ArrayList<>(myMap.values());
//        System.out.println(resultsList);
//
//        String finalString = resultsList.stream().reduce((s1,s2)->s1 + " " + s2 ).get();
//        System.out.println(finalString);
//        System.out.println("".matches("[\\s+]"));
//        System.out.println(" ".matches("[\\s+]"));
//        System.out.println(" ".matches("[\\s+]"));

        System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println(order(""));



    }

    public static String order(String words) {

        if (words.length()==0){
            return "";
        }
        String[] strings = words.split(" ");
        Map<Integer,String> myMap = Arrays.stream(strings)
                .collect(Collectors
                        .toMap(v->Integer.parseInt(v.replaceAll("[a-zA-Z]","")),Function.identity()));
        List<String> resultsList = new ArrayList<>(myMap.values());
        return String.join(" ", resultsList);
    }

}
