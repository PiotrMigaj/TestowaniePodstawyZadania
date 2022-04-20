package pl.migibud.files;

import java.io.*;

public class DataInputStreamExample {

    public static void main(String[] args) throws IOException {

        DataInputStream in = null;

        try{


            in = new DataInputStream(new BufferedInputStream(new FileInputStream("files\\test.dat")));

            String str = in.readUTF();
            System.out.println(str);
//            in.writeShort(32000);
//            in.writeLong(1234564213L);
//            in.writeFloat(23.56f);
//            in.writeDouble(123456.4564d);
//            in.writeByte(12);
//            in.writeChar('A');




        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (in!=null){
                in.close();
            }
        }


    }
}
