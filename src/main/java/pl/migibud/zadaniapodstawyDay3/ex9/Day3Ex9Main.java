package pl.migibud.zadaniapodstawyDay3.ex9;

public class Day3Ex9Main {

    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem("Chleb",1,3.50);
        //orderItem.print();

        Order order = new Order(3);
        order.addItem(new OrderItem("chleb",2,6.50));
        order.addItem(new OrderItem("bułki",2,3.28));
        order.addItem(new OrderItem("szynka",3,4.99));

        order.print();



    }
}
