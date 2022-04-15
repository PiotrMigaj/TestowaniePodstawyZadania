package pl.migibud.workexamples.funcinter.accounttest;

import java.util.ArrayList;

public class Account {

    private int balance;
    private ArrayList<AccountOpp> accountOppArrayList = new ArrayList<>();


    public void deposit(int balance){
        this.balance+=balance;
        //AccountOpp.addItemToArrayList("Deposit",balance);
        //AccountOpp.printArrayList();
        logToAccountOppArrayList("depo",balance);
    }

    private void logToAccountOppArrayList(String opp, int amount){
        accountOppArrayList.add(new AccountOpp(opp,amount));
    }

    public void printOppHistory(){

        for (AccountOpp a:accountOppArrayList) {
            System.out.println(a);
        }
    }





}
