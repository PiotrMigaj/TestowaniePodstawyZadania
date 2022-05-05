package pl.migibud.oopexes.extras;

public class Main {

    static Visit visit = new Visit(Discount.SMALL);

    public static void main(String[] args) {
        System.out.println(visit.getPrice());
    }

}
