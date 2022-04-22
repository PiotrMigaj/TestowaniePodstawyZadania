package pl.migibud.classandinterfaces.ex3;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("luxury","BMW");

        Car.Engine engine = new Car("myOwn","BMW").createEngine();

        System.out.println(engine);

    }
}
