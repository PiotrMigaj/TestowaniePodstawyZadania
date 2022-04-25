package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.exceptions.MaxDebitExceededException;

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

        public static<T extends StandardAccount,Y extends  StandardAccount> void transferMoney(T firstAccount, Y secondAccount, int amount) {

        try {
            firstAccount.withdrawal(amount);
            secondAccount.deposit(amount);
        }catch (AmountLessEqualZeroException e){
            System.out.println(e.getMessage());
        }catch (MaxDebitExceededException e){
            System.out.println(e.getMessage());
        }
    }
}
