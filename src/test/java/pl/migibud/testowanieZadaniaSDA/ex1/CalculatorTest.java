package pl.migibud.testowanieZadaniaSDA.ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private int a = 4;
    private int b = 5;

    @Test
    void shouldAddReturnCorrectResult() {

        //when
        int result = a + b;
        //then
        assertEquals(result, Calculator.add(a, b));
    }

    @Test
    void shouldSubtractReturnCorrectResult() {
        //when
        int result = a - b;
        //then
        assertEquals(result,Calculator.subtract(a,b));
    }

    @Test
    void shouldMultiplyReturnCorrectResult() {
        //when
        int result = a * b;
        //then
        assertEquals(result,Calculator.multiply(a,b));
    }

    @Test
    void shouldMultiplyThrowExceptionIfDividerEqualZero() {
        //given
        int divider = 0;

        //then
        assertThrows(ArithmeticException.class,()->Calculator.divide(a,divider));
    }

    @Test
    void shouldMultiplyGetCorrectResult() {
        //when
        float result = (float) a/b;

        //then
        assertEquals(result,Calculator.divide(a,b));
    }






}