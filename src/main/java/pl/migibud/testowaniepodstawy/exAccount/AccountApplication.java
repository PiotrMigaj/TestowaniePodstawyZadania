package pl.migibud.testowaniepodstawy.exAccount;

public class AccountApplication {

    public static void main(String[] args) {
        Account account = new Account();
        account.setName("Konto Premium");

//        try{
//            account.withdraw(1500);
//        }catch (Account.IllegalWithdrawExeption e){
//            System.out.println("Brak wystarczająco środków na koncie.");
//        }

        account.deposit(2000);
        Account otherAccount = new Account();
        account.transfer(otherAccount,1500);
        //System.out.println(otherAccount.getBalance());


//        System.out.println(account.getBalance());
//        System.out.println(account.getDebit());


    }

}
