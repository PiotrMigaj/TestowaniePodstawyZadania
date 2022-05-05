package pl.migibud.oopexes.extras;

public class Visit {

    private double price;
    private Discount discount;

    public Visit(Discount discount) {
        this.price = 350;
        this.discount = discount;
    }

    public double getPrice() {
        return price*this.discount.getD();
    }
}
