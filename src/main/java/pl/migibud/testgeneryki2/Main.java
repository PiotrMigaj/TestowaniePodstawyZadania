package pl.migibud.testgeneryki2;

import pl.migibud.oopexes.genericsexes.Employee;

public class Main {

    public static void main(String[] args) {

        GenericList genericList = new GenericList();
        genericList.addElementToArray(32);
        genericList.addElementToArray("Piotr");
        genericList.addElementToArray(new Employee("Piotr Migaj",32));

        var name = genericList.getElementFromArray(2);
        System.out.println(name);




    }

}
