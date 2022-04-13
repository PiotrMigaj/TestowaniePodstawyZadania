package pl.migibud.tonygaddis.chapter8.ex10;

public class Odometer {

    private static final int MAX_RANGE = 999_999;
    private int currentRange;
    private FuelGauge fuelGauge;

    public Odometer(FuelGauge fuelGauge) {
        this.fuelGauge = fuelGauge;
    }

    public int getCurrentRange() {
        return currentRange;
    }

    public FuelGauge getFuelGauge() {
        return fuelGauge;
    }

    public boolean increaseRangeByOneKm() {

        if (this.fuelGauge.getAmountOfFuel()!=0){
            this.currentRange += 1;
            if (this.currentRange%20==0){
                this.fuelGauge.fuelDownOneLiterOfOil();
            }
            validateMaxRange();
            System.out.println("Przejechałeś: "+this.currentRange);
            return true;
        }else {
            System.out.println("Skończyła się benzyna!");
            return false;
        }

    }

    private void validateMaxRange() {
        if (this.currentRange > MAX_RANGE){
            this.currentRange=0;
        }
    }
}
