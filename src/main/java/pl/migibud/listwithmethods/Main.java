package pl.migibud.listwithmethods;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<MyI> myIList = new ArrayList<>();

        myIList.add(x->2*x);
        myIList.add(x->3*x);
        myIList.add(x->4*x);

        int a = myIList.get(0).numOpp(2);
        System.out.println(a);

        myIList.stream().forEach(e-> System.out.println(e.numOpp(2)));


    }

}
