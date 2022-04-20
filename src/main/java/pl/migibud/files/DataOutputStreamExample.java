package pl.migibud.files;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {

        DataOutputStream out = null;

        try{
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("files\\test.dat")));

            out.writeUTF("Testowy strumień binarny");
            out.writeShort(32000);
            out.writeLong(1234564213L);
            out.writeFloat(23.56f);
            out.writeDouble(123456.4564d);
            out.writeByte(12);
            out.writeChar('A');
            out.flush();



        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (out!=null){
                out.close();
            }
        }


    }
}
