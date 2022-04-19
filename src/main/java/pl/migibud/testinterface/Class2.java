package pl.migibud.testinterface;

public class Class2 {

    private int b;

    public int setB(Inter myInter){
        this.b = myInter.myMethod();
        return this.b*2;
    }

}
