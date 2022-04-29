package pl.migibud.generics.ex2ex3;

public final class Utils {

    private Utils(){}

    public static <T> int countIf(T[] array, MyOwnPredicate<T> myOwnPredicate){

        int counter = 0;
        for (int i=0;i< array.length;i++){

            if (myOwnPredicate.validate(array[i])){
                counter++;
            }
        }
        return counter;
    }

    public static <T> void swap(T[] array, int index1, int index2){

        if (index1 < array.length-1 && index2 < array.length-1){
            T tmp = array[index1];
            array[index1]=array[index2];
            array[index2]=tmp;
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }
}


