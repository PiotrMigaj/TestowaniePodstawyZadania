package pl.migibud.thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        TestClass testClass = new TestClass();
        Runnable runnable1 = () -> testClass.iterateFirst();
        Runnable runnable2 = () -> testClass.iterateSecond();
        Thread thread1 = new Thread(runnable1);
        Thread thread2  = new Thread(runnable2);
        thread1.start();
        thread2.start();

        // get the start time
        long start = System.nanoTime();
        thread1.join();
        thread2.join();

//        testClass.iterateFirst();
//        testClass.iterateSecond();

        testClass.getSum();
        // get the end time
        long end = System.nanoTime();

        // execution time in seconds
        long execution = (end - start);
        System.out.println("Execution time: "+execution + " nanoseconds");
    }

}
