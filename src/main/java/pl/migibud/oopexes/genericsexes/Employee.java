package pl.migibud.oopexes.genericsexes;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {

    private String name;
    int salary;

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary-o2.salary;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
