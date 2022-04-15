package pl.migibud.testowanieZadaniaSDA.ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void shouldOwnerNotBeNullAfterCreate(){
        //given
        Owner owner = new Owner("Piotr","Migaj","Długa","16");

        //then
        assertNotNull(owner);

    }

    @Test
    void getAddress() {
    }
}