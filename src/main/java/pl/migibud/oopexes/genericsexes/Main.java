package pl.migibud.oopexes.genericsexes;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Piotr",3500,"R&D");
        Manager manager2 = new Manager("Piotr",3505,"R&D");

        Employee employee = new Employee("Rafał",1500);

        Employee[] employees = new Employee[]{manager,employee};

        GenericsClass<Employee> genericsClass = new GenericsClass<>(employees);
        genericsClass.compareFirstAndSecondElements();

        System.out.println(manager.compare(manager2,manager2));

    }

}
