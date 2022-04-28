package pl.migibud.javazaawansowanazadania.students;

import pl.migibud.javazaawansowanazadania.students.exceptions.StudentHasLessThan25PointsException;
import pl.migibud.javazaawansowanazadania.students.numberofpoints.HardcodedNumberOfPoints;
import pl.migibud.javazaawansowanazadania.students.numberofpoints.NumberOfPointsProvider;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.Address;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.PersonalStudentData;

import java.time.LocalDate;
import java.util.UUID;

public class HighSchoolMain {
    public static void main(String[] args) throws StudentHasLessThan25PointsException {

        PersonalStudentData personalStudentData = new PersonalStudentData("Piotr Migaj", LocalDate.of(1992,7,24));

        Student student = new Student(new PersonalStudentData("Piotr Migaj",LocalDate.of(1992,7,24)),
                new Address("Wroclaw","Ig Chrz","41/2"),
                new HardcodedNumberOfPoints());



        StudentDatabase studentDatabase = new StudentDatabase();
        studentDatabase.addStudent(student);
        //System.out.println(studentDatabase.studentList);
        Student student1 = studentDatabase.getStudent(UUID
                .fromString(
                        "5fc03087-d265-11e7-b8c6-83e29cd24f4c"));
        //System.out.println(student1);
        studentDatabase.changeAddress(UUID
                .fromString(
                        "5fc03087-d265-11e7-b8c6-83e29cd24f4c"),new Address("Psary","Długa","16"));
        //System.out.println(studentDatabase.studentList);

        Student student2 = new Student(new PersonalStudentData("Jola Migaj",LocalDate.of(1994,7,24)),
                new Address("Wroclaw","Ig Chrz","41/2"),
                new HardcodedNumberOfPoints());
        Student student3 = new Student(new PersonalStudentData("Anna Migaj", LocalDate.of(1994, 7, 24)),
                new Address("Wroclaw", "Ig Chrz", "41/2"),
                new NumberOfPointsProvider() {
                    @Override
                    public int getNumberOfPoints() {
                        return 35;
                    }
                });

        studentDatabase.addStudent(student2);
        studentDatabase.addStudent(student3);

        //System.out.println(studentDatabase.studentList);
        //System.out.println(studentDatabase.getStudentsFromCity("Wroclaw"));

        //System.out.println(studentDatabase.getStudentsOrderedByAge());

//        System.out.println(new ScannerNumberOfPoints().getNumberOfPoints());

        System.out.println(studentDatabase.studentList);

        studentDatabase.punishStudents(27,"Wroclaw");

        System.out.println(studentDatabase.studentList);

        studentDatabase.markStudentAsGraduate(UUID
                .fromString(
                        "5fc03087-d265-11e7-b8c6-83e29cd24f4c"));

        System.out.println(studentDatabase.getActiveStudents());



    }
}
