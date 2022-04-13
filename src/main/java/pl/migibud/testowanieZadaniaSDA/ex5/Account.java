package pl.migibud.testowanieZadaniaSDA.ex5;

import pl.migibud.workexamples.funcinter.workerexample.Worker;

public class Account {

    private int balance;
    private String accountNumber;
    private Owner owner;

    public Account(int balance) {
        this.balance = balance;
    }

    private static class Owner{

        private String firstName;
        private String lastName;

        public Owner(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }

}
