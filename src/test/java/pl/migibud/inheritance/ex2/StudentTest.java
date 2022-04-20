package pl.migibud.inheritance.ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testToString() {
        //given
        Student student  = new Student(new Person("Piotr Migaj","ul. Ig Chrz 41/2"),new StudentData("budo",5,42_000));

        //then
        System.out.println(student);

    }
}