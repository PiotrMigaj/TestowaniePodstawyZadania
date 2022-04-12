package pl.migibud.zadaniapodstawyDay3.carInnerClassesTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CarTest {

    @Test
    void notNullAfterSetupOfObj(){

        //given
        Car car = new Car.CarBuilder().getCar();

        //then
        assertNotNull(car);

    }


}