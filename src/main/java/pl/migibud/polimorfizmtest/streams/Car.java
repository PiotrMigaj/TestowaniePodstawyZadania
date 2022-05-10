package pl.migibud.polimorfizmtest.streams;

import java.util.Objects;

public class Car {

    public String name;
    public int topSpeed;
    public int price;
    public int rating;

    public Car(String name, int topSpeed, int price, int rating) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

//    @Override
//    public int compare(Car o1, Car o2) {
//        return o1.name.length()-o2.name.length();
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


//    @Override
//    public int compareTo(@NotNull Car o) {
//        return (int)(this.name.length()-o.name.length());
//    }
}
