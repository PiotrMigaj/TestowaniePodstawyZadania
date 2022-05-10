package pl.migibud.javazaawansowanazadania.multithreading.exMP;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {

//    private static Counter counter = new Counter();

    public static void main(String[] args) throws InterruptedException {

        Bridge bridge = new Bridge();

        Runnable runnable = () -> {
            IntStream.range(0, 30_000).forEach(i -> {
                bridge.increment(new Car("Leon","SEAT"));
            });
        };

        Runnable runnable2 = () -> {
            IntStream.range(0, 30_000).forEach(i -> {
                bridge.increment(new Car("Golf","VW"));
            });
        };

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(runnable);                                              // przekazanie Runnable do kolejnego wątku
        executor.submit(runnable2);                                              // przekazanie Runnable do kolejnego wątku
//        executor.submit(runnable);                                              // przekazanie Runnable do kolejnego wątku
//        executor.submit(runnable);                                              // przekazanie Runnable do kolejnego wątku

        executor.shutdown();                                                    // inicjalizacja zamknięcia puli wątków
        executor.awaitTermination(10, TimeUnit.SECONDS);                        // metoda blokująca - zatrzymanie obecnego wątku main w oczekiwaniu na zwrócenie wyników przez wszystkie Runnable

        System.out.println("Wynik: " + bridge.getResult());
//        System.out.println("Wynik z metody z zabezpieczeniem: " + counter.getSafetyResult());
    }

}
