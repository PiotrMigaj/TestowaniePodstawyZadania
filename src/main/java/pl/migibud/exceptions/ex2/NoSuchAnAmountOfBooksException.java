package pl.migibud.exceptions.ex2;

public class NoSuchAnAmountOfBooksException extends Exception{

    public NoSuchAnAmountOfBooksException(String input){
        super("You don't have such an amount of book: "+input);
    }

}


