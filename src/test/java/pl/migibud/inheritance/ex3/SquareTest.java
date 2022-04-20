package pl.migibud.inheritance.ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void testToString() {

        //given
        Square square = new Square("red",true,3);

        //then
        System.out.println(square);

    }
}