package pl.migibud.interfaces;

public class MyClass {

    private int a;
    private MyOpps myOppsInClass;

    public MyClass(int a, MyOpps myOppsInClass) {
        this.a = a;
        this.myOppsInClass = myOppsInClass;
    }

    public MyOpps getMyOppsInClass() {
        return myOppsInClass;
    }

    public int result(){
        return myOppsInClass.myOpp(this.a);
    }
}
