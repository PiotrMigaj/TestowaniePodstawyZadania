package pl.migibud.workexamples.funcinter.accounttest;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(100);
        account.deposit(80);
        account.deposit(50);
        account.deposit(60);
        account.printOppHistory();
        //AccountOpp.printArrayList();
    }

}
