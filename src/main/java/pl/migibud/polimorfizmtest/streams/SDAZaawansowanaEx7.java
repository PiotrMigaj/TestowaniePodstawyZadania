package pl.migibud.polimorfizmtest.streams;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SDAZaawansowanaEx7 {

    public static void main(String[] args) throws IOException {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 3000, "John"));
        employees.add(new Employee(2, 15000, "Mark"));
        employees.add(new Employee(3, 40000, "Bill"));

        employees.stream().forEach(System.out::println);

        Employee employee = employees.stream()
                .filter(Objects::nonNull)
                .filter(e->e.getSalary()>30_000)
                .findFirst()
                .orElseThrow(()->new RuntimeException("Not found!"));
        System.out.println();
        System.out.println(employee);
        System.out.println();
        employee.setSalary(5_000);
        employees.stream().forEach(System.out::println);

        System.out.println();

        Employee employee1 = new Employee(1, 3000, "John");

        System.out.println(employee1);

        ObjectMapper objectMapper = new ObjectMapper();

        Employee employee2 = objectMapper.readValue(objectMapper.writeValueAsString(employee1), Employee.class);

        employee2.setSalary(2000);
        System.out.println(employee2);

    }

}

class Employee{

    private Integer id;
    private Integer salary;
    private String name;

    public Employee(){}

    public Employee(Integer id, Integer salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
