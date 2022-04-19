package pl.migibud.inheritance.ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void testToString() {

        //given
        Shape shape = new Shape("red",false);

        //then
        System.out.println(shape);

    }
}