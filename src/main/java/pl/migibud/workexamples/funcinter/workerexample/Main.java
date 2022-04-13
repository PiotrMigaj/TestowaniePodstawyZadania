package pl.migibud.workexamples.funcinter.workerexample;

public class Main {

    static Worker worker = new Worker("Piotr","Długa","16");

    public static void main(String[] args) {
        System.out.println(worker);

        Worker.Address address = new Worker.Address();
//        address.setStreet();
//        address.setNumber();
    }

}
