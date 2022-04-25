package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;

public class ExtraStartAccount extends StandardAccount{

    public ExtraStartAccount(String number) throws AmountLessEqualZeroException {
        super(number);
        super.deposit(100);
    }
}
