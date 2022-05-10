package pl.migibud.javazaawansowanazadania.multithreading.ex2;

public class Bridge {

    int driveThrough;

    public void driveThrough(Car car){
        System.out.printf("Car %s %s has just ridden over the bridge.\n",car.getManufacturer(),car.getModel());
        driveThrough++;
//        try{
//            Thread.sleep(100);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }


}
