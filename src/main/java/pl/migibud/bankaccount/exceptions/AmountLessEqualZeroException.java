package pl.migibud.bankaccount.exceptions;

public class AmountLessEqualZeroException extends Exception{

    public AmountLessEqualZeroException(){
        super("Amount can't be less or equal than zero!");
    }

}
