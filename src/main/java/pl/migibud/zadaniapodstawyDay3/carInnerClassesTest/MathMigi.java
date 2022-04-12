package pl.migibud.zadaniapodstawyDay3.carInnerClassesTest;

public class MathMigi {

    public int value;

    public MathMigi(){
        int a=3;
        int b=4;
        this.value=MyMath.add(a,b);
    }

    private static class MyMath{

        static int add(int a,int b){
            return a+b;
        }

    }

}
