package pl.migibud.inheritance.ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testToString() {
        //given
        Person person = new Person("Piotr Migaj","ul. I. Chrzanowskiego, 51-142 Wrocław");

        //then
        System.out.println(person);
    }
}