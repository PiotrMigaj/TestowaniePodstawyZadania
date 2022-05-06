package pl.migibud.oopexes.genericsexes;

public class GenericsClass<T extends Employee> {

    private T[] tArray;

    public GenericsClass(T[] tArray){
        this.tArray=tArray;
    }

    public void compareFirstAndSecondElements(){
        int a = tArray[0].compare(tArray[0],tArray[1]);
        if (a==0){
            System.out.println("są równe");
        }
        if (a<0){
            System.out.println("1 mniejszy od 2");
        }
        if (a>0){
            System.out.println("1 większy od 2");
        }
    }
}
