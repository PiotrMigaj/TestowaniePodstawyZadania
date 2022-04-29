package pl.migibud.bankaccount.interfaces;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.exceptions.MaxDebitExceededException;

public interface BankAccountFunctionality {

    void deposit(int amount) throws AmountLessEqualZeroException;

    void withdrawal(int amount) throws AmountLessEqualZeroException, MaxDebitExceededException;

    int getBalance();

}
