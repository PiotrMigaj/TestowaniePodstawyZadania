package pl.migibud.copyobjectwithstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {

        class Person{

            String name;
            int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }

        List<Person> personList = new ArrayList<>();

        Person person = new Person("Piotr",30);

        personList.add(person);

        System.out.println(personList);

        List<Person> copiedPersonList = personList.stream().collect(Collectors.toList());
        System.out.println(copiedPersonList);

        Person person1 = copiedPersonList.get(0);

        person1.name="Darek";

        System.out.println(personList);
        System.out.println(copiedPersonList);


    }

}
