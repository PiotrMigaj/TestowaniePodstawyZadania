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

        //BankingOperationsUtil.deposit(account,amount);
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
        //BankingOperationsUtil.deposit(account,amount);

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
        assertFalse(f.myFunction(amount));
    }

    @Test
    void shouldWithdrawalNotPassIfAmountLowerThan0(){

        //given
        Account account= new Account();

        //when
        int amount = -150;

        //then
        assertFalse(account.withdrawal(amount));
    }

    @Test
    void shouldWithdrawalNotPassIfAmountEquals0(){

        //given
        Account account= new Account();

        //when
        int amount = 0;

        //then
        assertFalse(account.withdrawal(amount));
    }

    @Test
    void shouldWithdrawalNotPassIfDebitExceeded(){

        //given
        Account account= new Account();

        //when
        account.deposit(500);
        int amount = 2000;

        //then
        assertFalse(account.withdrawal(amount));
    }

    @Test
    void shouldWithdrawalPass(){

        //given
        Account account= new Account();

        //when
        account.deposit(500);
        int amount = 250;

        //then
        assertTrue(account.withdrawal(amount));
        assertEquals(500-250,account.getBalance());
    }

    @Test
    void shouldTransferNotPass(){

        //given
        Account sender = new Account();
        Account receiver = new Account();
        int amount = 1050;

        //then
        assertThrows(NegativeSenderBalance.class,()->BankingOperationsUtil.bankTranfer(sender,receiver,amount));
    }

    @Test
    void shouldTransferPass(){

        //given
        Account sender = new Account();
        Account receiver = new Account();
        int amount = 60;

        //when

        try{
            BankingOperationsUtil.bankTranfer(sender,receiver,60);
        }catch (NegativeSenderBalance e){

        }

        //then

        assertAll(
                ()->assertEquals(-60,sender.getBalance()),
                ()->assertEquals(60,receiver.getBalance())
        );

    }
}