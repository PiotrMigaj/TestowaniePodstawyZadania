package pl.migibud.inheritance.ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void isFilledFalseAfterCreatingObj(){
        //given
        Circle circle = new Circle(1);

        //then
        assertFalse(circle.isFilled());
    }

    @Test
    void testToString() {

        //given
        Circle circle = new Circle(1);
        circle.setColor("red");

        //then
        System.out.println(circle);


    }
}