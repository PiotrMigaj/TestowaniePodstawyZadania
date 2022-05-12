package pl.migibud.javazaawansowanazadania.multithreading.ex4;

public class Account {

    private float saldo;

    public Account(float saldo) {
        this.saldo = saldo;
    }

    public synchronized void deposit(float amount){
        this.saldo+=amount;
        notify();
        System.out.println(String.format("Transfer %s, saldo: %f",this.saldo,amount));
    }

    public synchronized void withdrawal(float amount) throws InterruptedException {

        while (amount>this.saldo){
            System.out.println("Not enough money! Waiting ...");
            wait();
        }
        this.saldo-=amount;
        System.out.println(String.format("Withdrawal %f, saldo: %f",amount,this.saldo));
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Account{" +
                "saldo=" + saldo +
                '}';
    }
}
