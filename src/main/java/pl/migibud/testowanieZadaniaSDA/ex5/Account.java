package pl.migibud.testowanieZadaniaSDA.ex5;

import pl.migibud.workexamples.funcinter.workerexample.Worker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private static final int MAX_DEBIT = -1000;

    private int balance;
    private String accountNumber;
    private Owner owner;
    private boolean debit;

    public void setAccountNumber(String accountNumber) {
        if (this.isAccountNumberCorrect(accountNumber)) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Wrong account number.");
        }
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isAccountNumberCorrect(String accountNumber) {

        Pattern patter = Pattern.compile("PL[\\d]{24}");
        return patter.matcher(accountNumber).matches();
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            isDebit();
            return true;
        }
        System.out.println("Amount must be greater than 0.");
        return false;
    }

    public boolean withdrawal(int amount){

        if (amount>0){
            if(ifAccountBalanceAfterWithdrawalExceedsMaxDebit(amount)){
                System.out.println("Max debit exceeded.");
                return false;
            }else {
                this.balance -= amount;
                this.isDebit();
                return true;
            }
        }
        System.out.println("Amount must be greater than 0.");
        return false;
    }

    private boolean ifAccountBalanceAfterWithdrawalExceedsMaxDebit(int amount){

        if (this.balance-amount< MAX_DEBIT){
            return true;
        }
        return false;
    }

    public void isDebit() {
        this.debit = this.balance < 0 ? true : false;
    }

}
