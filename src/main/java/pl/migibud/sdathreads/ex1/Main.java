package pl.migibud.sdathreads.ex1;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        FindOddNumbers.findEven(1000,2000);
        FindOddNumbers.findEven(14300,17800);
        long endTime = System.nanoTime();
        System.out.println("Time: "+ (endTime-startTime));
    }

}
