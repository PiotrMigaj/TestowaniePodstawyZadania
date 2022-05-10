package pl.migibud.oopexes.ex6_2;

public class Circle implements GeometricObject{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
}