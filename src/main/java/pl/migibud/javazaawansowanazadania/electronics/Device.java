package pl.migibud.javazaawansowanazadania.electronics;

public abstract class Device {

    String model;

    public Device(String model) {
        this.model = model;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
