package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.exceptions.MaxDebitExceededException;
import pl.migibud.bankaccount.interfaces.BankAccountFunctionality;

public class ExtraStartAccount implements BankAccountFunctionality{

    private BankAccountFunctionality bankAccountFunctionality;

    public ExtraStartAccount(BankAccountFunctionality bankAccountFunctionality) throws AmountLessEqualZeroException {
        this.bankAccountFunctionality = bankAccountFunctionality;
        this.bankAccountFunctionality.deposit(100);
    }

    @Override
    public int getBalance() {
        return this.bankAccountFunctionality.getBalance();
    }

    @Override
    public void deposit(int amount) throws AmountLessEqualZeroException {
        this.bankAccountFunctionality.deposit(amount);
    }

    @Override
    public void withdrawal(int amount) throws AmountLessEqualZeroException, MaxDebitExceededException {
        this.bankAccountFunctionality.withdrawal(amount);
    }
}
