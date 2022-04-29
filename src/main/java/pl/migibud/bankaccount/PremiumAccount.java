package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.exceptions.MaxDebitExceededException;
import pl.migibud.bankaccount.interfaces.BankAccountFunctionality;

public class PremiumAccount implements BankAccountFunctionality {

    private BankAccountFunctionality bankAccountFunctionality;

    public PremiumAccount(BankAccountFunctionality bankAccountFunctionality) throws AmountLessEqualZeroException {
        this.bankAccountFunctionality = bankAccountFunctionality;
        this.bankAccountFunctionality.deposit(100);
    }

    public int getBalance(){
        return this.bankAccountFunctionality.getBalance();
    }


    @Override
    public void deposit(int amount) throws AmountLessEqualZeroException {
        int premiumAmount = amount*2;
        this.bankAccountFunctionality.deposit(premiumAmount);
    }

    @Override
    public void withdrawal(int amount) throws AmountLessEqualZeroException, MaxDebitExceededException {
        this.bankAccountFunctionality.withdrawal(amount);
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
