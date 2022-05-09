package pl.migibud.javazaawansowanazadania.kolekcje.ex1;

import java.util.Arrays;

public class SDAArrayList<T> {

    Object[] tArray;
    private static final int INITIAL_CAPACITY = 5;
    int actualSize=0;

    public SDAArrayList() {
        this.tArray = new Object[INITIAL_CAPACITY];
    }

    public void add(T t){
        if (this.actualSize==tArray.length){
            this.increaseArraySize();
        }
        tArray[actualSize++]=t;
    }

    public T get(int index){
        if (index<0 || index>=actualSize){
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T) tArray[index];
    }

    private void increaseArraySize(){
        int newArraySize = tArray.length*2;
        tArray = Arrays.copyOf(tArray,newArraySize);
    }

    public T remove(int index){

        if (index<0 || index>=actualSize){
            throw new ArrayIndexOutOfBoundsException();
        }
        Object removedObj = tArray[index];

        for (int i=index;i<actualSize-1;i++){
            tArray[i]=tArray[i+1];
        }
        actualSize--;
        this.decreaseArraySize();
        return (T) removedObj;
    }

    private void decreaseArraySize(){
        tArray = Arrays.copyOf(tArray,tArray.length-1);
    }

    public void display(){

        for (int i=0;i<actualSize;i++){
            System.out.println(tArray[i]);
        }
    }


}
