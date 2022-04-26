package pl.migibud.javazaawansowanazadania.students;

import pl.migibud.javazaawansowanazadania.students.exceptions.StudentHasLessThan25PointsException;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class StudentDatabase implements StudentDatabaseProvider{

    List<Student> studentList;

    public StudentDatabase() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) throws StudentHasLessThan25PointsException {
        if (student.getNumberOfPoints()>25){
            studentList.add(student);
        }else {
            throw new StudentHasLessThan25PointsException();
        }
    }

    @Override
    public Student getStudent(UUID id) {
        return null;
    }

    @Override
    public void changeAddress(UUID id, Address address) {

    }

    @Override
    public List<Student> getStudentsFromCity(String city) {
        return null;
    }

    @Override
    public List<Student> getStudentsOrderedByAge() {
        return null;
    }

    @Override
    public void punishStudents(int age, String city) {

    }
}
