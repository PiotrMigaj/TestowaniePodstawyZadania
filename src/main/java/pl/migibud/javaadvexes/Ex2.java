package pl.migibud.javaadvexes;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Ex2 {



    public static void main(String[] args) {

//        Fruit apple = new Fruit(20);
//
//        Optional<String> weightOfFruit = Optional.ofNullable(apple)
//                .filter(f->f.getWeight()>20)
//                .map(Fruit::getWeight)
//                .map(s->"waga produktu: "+s);
//
//        String weightOfFruitString = weightOfFruit.orElse("Dupa");
//
//
//        System.out.println(weightOfFruitString);
//
//
        Random random = new Random();
//
//        Stream.generate(()->new Fruit(random.nextInt(2)))
//                .limit(10)
//                .skip(2)
//                .map(a->a.getWeight())
//                .peek(w-> System.out.println(w))
//                .mapToInt(i->i)
//                .sum();


        Integer optionalInteger = Stream.generate(() -> new Fruit(random.nextInt(20)+20))
                .limit(2)
                .map(a -> a.getWeight())
                .peek(w -> System.out.println(w))
                .mapToInt(i -> i)
                .sum();

        System.out.println(optionalInteger);

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
}
