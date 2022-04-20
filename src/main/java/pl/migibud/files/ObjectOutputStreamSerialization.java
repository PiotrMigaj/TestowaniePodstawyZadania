package pl.migibud.files;

import java.io.*;

class CarObject implements Serializable{

    private String manufacturer;
    private String name;
    private int productionYear;
    private int topSpeed;
    private transient int id;

    public CarObject(String manufacturer, String name, int productionYear, int topSpeed, int id) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.productionYear = productionYear;
        this.topSpeed = topSpeed;
        this.id = id;
    }

    @Override
    public String toString() {
        return "CarObject{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", productionYear=" + productionYear +
                ", topSpeed=" + topSpeed +
                ", id=" + id +
                '}';
    }
}

public class ObjectOutputStreamSerialization {

    public static void main(String[] args) throws IOException {

        CarObject car1 = new CarObject("Ford","Mustang",1970,200,1);
        CarObject car2 = new CarObject("VW","Golf",1999,130,2);
        CarObject car3 = new CarObject("VW","Passat",2020,160,3);

        ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("files\\cars.pmig")));

        out.writeObject(car1);
        out.writeObject(car2);
        out.writeObject(car3);
        out.flush();
        out.close();

    }

}
