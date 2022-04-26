package pl.migibud.interfaces;

public class Main {

    public static void main(String[] args) {

        MyClass myClass = new MyClass(3,x->2*x);

        System.out.println(myClass.getMyOppsInClass().myOpp(2));
        System.out.println(myClass.result());


    }
}
