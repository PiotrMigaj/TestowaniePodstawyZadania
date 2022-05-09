package pl.migibud.sdathreads.ex1;

public class FindOddNumbers {

    public static void findEven(int lowerBoundary, int upperBoundary){
        for(int i=lowerBoundary;i<upperBoundary;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

}
