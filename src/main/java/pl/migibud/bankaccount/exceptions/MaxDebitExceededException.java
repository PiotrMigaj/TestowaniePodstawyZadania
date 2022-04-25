package pl.migibud.bankaccount.exceptions;

public class MaxDebitExceededException extends Exception{

    public MaxDebitExceededException(){
        super("Max debit is exceeded, cant proceed operation.");
    }

}
