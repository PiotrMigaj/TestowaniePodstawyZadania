package pl.migibud.testinterface.ex1;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        int result = account.getMoney(125,Main::MyFunc);
        System.out.println(result);
    }

    public static int MyFunc(int amount){
        return 2*amount;
    }
}
