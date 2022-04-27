package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.exceptions.MaxDebitExceededException;
import pl.migibud.bankaccount.interfaces.BankAccountFunctionality;

public class ExtraStartAccount implements BankAccountFunctionality {

    private StandardAccount standardAccount;

    public ExtraStartAccount(String number) throws AmountLessEqualZeroException {
        this.standardAccount = new StandardAccount(number);
        this.standardAccount.deposit(100);
    }

    @Override
    public void deposit(int amount) throws AmountLessEqualZeroException {
        this.standardAccount.deposit(amount);
    }

    @Override
    public void withdrawal(int amount) throws AmountLessEqualZeroException, MaxDebitExceededException {
        this.standardAccount.withdrawal(amount);
    }
}
