package pl.migibud.javazaawansowanazadania.multithreading.ex2;

public class Car {

    private String model;
    private String manufacturer;

    public Car(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + model + '\'' +
                ", type='" + manufacturer + '\'' +
                '}';
    }
}
