package pl.migibud.zadaniapodstawyDay3.carInnerClassesTest;

public class Main {



    public static void main(String[] args) {

//        Car car = new Car.CarBuilder().setName("Mustang").setManufacturer("Ford").getCar();
        //System.out.println(car);

        Car car = new Car();
        System.out.println(car);
        car.setName("Mustang").setManufacturer("Ford");
        System.out.println(car);
        Car car2 = Car.copy(car);
        System.out.println(car2);
        System.out.println(car==car2);

//        System.out.println(car1==car2);
//        car2.setName("Golf");
//        System.out.println(car1);
//        System.out.println(car2);


//        car2.setName("T").setManufacturer("Ford");
//        System.out.println(car2);
//        Car car3 = car2.getCar();

//        System.out.println(car3);


//        MathMigi mathMigi = new MathMigi();
//        System.out.println(mathMigi.value);
//
//        Car car1 = new Car.CarBuilder().getCar();
//        System.out.println(car1);

    }




}
