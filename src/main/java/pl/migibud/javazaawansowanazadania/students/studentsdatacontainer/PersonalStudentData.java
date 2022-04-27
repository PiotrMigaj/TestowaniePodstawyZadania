package pl.migibud.javazaawansowanazadania.students.studentsdatacontainer;

import java.time.LocalDate;
import java.util.UUID;

public class PersonalStudentData {

    private UUID id;
    private String fullName;
    private LocalDate dateOfBirth;

    public PersonalStudentData(String fullName, LocalDate dateOfBirth) {
        //this.id = UUID.randomUUID();
        this.id = UUID
                .fromString(
                        "5fc03087-d265-11e7-b8c6-83e29cd24f4c");

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
