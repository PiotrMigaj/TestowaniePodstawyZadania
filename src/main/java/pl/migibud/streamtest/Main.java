package pl.migibud.streamtest;

public class Main {

    public static void main(String[] args) {

        PersonSet personSet = new PersonSet();

        Person person = null;

        personSet.addPerson(new Person("Piotr","Wroclaw"));
        personSet.addPerson(new Person("Piotr","Warsaw"));
        personSet.addPerson(new Person("Ania","Wroclaw"));

        System.out.println(personSet.personList);

        personSet.returnPersonFromCity("Wroclaw").remove(0);

        System.out.println(personSet.personList);

        //System.out.println(personSet.returnPersonFromCity("Wroclaw"));

    }

}
