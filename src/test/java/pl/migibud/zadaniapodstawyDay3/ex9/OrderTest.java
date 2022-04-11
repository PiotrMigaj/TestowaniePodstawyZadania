package pl.migibud.zadaniapodstawyDay3.ex9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void isCurrentNumberOfOrderItemsInOrderEqualZeroAfterCreatingNewOrder(){

        //given
        Order order = new Order(3);

        //then
        assertEquals(order.getCurrentNumberOfOrderItemsInOrder(),0);

    }

    @Test
    void addItemShouldNotPassWhenThereIsNoPlaceInTheOrder() {
        //given
        Order order = new Order(1);
        OrderItem orderItem = new OrderItem("chleb",1,2);
        //when
        order.addItem(orderItem);
        //then
        assertEquals(false,order.addItem(orderItem));

    }

    @Test
    void getTotalAmountIfThereAreElementsInArray() {

        //given
        Order order = new Order(2);

        //when
        order.addItem(new OrderItem("Chleb",3,2.50));
        order.addItem(new OrderItem("Bułki",3,1.50));

        //then

        assertEquals(12.0,order.getTotalAmount());
    }

    @Test
    void getItemsCountIfThereAreElementsInArray() {

        //given
        Order order = new Order(2);

        //when
        order.addItem(new OrderItem("Chleb",3,2.50));
        order.addItem(new OrderItem("Bułki",3,1.50));

        //then

        assertEquals(6,order.getItemsCount());
    }
}