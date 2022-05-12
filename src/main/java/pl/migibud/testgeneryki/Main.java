package pl.migibud.testgeneryki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        GenericList<String> genericList = new GenericList();
//        genericList.addElementToArray("Piotr");
//        genericList.addElementToArray("Piotr");
//            genericList.removeElementFromArray(0);
//        genericList.addElementToArray("Piotr");
            genericList.addElementToArray(0,"Ania");
            genericList.addElementToArray(0,"Ania");
            genericList.addElementToArray(1,"Ania");
            genericList.addElementToArray(2,"Ania");
            genericList.addElementToArray(3,"Piotr");
            genericList.addElementToArray(3,"Piotr");
            genericList.removeElementFromArray(0);
        System.out.println(Arrays.toString(genericList.objectsArray));
        System.out.println(genericList.arrayCurrentPosPointer);
        System.out.println(genericList.objectsArray.length);

    }


}
