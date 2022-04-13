package pl.migibud.tonygaddis.chapter8.ex10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelGaugeTest {

    @Test
    void fuelUpOneLiterOfOil() {

        //given
        FuelGauge fuelGauge = new FuelGauge();

        //when
        int fuelGaugeBeforeTank=fuelGauge.getAmountOfFuel();
        fuelGauge.fuelUpOneLiterOfOil();
        int fuelGaugeAfterTank = fuelGauge.getAmountOfFuel();


        //then
        assertEquals(fuelGaugeBeforeTank+1,fuelGaugeAfterTank);
    }

    @Test
    void fuelDownOneLiterOfOil() {

        //given
        FuelGauge fuelGauge = new FuelGauge();

        //when
        int fuelGaugeBeforeTank=fuelGauge.getAmountOfFuel();
        fuelGauge.fuelDownOneLiterOfOil();
        fuelGauge.fuelDownOneLiterOfOil();
        int fuelGaugeAfterTank = fuelGauge.getAmountOfFuel();


        //then
        assertEquals(fuelGaugeBeforeTank-1,fuelGaugeAfterTank);
    }
}