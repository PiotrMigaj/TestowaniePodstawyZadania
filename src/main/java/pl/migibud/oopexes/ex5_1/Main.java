package pl.migibud.oopexes.ex5_1;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(10,20);
        Point p2 = new Point(30,40);

        Line line = new Line(p1,p2);
        System.out.println(line);

    }

}
