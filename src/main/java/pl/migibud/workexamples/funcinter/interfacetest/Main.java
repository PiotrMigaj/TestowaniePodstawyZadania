package pl.migibud.workexamples.funcinter.interfacetest;

public class Main {

    public static void main(String[] args) {

        MyInterface myInterface = new MyClass();
        myInterface.print();

        MyClass myClass = (MyClass) myInterface;



    }

}
