package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.exceptions.MaxDebitExceededException;
import pl.migibud.bankaccount.interfaces.BankAccountFunctionality;

public class StandardAccount implements BankAccountFunctionality {

    private static final int MAX_DEBIT = -1000;
    private String number;
    private int balance;
    private boolean debit;

    public StandardAccount(String number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public void deposit(int amount) throws AmountLessEqualZeroException {
        if (amount<=0){
            throw new AmountLessEqualZeroException();
        }
        this.balance+=amount;
        validateDebit();
    }

    @Override
    public void withdrawal(int amount) throws AmountLessEqualZeroException, MaxDebitExceededException {
        if (this.balance-amount<= MAX_DEBIT){
            throw new MaxDebitExceededException();
        }
        if (amount<=0){
            throw new AmountLessEqualZeroException();
        }
        this.balance-=amount;
        validateDebit();
    }

    private void validateDebit(){
        if (this.balance<0){
            this.debit=true;
            System.out.println("Your account ");
        }
    }
}
