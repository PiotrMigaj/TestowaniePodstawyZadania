package pl.migibud.testowaniepodstawy.exAccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Account account;

    @BeforeEach
    void setup(){
        account = new Account();
    }


    @Test
    void shouldAccountBalanceAfterAccountSetupBeNull() {

        //when
        //then
        assertNull(account.getName());

    }

    @Test
    void getBalance() {
    }
}