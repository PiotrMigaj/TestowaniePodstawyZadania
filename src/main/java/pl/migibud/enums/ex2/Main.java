package pl.migibud.enums.ex2;

public class Main {

    public static void main(String[] args) {

        PackageSize p = PackageSize.MEDIUM;

        PackageSize p1 = PackageSize.getPackageSize(55,70);
        System.out.println(p1);


    }

}
