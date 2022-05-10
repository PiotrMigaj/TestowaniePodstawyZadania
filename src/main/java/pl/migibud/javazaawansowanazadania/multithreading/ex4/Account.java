package pl.migibud.javazaawansowanazadania.multithreading.ex4;

public class Account {

    private float saldo;

    public Account(float saldo) {
        this.saldo = saldo;
    }

    public void transfer(float amount){
        this.saldo+=amount;
        notify();
    }
}
