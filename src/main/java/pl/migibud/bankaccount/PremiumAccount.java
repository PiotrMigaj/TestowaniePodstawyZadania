package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.exceptions.MaxDebitExceededException;
import pl.migibud.bankaccount.interfaces.BankAccountFunctionality;

public class PremiumAccount implements BankAccountFunctionality {

    private StandardAccount standardAccount;

    public PremiumAccount(String number) throws AmountLessEqualZeroException {
        this.standardAccount = new StandardAccount(number);
        this.standardAccount.deposit(100);
    }

    public int getBalance(){
        return this.standardAccount.getBalance();
    }

    @Override
    public void deposit(int amount) throws AmountLessEqualZeroException {
        int premiumAmount = amount*2;
        this.standardAccount.deposit(premiumAmount);
    }

    @Override
    public void withdrawal(int amount) throws AmountLessEqualZeroException, MaxDebitExceededException {
        this.standardAccount.withdrawal(amount);
    }

    //    @Override
//    public void deposit(int amount) throws AmountLessEqualZeroException {
//        if (amount<=0){
//            throw new AmountLessEqualZeroException();
//        }
//        int premiumAmount = amount*2;
//        super.deposit(premiumAmount);
//    }
}
