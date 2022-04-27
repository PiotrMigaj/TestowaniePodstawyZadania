package pl.migibud.javazaawansowanazadania.students;

import pl.migibud.javazaawansowanazadania.students.numberofpoints.NumberOfPointsProvider;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.Address;
import pl.migibud.javazaawansowanazadania.students.studentsdatacontainer.PersonalStudentData;

import java.time.LocalDate;
import java.util.UUID;

public class Student {

    private PersonalStudentData personalStudentData;
    Address address;
    private int numberOfPoints;

    public Student(PersonalStudentData personalStudentData, Address address, NumberOfPointsProvider numberOfPointsProvider) {
        this.personalStudentData = personalStudentData;
        this.address = address;
        this.numberOfPoints = numberOfPointsProvider.getNumberOfPoints();
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public UUID getStudentId(){
        return this.personalStudentData.getId();
    }

    public String getStudentCity(){
        return this.address.getCity();
    }

    public LocalDate getYearOfBirthOfStudent(){
        return this.personalStudentData.getDateOfBirth();
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
