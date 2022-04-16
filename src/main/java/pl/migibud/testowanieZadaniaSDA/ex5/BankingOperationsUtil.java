package pl.migibud.testowanieZadaniaSDA.ex5;

public class BankingOperationsUtil {

//    private static final int MAX_DEBIT = -1000;
//
//    public static boolean deposit(Account account, int amount) {
//        if (amount > 0) {
//            account.setBalance(account.getBalance()+amount);
//            account.isDebit();
//            return true;
//        }
//        System.out.println("Amount must be greater than 0.");
//        return false;
//    }
//
//    public static boolean withdrawal(Account account, int amount){
//
//        if (amount>0){
//            if(ifAccountBalanceAfterWithdrawalExceedsMaxDebit(account,amount)){
//                System.out.println("Max debit exceeded.");
//                return false;
//            }else {
//                account.setBalance(account.getBalance()-amount);
//                account.isDebit();
//                return true;
//            }
//        }
//        System.out.println("Amount must be greater than 0.");
//        return false;
//    }
//
//    private static boolean ifAccountBalanceAfterWithdrawalExceedsMaxDebit(Account account, int amount){
//
//        if (account.getBalance()-amount< MAX_DEBIT){
//            return true;
//        }
//        return false;
//    }


    public static void bankTranfer(Account sender, Account receiver , int amount) throws NegativeSenderBalance {

        if (!sender.withdrawal(amount)){
            throw new NegativeSenderBalance();
        }
        receiver.deposit(amount);
    }
}

class NegativeSenderBalance extends Exception{

    public NegativeSenderBalance(){
        super("Error: Max debit limit exceeded");
    }
}
