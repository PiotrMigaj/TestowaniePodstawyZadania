package pl.migibud.testinterface.ex1;

public class Account {

    private AccountOps accountOps;

    public Account() {}

    public int getMoney(int amount, AccountOps accountOps){
        return 2* accountOps.addMoney(amount);
    }
}
