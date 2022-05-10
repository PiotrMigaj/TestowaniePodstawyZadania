package pl.migibud.javazaawansowanazadania.multithreading.ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Car car1 = new Car("Leon","Seat");
        Car car2 = new Car("Golf","VW");
        Bridge bridge = new Bridge();


        Runnable runnable1 = ()->{
            for(int i=0;i<10_000;i++){
                bridge.driveThrough(car1);
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        };
        Runnable runnable2 = ()->{
            for(int i=0;i<10_000;i++){
                bridge.driveThrough(car2);
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(runnable1);
        executorService.submit(runnable2);
        executorService.shutdown();
        executorService.awaitTermination(20, TimeUnit.SECONDS);

        System.out.println(bridge.driveThrough);
        System.out.println("czesc");
    }


}
