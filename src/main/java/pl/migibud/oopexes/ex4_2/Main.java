package pl.migibud.oopexes.ex4_2;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Piotr", "ul. Długa 16","CE",3,3500);
        String s = student.toString();
        System.out.println(s);

    }

}
