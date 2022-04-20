package pl.migibud.inheritance.ex6;

public class Main {

    public static void main(String[] args) {

        Movable movableCircle = new MovableCircle(20,new MovablePoint(20,30,4,4));
        System.out.println(movableCircle);
    }
}
