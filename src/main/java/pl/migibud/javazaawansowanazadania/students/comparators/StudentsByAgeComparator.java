package pl.migibud.javazaawansowanazadania.students.comparators;

import pl.migibud.javazaawansowanazadania.students.Student;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class StudentsByAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        LocalDate now = LocalDate.now();
        long diffO1 = ChronoUnit.DAYS.between(now,o1.getYearOfBirthOfStudent());
        long diffO2 = ChronoUnit.DAYS.between(now,o2.getYearOfBirthOfStudent());
        return (int)(diffO1-diffO2);
    }
}
