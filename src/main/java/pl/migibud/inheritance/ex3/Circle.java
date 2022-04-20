package pl.migibud.inheritance.ex3;

public class Circle extends Shape{

    int radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getArea(){
        return (float) (Math.PI*Math.pow(this.radius,2));
    }

    public float getPerimeter(){
        return (float) (2*Math.PI*this.radius);
    }

    @Override
    public String toString(){

        return String.format("Circle with radius=%d which is a subclass off ",this.radius)+super.toString();

    }


}
