package pl.migibud.javazaawansowanazadania.students.studentsdatacontainer;

import java.time.LocalDate;
import java.util.UUID;

public class PersonalStudentData {

    private UUID id;
    private String fullName;
    private LocalDate dateOfBirth;

    public PersonalStudentData(String fullName, LocalDate dateOfBirth) {
        this.id = UUID.randomUUID();
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
    }

    public UUID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "PersonalStudentData{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
