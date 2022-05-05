package pl.migibud.generics.ex4;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends MediaContent> {

    List<T> tList = new ArrayList<>();

    public void addElementToLibrary(T t){
        if (t!=null){
            tList.add(t);
        }
    }

    public List<T> getTList() {
        return tList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "tList=" + tList +
                '}';
    }
}
