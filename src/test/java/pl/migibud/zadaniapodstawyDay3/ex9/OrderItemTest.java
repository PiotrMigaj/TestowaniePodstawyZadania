package pl.migibud.zadaniapodstawyDay3.ex9;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {

    @Test
    void shouldAmountBeEqualAfterCreatingProduct() {

        //given
        int amount=2;
        double price = 6.5;
        OrderItem orderItem = new OrderItem("Chleb",amount,price);

        //when
        double result = amount*price;

        //then
        assertEquals(result,orderItem.getAmount());
        assertThat(orderItem.getAmount()).isEqualTo(result);

    }

    @Test
    void isPriceAndQuantityGreaterThanZeroAfterCreatingOrderItem() {

        //given
        OrderItem orderItem = new OrderItem("Chleb",3,6.44);

        //then
        assertTrue(orderItem.isCorrect());
        assertThat(orderItem.isCorrect()).isTrue();

    }
}