package pl.migibud.zadaniapodstawyDay3.ex9;

public class Order {

    private int maxOrderItem;
    private OrderItem[] items;
    private int currentNumberOfOrderItemsInOrder;

    public Order(int maxOrderItem) {
        this.maxOrderItem = maxOrderItem;
        items = new OrderItem[maxOrderItem];
        //System.out.println(currentNumberOfOrderItemsInOrder);
    }

    public int getCurrentNumberOfOrderItemsInOrder() {
        return currentNumberOfOrderItemsInOrder;
    }

    public boolean addItem(OrderItem orderItem) {
        if (!orderItem.isCorrect()) {
            System.out.println("Item is incorrect");
            return false;
        }
        if (currentNumberOfOrderItemsInOrder >= maxOrderItem) {
            System.out.println("Order is full");
            return false;
        }
        items[currentNumberOfOrderItemsInOrder] = orderItem;
        currentNumberOfOrderItemsInOrder++;
        return true;
    }

    public double getTotalAmount(){
        double totalAmount=0;

        for (OrderItem o : items) {
            if (o!=null){
                totalAmount+=o.getAmount();
            }
        }
        return totalAmount;
    }

    public int getItemsCount(){
        int total=0;

        for (OrderItem o : items) {
            if (o!=null){
                total+=o.getQuantity();
            }
        }
        return total;
    }

    public void print(){

        for (OrderItem o : items) {
            if (o!=null){
                o.print();
            }
        }
        System.out.println("Total amount: "+this.getTotalAmount() + " zł");
    }
}
