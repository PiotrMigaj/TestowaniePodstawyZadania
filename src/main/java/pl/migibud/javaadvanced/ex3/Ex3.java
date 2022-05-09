package pl.migibud.javaadvanced.ex3;

public class Ex3 {

    public static void main(String[] args) {



        Car car = new Car("Ford","economy",new Engine());
        System.out.println(car.getEngine());

        car.setName("Ford");


    }

}
