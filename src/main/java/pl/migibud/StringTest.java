package pl.migibud;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringTest {


    public static void main(String[] args) {

        int[] elements = {1, 2, 3, 1, 2, 1, 2, 3};
        int maxOccurrences = 0;
        int[] uniqueSetArray = Arrays.stream(elements).boxed().collect(Collectors.toSet()).stream().mapToInt(v->v).toArray();

        for (int i = 0;i< uniqueSetArray.length;i++){
            int counter = 0;
            for (int j=0;j<elements.length;j++){
                if (uniqueSetArray[i]==elements[j]){
                    counter++;
                    if (counter>maxOccurrences){
                        elements[j]=0;
                    }
                }
            }
        }

        int[] newArr = Arrays.stream(elements).filter(v->v!=0).toArray();

        System.out.println(Arrays.toString(newArr));
    }
}
