package pl.migibud.files;

import java.io.*;

public class ObjectInputStreamSerialization {
    public static void main(String[] args) throws IOException {

        ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("files\\cars.pmig")));

        try {

            while (true){
                CarObject carObject = (CarObject) in.readObject();
                System.out.println(carObject);
            }

        }catch (EOFException e){

        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            if (in!=null){
                in.close();
            }
        }

    }
}
