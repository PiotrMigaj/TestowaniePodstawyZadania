package pl.migibud.zadaniapodstawyDay3.ex11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldEmailNotBeNullAfterCreateNewObj(){

        //given
        Email email = new Email.Builder().build();

        //then
        assertNotNull(email);
    }

    @Test
    void shouldEmailReceiverNotBeNullAfterSetup(){

        //given
        Email email = new Email.Builder().receiver("sda").build();

        //then

        assertNotNull(email);
        assertNotNull(email.getReceiver());
        assertEquals("sda",email.getReceiver());

    }
}