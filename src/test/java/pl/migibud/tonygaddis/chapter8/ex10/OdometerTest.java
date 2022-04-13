package pl.migibud.tonygaddis.chapter8.ex10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OdometerTest {

    @Test
    void increaseRangeByOneKm() {

        //given

        Odometer odometer = new Odometer(new FuelGauge());

        //when
        for (int i =0;i<20;i++){
            odometer.increaseRangeByOneKm();
        }

        //then
        assertEquals(20,odometer.getCurrentRange());
        assertEquals(29,odometer.getFuelGauge().getAmountOfFuel());

    }
}