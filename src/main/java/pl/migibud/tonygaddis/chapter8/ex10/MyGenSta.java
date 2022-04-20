package pl.migibud.tonygaddis.chapter8.ex10;

public class MyGenSta {

    public static <T extends Number,U extends Number> double add(T x, U y){

        return x.doubleValue()+ y.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(add(2,3f));

    }

}
