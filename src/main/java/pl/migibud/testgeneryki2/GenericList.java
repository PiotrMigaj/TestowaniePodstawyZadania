package pl.migibud.testgeneryki2;

import java.util.Arrays;

public class GenericList {

    private static final int INITIAL_CAPACITY = 2;
    Object[] objectsArray;
    int arrayCurrentPosPointer;

    public GenericList() {
        this.objectsArray = new Object[INITIAL_CAPACITY];
    }

    public <T> boolean addElementToArray(T t){
        objectsArray[arrayCurrentPosPointer]=t;
        if (++arrayCurrentPosPointer==objectsArray.length){
            increaseObjectsArrayCapacity();
        }
        return true;
    }

    private void increaseObjectsArrayCapacity() {
        int newObjectsArraySize = this.objectsArray.length*2;
        this.objectsArray = Arrays.copyOf(this.objectsArray,newObjectsArraySize);
    }

    public <T> T getElementFromArray(int index){
        arrayCurrentPosPointer--;
        return (T)objectsArray[index];
    }



}
