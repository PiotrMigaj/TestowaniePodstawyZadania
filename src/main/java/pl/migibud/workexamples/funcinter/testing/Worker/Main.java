package pl.migibud.workexamples.funcinter.testing.Worker;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker("Piotr","Migaj","Długa","16");

        System.out.println(worker);


        Boss boss = new Boss("CEO",worker);

        System.out.println(boss);
        System.out.println(worker);


    }
}
