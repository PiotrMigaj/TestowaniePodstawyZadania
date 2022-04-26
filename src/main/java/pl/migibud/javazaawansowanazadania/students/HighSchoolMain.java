package pl.migibud.javazaawansowanazadania.students;

import pl.migibud.javazaawansowanazadania.students.exceptions.StudentHasLessThan25PointsException;
import pl.migibud.javazaawansowanazadania.students.numberofpoints.RandomNumberOfPoints;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.Address;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.PersonalStudentData;

import java.time.LocalDate;
import java.util.UUID;

public class HighSchoolMain {
    public static void main(String[] args) throws StudentHasLessThan25PointsException {

        UUID uuid = UUID.randomUUID();

        System.out.println(uuid);

        PersonalStudentData personalStudentData = new PersonalStudentData("Piotr Migaj", LocalDate.of(1992,7,24));

        System.out.println(personalStudentData);

        Student student = new Student(new PersonalStudentData("Piotr Migaj",LocalDate.of(1992,7,24)),
                new Address("Wroclaw","Ig Chrz","41/2"),
                new RandomNumberOfPoints());

        System.out.println(student);

        StudentDatabase studentDatabase = new StudentDatabase();
        studentDatabase.addStudent(student);
        System.out.println(studentDatabase.studentList);


    }
}
