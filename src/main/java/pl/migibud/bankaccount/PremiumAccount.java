package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;

public class PremiumAccount extends ExtraStartAccount{

    public PremiumAccount(String number) throws AmountLessEqualZeroException {
        super(number);

    }

    @Override
    public void deposit(int amount) throws AmountLessEqualZeroException {
        if (amount<=0){
            throw new AmountLessEqualZeroException();
        }
        int premiumAmount = amount*2;
        super.deposit(premiumAmount);
    }
}
