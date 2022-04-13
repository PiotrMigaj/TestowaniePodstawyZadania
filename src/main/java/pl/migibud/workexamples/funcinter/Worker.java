package pl.migibud.workexamples.funcinter;

public class Worker {

    private String name;
    private Worker worker;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorkerName(Worker worker){
        this.worker=new Worker();
        this.worker.setName(worker.getName());
        //this.worker.setName("Ania");
    }
}
