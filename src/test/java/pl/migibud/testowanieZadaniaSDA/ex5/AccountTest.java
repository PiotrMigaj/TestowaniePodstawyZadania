package pl.migibud.testowanieZadaniaSDA.ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@FunctionalInterface
interface MyFunction{
    boolean myFunction(int amount);
}

class AccountTest {

    @Test
    void isAccountNumberCorrect() {
        //given

        Account account = new Account();

        //then

        assertAll(
                () -> assertTrue(account.isAccountNumberCorrect("PL123412346541123454780000")),
                () -> assertTrue(account.isAccountNumberCorrect("PL123412346541123454480000"))
        );

    }

    @Test
    void isAccountNumberNotCorrect() {
        //given

        Account account = new Account();

        //then

        assertAll(
                () -> assertFalse(account.isAccountNumberCorrect("EN123412346541123454780000")),
                () -> assertFalse(account.isAccountNumberCorrect("PL1234123465411d3454480000")),
                () -> assertFalse(account.isAccountNumberCorrect("PL1234123465411d34544800000")),
                () -> assertFalse(account.isAccountNumberCorrect("PL1234123465411d345448000"))
        );

    }

    @Test
    void shouldAccountNumberNotBeNullAfterSetting() {

        //given
        Account account = new Account();

        //when
        account.setAccountNumber("PL123412346541123454780000");

        //then
        assertNotNull(account.getAccountNumber());
    }

    @Test
    void shouldAccountNumberBeNullIfAccountNumberNotCorrect() {

        //given
        Account account = new Account();

        //when
        account.setAccountNumber("PL123412346541123454780000_dz");

        //then
        assertNull(account.getAccountNumber());
    }

    @Test
    void shouldAccountBalanceIncreaseAfterDeposit() {

        //given
        Account account = new Account();
        int amount = 150;

        //when
        account.deposit(amount);

        //then
        assertEquals(amount,account.getBalance());
        assertTrue(account.deposit(amount));
    }

    @Test
    void shouldAccountBalanceNotIncreaseAfterDepositIfDepositLessThan0() {

        //given
        Account account = new Account();

        //when
        int amount = -150;
        account.deposit(amount);

        //then
        assertEquals(0,account.getBalance());
        assertFalse(account.deposit(amount));

    }

    @Test
    void shouldAccountBalanceNotIncreaseAfterDepositIfDepositEquals0() {

        //given
        Account account = new Account();

        //when
        int amount = 0;
        account.deposit(amount);

        MyFunction f = (int a)-> account.deposit(a);

        //then
        assertEquals(amount,f.myFunction(amount));
    }
}