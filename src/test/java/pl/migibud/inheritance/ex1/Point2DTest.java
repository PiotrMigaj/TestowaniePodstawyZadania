package pl.migibud.inheritance.ex1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void testToString() {

        //given
        Point2D point2D = new Point2D(2f,3f);

        //then
        System.out.println(point2D);



    }
}