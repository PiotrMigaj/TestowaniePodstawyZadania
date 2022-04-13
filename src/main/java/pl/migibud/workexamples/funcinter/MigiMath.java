package pl.migibud.workexamples.funcinter;

@FunctionalInterface
interface MyFunction{
    int myFunction(int a);
}

public class MigiMath {

    public static int myMathMethod(MyFunction f,int a){
        return 2*f.myFunction(a);
    }

}
