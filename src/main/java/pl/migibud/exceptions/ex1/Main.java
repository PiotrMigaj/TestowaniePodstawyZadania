package pl.migibud.exceptions.ex1;

public class Main {

    public static void main(String[] args) throws CannotDivideBy0Exception {



        System.out.println(Division.divide(10,0));



    }
}

class Division{
    public static double divide(double a, double b) throws CannotDivideBy0Exception {

        if (b==0){
            throw new CannotDivideBy0Exception();
        }

        return a/b;

    }
}

class CannotDivideBy0Exception extends Exception{
    public CannotDivideBy0Exception(){
        super("Cant divide by 0!");
    }
}


