package pl.migibud.oopexes.ex6_1;

public class Rectagle extends Shape{

    double width;
    double length;

    public Rectagle() {
        this.width=1;
        this.length=1;
    }

    public Rectagle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectagle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return this.width*this.length;
    }

    @Override
    double getPerimeter() {
        return 2*(this.width+this.length);
    }

    @Override
    public String toString() {
        return "Rectagle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
