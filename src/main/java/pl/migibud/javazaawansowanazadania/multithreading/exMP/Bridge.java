package pl.migibud.javazaawansowanazadania.multithreading.exMP;

public class Bridge {

    private int countOne = 0;
    private int countTwo = 0;

    public synchronized void incrementSafety() {    // tylko 1 wątek może wykonywać te operacje
        countOne++;

        if (countOne % 10_000 == 0) {
            System.out.println(countOne + " : " + Thread.currentThread().getName());
        }
    }

    public void increment(Car car) {                       // wszystkie wątki mogę wykonywać te poeracje, nawet w tym samym czasie

        System.out.println(car.getModel()+" "+car.getManufacturer());
        countTwo++;                    // występuje wyścig pomiędzy wątkami
    }

    public int getSafetyResult() {
        return countOne;
    }

    public int getResult() {
        return countTwo;
    }
}
