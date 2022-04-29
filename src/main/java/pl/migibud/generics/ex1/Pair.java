package pl.migibud.generics.ex1;

public class Pair<T,Y> {

    private T t;
    private Y y;

    public Pair(T t, Y y) {
        this.t = t;
        this.y = y;
    }

    public T getT() {
        return t;
    }

    public Y getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "t=" + t +
                ", y=" + y +
                '}';
    }
}
