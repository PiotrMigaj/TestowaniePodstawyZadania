package pl.migibud.tonygaddis.chapter8.ex10;

public class Main {

    public static void main(String[] args) {

        FuelGauge fuelGauge = new FuelGauge();

        boolean fuelUpB = false;

        do {
            fuelUpB=fuelGauge.fuelUpOneLiterOfOil();

        }while (fuelUpB);

        Odometer odometer = new Odometer(fuelGauge);
        System.out.println(odometer.getFuelGauge().getAmountOfFuel());

        boolean passedKm = true;


        do {
            passedKm=odometer.increaseRangeByOneKm();

        }while (passedKm);


    }


}
