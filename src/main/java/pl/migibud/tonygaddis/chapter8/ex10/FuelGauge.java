package pl.migibud.tonygaddis.chapter8.ex10;

public class FuelGauge {

    private int amountOfFuel;

    public int getAmountOfFuel() {
        return amountOfFuel;
    }

    public boolean fuelUpOneLiterOfOil(){
        if (this.amountOfFuel<60){
            this.amountOfFuel+=1;
            System.out.println("Increased fuel by 1 liter");
            return true;
        }else{
            System.out.println("Tank is full");
            return false;
        }
    }

    public void fuelDownOneLiterOfOil(){
        if (this.amountOfFuel>0){
            this.amountOfFuel-=1;
        }else{
            System.out.println("Tank is empty");
        }
    }
}
