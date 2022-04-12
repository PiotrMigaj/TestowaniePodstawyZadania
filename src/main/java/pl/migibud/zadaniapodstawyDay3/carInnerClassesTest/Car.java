package pl.migibud.zadaniapodstawyDay3.carInnerClassesTest;

public class Car {

    private String name;
    private String manufacturer;


    public Car setName(String name) {
        this.name = name;
        return new Car();
    }

    public Car setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return new Car();
    }

    public Car getCar(){
        return this;
    }

    public static Car copy(Car c){
        Car car = new Car();
        car.name=c.name;
        car.manufacturer=c.manufacturer;

        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    static class CarBuilder {
        private Car car;

        public CarBuilder() {
            car = new Car();
        }

        CarBuilder setName(String name) {
            this.car.name = name;
            return this;
        }

        CarBuilder setManufacturer(String name) {
            this.car.manufacturer = name;
            return this;
        }

        public Car getCar(){
            return this.car;
        }

    }

}
