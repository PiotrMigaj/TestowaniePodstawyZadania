package pl.migibud.oopexes.ex7_1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Piotr");
        customer.setMemberType("Gold");


        Visit visit = new Visit(customer, LocalDate.now());

        visit.setProductExpense(1000);

        System.out.println(visit.getProductExpense());

        visit.setServiceExpense(1000);

        System.out.println(visit.getServiceExpense());

        System.out.println(visit.getTotalExpense());

    }

}
