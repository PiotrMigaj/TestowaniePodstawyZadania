package pl.migibud.testowanieZadaniaSDA.ex4;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class EmailTest {



    @Test
    void isEmailAddressCorrect() {

        //Given
        Email email = new Email();
        //then
        assertAll(
                ()->assertTrue(email.isEmailAddressCorrect("pmigaj@gmail.com")),
                ()->assertTrue(email.isEmailAddressCorrect("pmigaj@gmail")),
                ()->assertTrue(email.isEmailAddressCorrect("pmigaj0123_-456@gmail.com"))
        );



    }

    @Test
    void isEmailAddressNotCorrect() {

        //Given
        Email email = new Email();
        //then
        assertFalse(email.isEmailAddressCorrect("pmigaj@gmail.com000"));
        assertFalse(email.isEmailAddressCorrect("pmigajgmail"));
        assertFalse(email.isEmailAddressCorrect("pmigaj0123_-456)@gmail.com"));
    }
}