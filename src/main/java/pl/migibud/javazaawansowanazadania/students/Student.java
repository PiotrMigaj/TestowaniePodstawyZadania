package pl.migibud.javazaawansowanazadania.students;

import pl.migibud.javazaawansowanazadania.students.numberofpoints.NumberOfPointsProvider;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.Address;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.PersonalStudentData;

public class Student {

    private PersonalStudentData personalStudentData;
    private Address address;
    private int numberOfPoints;

    public Student(PersonalStudentData personalStudentData, Address address, NumberOfPointsProvider numberOfPointsProvider) {
        this.personalStudentData = personalStudentData;
        this.address = address;
        this.numberOfPoints = numberOfPointsProvider.getNumberOfPoints();
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    @Override
    public String toString() {
        return "Student{" +
                "personalStudentData=" + personalStudentData +
                ", address=" + address +
                ", numberOfPoints=" + numberOfPoints +
                '}';
    }
}
