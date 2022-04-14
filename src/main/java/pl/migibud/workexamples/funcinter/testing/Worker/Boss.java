package pl.migibud.workexamples.funcinter.testing.Worker;

public class Boss {

    private String position;
    private Worker worker;

    public Boss(String position, Worker worker) {
        this.position = position;
        this.worker = worker;
        this.worker.getAddress().setStreet("Malinowa");
    }

    @Override
    public String toString() {
        return "Boss{" +
                "position='" + position + '\'' +
                ", worker=" + worker +
                '}';
    }
}
