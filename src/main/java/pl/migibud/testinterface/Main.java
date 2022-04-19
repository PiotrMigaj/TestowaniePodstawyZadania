package pl.migibud.testinterface;

public class Main {

<<<<<<< HEAD

    public static void main(String[] args) {

        int c = new Class2().setB(new Class1());



    }
=======
    public static void main(String[] args) {

        Class2 class2 = new Class2();
        class2.setA(new Class1());

        System.out.println(class2.getA());

    }

>>>>>>> origin/main
}
