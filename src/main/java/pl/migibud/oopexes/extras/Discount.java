package pl.migibud.oopexes.extras;

public enum Discount {

    SMALL(0.05),LARGE(0.10);

    private double d;

    Discount(double d){
        this.d=d;
    }

    public double getD() {
        return d;
    }
}
