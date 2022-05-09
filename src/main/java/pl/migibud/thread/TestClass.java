package pl.migibud.thread;

public class TestClass {

    private int first;
    private int second;

    public void iterateFirst(){
        for (int i=0;i<30_000;i++){
            first++;
        }
    }

    public void iterateSecond(){
        for (int i=0;i<30_000;i++){
            second++;
        }
    }

    public void getSum(){
        System.out.println(first+second);
    }

}
