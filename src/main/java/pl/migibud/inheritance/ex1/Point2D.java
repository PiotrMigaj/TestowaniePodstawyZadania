package pl.migibud.inheritance.ex1;

public class Point2D {

    protected float x,y;

    public Point2D() {
        this.x = 0f;
        this.y = 0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        return new float[]{this.x,this.y};
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {

        return String.format("(%f,%f)",this.x,this.y);
    }
}
