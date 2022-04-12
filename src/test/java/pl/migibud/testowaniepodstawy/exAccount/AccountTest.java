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

    @Test
    void shouldAccountBalanceIncreaseAfterDeposit() {

        //given
        int amount = 50;

        //when
        int balanceBeforeNextDeposit=account.getBalance();
        account.deposit(amount);
        int balanceAfterNextDeposit=account.getBalance();

        //then
        assertEquals(balanceAfterNextDeposit-balanceBeforeNextDeposit,amount);
    }

    @Test
    void shouldAccountBalanceBeTheSameAfterDepositIfAmountNotGreaterThanZero() {

        //given
        int amount = 1500;

        //when
        int balanceBeforeNextDeposit=account.getBalance();
        account.deposit(amount);
        int balanceAfterNextDeposit=account.getBalance();

        //then
        assertEquals(balanceAfterNextDeposit,balanceBeforeNextDeposit);
    }

    @Test
    void exeptionShouldBeThrownIfWithrawExceedMaxDebit() {

        //given
        Account account = new Account();
        //when
        //then
        assertThrows(Account.IllegalWithdrawExeption.class,()->account.withdraw(1001));
    }
}