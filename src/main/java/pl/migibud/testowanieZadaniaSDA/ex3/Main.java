package pl.migibud.testowanieZadaniaSDA.ex3;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Tekst");
//        StringBuilder sb2 = CloneStringBuilder.cloneSb(sb);
//
//        System.out.println(sb==sb2);

        String[] strArr1 = {"Piotr","Piotr","Piotr","Piotr","Piotr"};
        String[] strArr2=ArrayExample.removeDuplicates(strArr1);


        System.out.println(Arrays.toString(strArr1));
        System.out.println(Arrays.toString(strArr2));






    }

}
