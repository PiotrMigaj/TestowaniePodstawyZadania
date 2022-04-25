package pl.migibud.bankaccount;

import pl.migibud.bankaccount.exceptions.AmountLessEqualZeroException;
import pl.migibud.bankaccount.interfaces.BankAccountFunctionality;

public class Main {
    public static void main(String[] args) throws AmountLessEqualZeroException {

        Owner owner = new Owner("Piotr","Migaj",new Owner.Address("Długa","16"));

        StandardAccount standardAccount = new StandardAccount("1234123465411234456784");
        standardAccount.deposit(1000);

        ExtraStartAccount extraStartAccount = new ExtraStartAccount("12315464");
        //System.out.println(extraStartAccount.getBalance());

        PremiumAccount premiumAccount = new PremiumAccount("126456164");
        //System.out.println(premiumAccount.getBalance());

//        premiumAccount.deposit(100);
//        System.out.println(premiumAccount.getBalance());

//        Transfer<StandardAccount,PremiumAccount> transferFromStandardToPremium = new Transfer<>();
//        transferFromStandardToPremium.transferMoney(standardAccount,premiumAccount,2000);

        Transfer.transferMoney(standardAccount,premiumAccount,500);
        System.out.println(standardAccount.getBalance());
        System.out.println(premiumAccount.getBalance());







    }
}
