package pl.migibud.inheritance.ex3;

public class Shape {

    String color;
    boolean isFilled;

    public Shape() {
        this.color = "";
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Shape with color of ");
        stringBuilder.append(this.color);
        stringBuilder.append(" and ");

        if (isFilled){
            stringBuilder.append("filled");
        }else {
            stringBuilder.append("not filled");
        }

        return stringBuilder.toString();
    }
}
