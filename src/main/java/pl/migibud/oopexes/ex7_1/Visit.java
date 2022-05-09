package pl.migibud.oopexes.ex7_1;

import java.time.LocalDate;
import java.util.Date;

public class Visit {

    private final Customer customer;
    private final LocalDate localDate;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, LocalDate localDate) {
        this.customer = customer;
        this.localDate = localDate;
    }

    public String getName() {
        return customer.getName();
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense*DiscountRate.getServiceDiscountRate(customer.getMemberType());
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense*DiscountRate.getProductDiscountRate(customer.getMemberType());
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense(){
        return productExpense+serviceExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + localDate +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
