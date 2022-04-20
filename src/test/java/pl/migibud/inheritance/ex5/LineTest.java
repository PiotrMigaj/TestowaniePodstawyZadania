package pl.migibud.inheritance.ex5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.migibud.inheritance.ex1.Point2D;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {




    @Test
    void getLength() {

        Point2D start = new Point2D(10,20);
        Point2D end = new Point2D(30,40);
        Line line = new Line(start,end);


        //then
        System.out.println(line.getLength());
    }

    @Test
    void getMiddlePoint() {

        Point2D start = new Point2D(10,20);
        Point2D end = new Point2D(30,40);
        Line line = new Line(start,end);


        //then
        System.out.println(line.getMiddlePoint());
    }
}