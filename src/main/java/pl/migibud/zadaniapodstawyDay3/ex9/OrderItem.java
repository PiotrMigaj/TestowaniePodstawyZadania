package pl.migibud.zadaniapodstawyDay3.ex9;

import java.util.Objects;

public class OrderItem {

    private static final String BOUNDARY = "\t|\t";
    private String productName;
    private int quantity;
    private double price;

    public OrderItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return this.price * this.quantity;
    }

    public boolean isCorrect(){
        return this.quantity>0&&this.price>0;
    }

    public void print(){

        StringBuilder sb = new StringBuilder();
        sb.append(this.productName);
        sb.append(BOUNDARY);
        sb.append(this.price + " zł");
        sb.append(BOUNDARY);
        sb.append(this.quantity + " pcs");
        sb.append(BOUNDARY);
        sb.append(this.getAmount() + " zł");

        System.out.println(sb);

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return quantity == orderItem.quantity && Double.compare(orderItem.price, price) == 0 && Objects.equals(productName, orderItem.productName);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
