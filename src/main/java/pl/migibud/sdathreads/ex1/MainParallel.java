package pl.migibud.sdathreads.ex1;

public class MainParallel {



    public static void main(String[] args) throws InterruptedException {

        Runnable runnable1 = () -> FindOddNumbers.findEven(1000,2000);
        Runnable runnable2 = () -> FindOddNumbers.findEven(14300,17800);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        long startTime = System.nanoTime();
        thread1.start();
        thread2.start();

        long endTime = System.nanoTime();
        System.out.println("Time: "+ (endTime-startTime));


    }

}
