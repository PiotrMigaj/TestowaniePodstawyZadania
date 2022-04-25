package pl.migibud.classandinterfaces.ex1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] emailArr = UserValidator.validateEmails("pmigaj@gmail.com","pmi@kol.pl");

        System.out.println(Arrays.toString(emailArr));


    }

}
