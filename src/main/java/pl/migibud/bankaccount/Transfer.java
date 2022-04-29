package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.exceptions.MaxDebitExceededException;
import pl.migibud.bankaccount.interfaces.BankAccountFunctionality;

public class Transfer{

    public Transfer() {
    }

//    public void transferMoney(T firstAccount, Y secondAccount, int amount) {
//
//        try {
//            firstAccount.withdrawal(amount);
//            secondAccount.deposit(amount);
//        }catch (AmountLessEqualZeroException e){
//            System.out.println(e.getMessage());
//        }catch (MaxDebitExceededException e){
//            System.out.println(e.getMessage());
//        }
//    }

        public static void transferMoney(BankAccountFunctionality bankAccountFunctionality1, BankAccountFunctionality bankAccountFunctionality2, int amount) {

        try {
            bankAccountFunctionality1.withdrawal(amount);
            bankAccountFunctionality2.deposit(amount);
        }catch (AmountLessEqualZeroException e){
            System.out.println(e.getMessage());
        }catch (MaxDebitExceededException e){
            System.out.println(e.getMessage());
        }
    }
}
