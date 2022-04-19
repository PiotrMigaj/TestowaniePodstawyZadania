package pl.migibud.testinterface;

public class Class2 {

    private int a;

    public void setA(Inter1 inter1){
        this.a = inter1.number();
    }

    public int getA() {
        return this.a;
    }
}
