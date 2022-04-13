package pl.migibud.testowanieZadaniaSDA.ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private int a = 4;
    private int b = 5;

    @Test
    void shouldAddReturnCorrectResult() {

        //when
        int result = a + b;
        //then
        //assertEquals(result, Calculator.add(a, b));
        assertThat(Calculator.add(a, b)).isEqualTo(result);
    }

    @Test
    void shouldSubtractReturnCorrectResult() {
        //when
        int result = a - b;
        //then
        //assertEquals(result,Calculator.subtract(a,b));
        assertThat(Calculator.subtract(a,b)).isEqualTo(result);
    }

    @Test
    void shouldMultiplyReturnCorrectResult() {
        //when
        int result = a * b;
        //then
        //assertEquals(result,Calculator.multiply(a,b));
        assertThat(Calculator.multiply(a,b)).isEqualTo(result);
    }

    @Test
    void shouldMultiplyThrowExceptionIfDividerEqualZero() {
        //given
        int divider = 0;

        //then
        //assertThrows(ArithmeticException.class,()->Calculator.divide(a,divider));
        assertThatThrownBy(()->Calculator.divide(a,divider)).isInstanceOf(ArithmeticException.class);
    }

    @Test
    void shouldMultiplyGetCorrectResult() {
        //when
        float result = (float) a/b;

        //then
        assertEquals(result,Calculator.divide(a,b));
        assertThat(Calculator.divide(a,b)).isEqualTo(result);
    }






}