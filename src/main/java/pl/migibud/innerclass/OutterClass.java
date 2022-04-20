package pl.migibud.innerclass;

public class OutterClass {

    private int a;

    public OutterClass(){}

    public OutterClass(int a) {
        this.a = new InnerClass().setA();
    }

    class InnerClass{

        int setA(){
            return 2;
        }

    }

}
