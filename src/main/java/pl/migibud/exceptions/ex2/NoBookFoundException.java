package pl.migibud.exceptions.ex2;

public class NoBookFoundException extends Exception{

    public NoBookFoundException(String input){
        super("You can't find: "+input);
    }

}


