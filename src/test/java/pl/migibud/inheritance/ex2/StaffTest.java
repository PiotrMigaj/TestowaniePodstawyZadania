package pl.migibud.inheritance.ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void testToString() {
        //Given
        Staff staff = new Staff("budo",3220);
        staff.setName("Piotr Migaj");
        staff.setAddress("ul. I Ch 41/2");

        //then
        System.out.println(staff);


    }
}