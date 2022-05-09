package pl.migibud.javazaawansowanazadania.kolekcje.ex1;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        Fruit[] fruits = new Fruit[]{new Fruit(20),new Fruit(30)};
        System.out.println(Arrays.toString(fruits));
        fruits = returnNewArray(fruits);

//        fruits1 = Arrays.copyOf(fruits,3);

        System.out.println(Arrays.toString(fruits));

//        fruits1[1].setWeight(150);
//
//        System.out.println(Arrays.toString(fruits));
//        System.out.println(Arrays.toString(fruits1));



    }

    public static Fruit[] returnNewArray(Fruit[] initialArray){
        int actualSize = initialArray.length;
        Fruit[] tmpArray = new Fruit[actualSize*2];

        for(int i=0;i<initialArray.length;i++){
            tmpArray[i]=initialArray[i];
        }
        return tmpArray;
    }



}

class Fruit{

    private int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                '}';
    }
}
