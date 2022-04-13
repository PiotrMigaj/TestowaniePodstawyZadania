package pl.migibud.testowanieZadaniaSDA.ex1;

public class Calculator {

    public static int add(int a,int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static float divide(int a, int b) throws ArithmeticException {

        if (b!=0){
            return (float) a/b;
        }else {
            throw new  ArithmeticException();
        }
    }




}
