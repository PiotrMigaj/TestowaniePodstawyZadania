package pl.migibud.testinterface;

public class Class1 implements Inter{

    private int a = 5;


    @Override
    public int myMethod() {
        return this.a;
    }
}
