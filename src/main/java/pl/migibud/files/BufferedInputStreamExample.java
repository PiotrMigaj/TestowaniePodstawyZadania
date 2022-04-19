package pl.migibud.files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args) throws IOException {
        BufferedInputStream in = null;

        try {

            in = new BufferedInputStream(new FileInputStream("test.txt"));

            int v=0;
            while ((v=in.read())!=-1){
                System.out.print((char) v);
            }


        }catch (IOException e){

        }finally {
            if (in!=null){
                in.close();
            }
        }
    }

}
