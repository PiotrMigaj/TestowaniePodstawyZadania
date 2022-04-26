package pl.migibud.javazaawansowanazadania.students;

import pl.migibud.javazaawansowanazadania.students.exceptions.StudentHasLessThan25PointsException;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.Address;

import java.util.List;
import java.util.UUID;

public interface StudentDatabaseProvider {

    void addStudent(Student student) throws StudentHasLessThan25PointsException;
    Student getStudent(UUID id);
    void changeAddress(UUID id, Address address);
    List<Student> getStudentsFromCity(String city);
    List<Student> getStudentsOrderedByAge();
    void punishStudents(int age, String city);

}
