package pl.migibud.inheritance.ex7;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(int radius) {
        super(radius);
    }


    @Override
    public void resize(int percent) {
        this.radius = this.radius*percent/100.0;
    }
}
