package pl.migibud.testinterface;


public class Class1 implements Inter1{

    private int myNumber = 3;

    @Override
    public int number() {
        return this.myNumber;
    }
}
