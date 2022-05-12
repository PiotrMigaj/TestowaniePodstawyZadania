package pl.migibud.testgeneryki;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GenericList<T> {

    private static final int INITIAL_CAPACITY = 5;
    Object[] objectsArray;
    int arrayCurrentPosPointer;

    public GenericList() {
        this.objectsArray = new Object[INITIAL_CAPACITY];
    }

    public boolean addElementToArray(T t) {
        objectsArray[arrayCurrentPosPointer] = t;
        if (++arrayCurrentPosPointer == objectsArray.length) {
            increaseObjectsArrayCapacity();
        }
        return true;
    }

    public boolean addElementToArray(int index, T t) {
        if (!(this.arrayCurrentPosPointer==0&&index==0)){
            this.isIndexInRangeOfObjectsArray(index);
        }
        for(int i = arrayCurrentPosPointer;i>index;i--){
            this.objectsArray[i]=this.objectsArray[i-1];
        }
        objectsArray[index] = t;
        if (++arrayCurrentPosPointer == objectsArray.length) {
            increaseObjectsArrayCapacity();
        }
        return true;
    }

    private void increaseObjectsArrayCapacity() {
        int newObjectsArraySize = this.objectsArray.length * 2;
        this.objectsArray = Arrays.copyOf(this.objectsArray, newObjectsArraySize);
    }

    public T getElementFromArray(int index) {
        this.isIndexInRangeOfObjectsArray(index);
        return (T) objectsArray[index];
    }

    private void isIndexInRangeOfObjectsArray(int index) {
        if (index < 0 || index >= arrayCurrentPosPointer) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public T removeElementFromArray(int index) {
        T tmpElement = this.getElementFromArray(index);
        this.narrowObjectsArray(index);
        arrayCurrentPosPointer--;
        this.decreaseObjectsArrayCapacity();
        return (T) objectsArray[index];
    }

    public void narrowObjectsArray(int index) {
        for (int i=index;i<arrayCurrentPosPointer;i++){
            this.objectsArray[i]=this.objectsArray[i+1];
        }
    }

    private void decreaseObjectsArrayCapacity() {
        this.objectsArray = Arrays.copyOf(this.objectsArray, this.objectsArray.length-1);
    }


}
