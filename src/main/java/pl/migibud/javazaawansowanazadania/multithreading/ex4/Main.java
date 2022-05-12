package pl.migibud.javazaawansowanazadania.multithreading.ex4;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Account account = new Account(10000);

        Thread thread1 = new Thread(()->{
           while(!Thread.interrupted()){
               try{
                   account.withdrawal(20000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }
           }

        });

        Thread thread2 = new Thread(()->{
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            account.deposit(5000);
        });

        Thread thread3 = new Thread(()->{
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            account.deposit(3000);
        });

        thread1.start();
        thread2.start();
        thread3.start();

        //thread1.join(5000);
        thread2.join();
        thread3.join();
        thread1.interrupt();



        System.out.println("Cześć !");
    }


}
