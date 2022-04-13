package pl.migibud.workexamples.funcinter;

public class Main {

    public static void main(String[] args) {

//        int result = MigiMath.myMathMethod(Main::mathMain,3);
//
//        System.out.println(result);

        Worker worker = new Worker();
        worker.setName("Piotr");
        System.out.println(worker.getName());

        Worker worker1 = new Worker();
        worker1.setName("Wojtek");
        System.out.println(worker1.getName());
        worker1.setWorkerName(worker);

        System.out.println(worker.getName());
        System.out.println(worker1.getName());
        System.out.println(worker1.getWorker().getName());

    }

//
}
