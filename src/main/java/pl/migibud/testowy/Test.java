package pl.migibud.testowy;

public class Test {

    private int a;
    private Test test;

    public Test(int a, Test test) {
        this.a = a;
        this.test = test;
    }

    private void testM(Test test){
        System.out.println(test.a);


    }

}
