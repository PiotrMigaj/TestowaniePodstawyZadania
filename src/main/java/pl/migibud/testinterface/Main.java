package pl.migibud.testinterface;

public class Main {

    public static void main(String[] args) {

        Class2 class2 = new Class2();
        class2.setA(new Class1());

        System.out.println(class2.getA());

    }

}
