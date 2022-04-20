package pl.migibud.inheritance.ex5;

import pl.migibud.inheritance.ex1.Point2D;

public class Line {

    private Point2D p1, p2;

    public Line(Point2D p1, Point2D p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(float point1x, float point1y, float point2x, float point2y){
        this.p1 = new Point2D(point1x,point1y);
        this.p2 = new Point2D(point2x,point2y);
    }

    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public float getLength(){
        return (float) Math.sqrt(Math.pow((p2.getX())- p1.getX(),2)+Math.pow((p2.getY())- p1.getY(),2));
    }

    public Point2D getMiddlePoint(){

        float xMiddle = 0.5f*(p1.getX()+ p2.getX());
        float yMiddle = 0.5f*(p1.getY()+ p2.getY());

        return new Point2D(xMiddle,yMiddle);
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
