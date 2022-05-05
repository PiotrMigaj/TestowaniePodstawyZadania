package pl.migibud.streamtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonSet implements Human{

    List<Person> personList = new ArrayList<>();

    void addPerson(Person person){
        if (person!=null){
            personList.add(person);
        }
    }

    List<Person> returnPersonFromCity(String city){

        return personList.stream().filter(person -> person.getCity().equals(city)).collect(Collectors.toList());

    }

    @Override
    public void introduceYourSelf() {

    }
}
