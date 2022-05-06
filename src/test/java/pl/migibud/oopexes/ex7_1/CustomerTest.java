package pl.migibud.oopexes.ex7_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void isMember() {
        //given
        Customer customer = new Customer("Piotr");
        //then
        assertFalse(customer.isMember());


    }
}