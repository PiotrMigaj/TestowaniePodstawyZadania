package pl.migibud.files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {


        FileReader fr = null;

        try{
            fr = new FileReader("files\\fileWriterTest.txt");
            int num=0;
            while ((num= fr.read())!=-1){
                System.out.print((char)num);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fr!=null){
                fr.close();
            }
        }

    }
}
