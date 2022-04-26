package pl.migibud.javazaawansowanazadania.students.exceptions;

public class StudentHasLessThan25PointsException extends Exception{

    public StudentHasLessThan25PointsException(){
        super("Student has less than 25 points, cant be added.");
    }
}
