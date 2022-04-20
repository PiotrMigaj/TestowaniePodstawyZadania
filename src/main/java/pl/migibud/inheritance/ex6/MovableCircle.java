package pl.migibud.inheritance.ex6;

public class MovableCircle implements Movable {

    int radius;
    Movable movable;

    public MovableCircle(int radius, MovablePoint movablePoint) {
        this.radius = radius;
        this.movable = new MovablePoint(movablePoint);
    }

    @Override
    public void moveUp() {
        this.movable.moveUp();
    }

    @Override
    public void moveDown() {
        this.movable.moveDown();
    }

    @Override
    public void moveLeft() {
        this.movable.moveLeft();
    }

    @Override
    public void moveRight() {
        this.movable.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", movable=" + movable +
                '}';
    }
}
