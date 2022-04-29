package pl.migibud.generics.ex1;

public class Main {
    public static void main(String[] args) {

        Pair pair = new Pair<>(23,45);

        System.out.println(pair.getY() instanceof String);



    }
}
