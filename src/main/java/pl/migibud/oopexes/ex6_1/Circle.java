package pl.migibud.oopexes.ex6_1;

public class Circle extends Shape{

    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
