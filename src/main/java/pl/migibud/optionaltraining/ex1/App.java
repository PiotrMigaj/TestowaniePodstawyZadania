package pl.migibud.optionaltraining.ex1;

import java.util.Optional;

public class App {

    public static void main(String[] args) {

        //Stamp stamp = new Stamp("Barbados");

        //Passport passport = new Passport(Optional.of(stamp));

        //Person person = new Person("Kevin",passport);

//        System.out.println(person.getName()+" "+person.getPassport().getStamp().getStampOfCountry());

//        if (person!=null){
//            Passport p = person.getPassport();
//            if (p!=null){
//                Stamp s = p.getStamp();
//                if (s!=null){
//                    System.out.println(s.getStampOfCountry());
//                }
//            }
//        }
        Optional<Stamp> stamp = Optional.ofNullable(new Stamp("Barbados"));
        Optional<Passport> passport = Optional.ofNullable(new Passport(stamp));
        Optional<Person> person = Optional.ofNullable(new Person("Kevin",passport));

        String stampOfCountry = person.flatMap(Person::getPassport).flatMap(Passport::getStamp).map(v->v.getStampOfCountry()).get();

        System.out.println(stampOfCountry);
    }
}
