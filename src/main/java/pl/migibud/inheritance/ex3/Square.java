package pl.migibud.inheritance.ex3;

public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return String.format("Square with width=%f and length=%f which is a subclass off %s",this.width,this.length,super.toString());
    }
}
