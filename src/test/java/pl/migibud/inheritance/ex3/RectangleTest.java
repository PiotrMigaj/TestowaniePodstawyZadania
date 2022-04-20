package pl.migibud.inheritance.ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        //given

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("red");
        rectangle.setFilled(true);

        //then
        System.out.println(rectangle);


    }
}