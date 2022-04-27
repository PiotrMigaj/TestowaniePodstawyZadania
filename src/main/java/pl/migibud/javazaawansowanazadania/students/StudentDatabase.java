package pl.migibud.javazaawansowanazadania.students;

import pl.migibud.javazaawansowanazadania.students.comparators.StudentsByAgeComparator;
import pl.migibud.javazaawansowanazadania.students.exceptions.StudentHasLessThan25PointsException;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.Address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StudentDatabase implements StudentDatabaseProvider{

    List<Student> studentList;
    private Iterator<Student> studentIterator;

    public StudentDatabase() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) throws StudentHasLessThan25PointsException {
        if (student.getNumberOfPoints()>=25){
            studentList.add(student);
        }else {
            throw new StudentHasLessThan25PointsException();
        }
    }

    @Override
    public Student getStudent(UUID id) {

        studentIterator = studentList.iterator();

        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            if (student.getStudentId().equals(id)){
                System.out.println("Student has been found.");
                return student;
            }
        }
        System.out.println("Student has not been found.");
        return null;
    }

    @Override
    public void changeAddress(UUID id, Address address) {

        Student student = this.getStudent(id);
        if (student==null){
            return;
        }
        student.address=address;
        System.out.println("Address has been changed.");
    }

    @Override
    public List<Student> getStudentsFromCity(String city) {
        return studentList.stream().filter(s->s.getStudentCity().equals(city)).collect(Collectors.toList());
    }

    @Override
    public List<Student> getStudentsOrderedByAge() {
//        List<Student> sortedStudentList = new ArrayList<>(this.studentList);
//        sortedStudentList.sort(new StudentsByAgeComparator());
//        return sortedStudentList;

        return studentList.stream().sorted(new StudentsByAgeComparator()).collect(Collectors.toList());
    }

    @Override
    public void punishStudents(int age, String city) {
        //studentList.stream().filter(student -> student.getStudentAge()==age).filter(student -> student.getStudentCity().equals(city)).iterator().next().reduceNumberOfPoints(10);
        //studentIterator = studentList.iterator();
        for (int i =0;i<studentList.size();i++){
            if (studentList.get(i).getStudentAge()<30){
                studentList.remove(i);
            }

        }
    }
}
