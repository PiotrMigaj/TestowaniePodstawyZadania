package pl.migibud.oopexes.ex6_2;

public class Rectangle implements GeometricObject {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width*this.length;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width+this.length);
    }
}
