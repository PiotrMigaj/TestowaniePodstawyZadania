package pl.migibud.exescodewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

    public static void main(String[] args) {


        String str = "abracadabraoi";

        int vowelsCount = 0;
        Matcher matcher = Pattern.compile("[aeiou]").matcher(str);
        while (matcher.find()){
            vowelsCount++;
        }

        System.out.println(vowelsCount);
        System.out.println(str.replaceAll("(?i)[^aeiou]", "").length());



    }

}
