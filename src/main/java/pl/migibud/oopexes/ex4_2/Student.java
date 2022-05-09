package pl.migibud.oopexes.ex4_2;

public class Student extends Person{

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "Student{" +
                "program='" + program + '\'' +
                ", year=" + year +
                ", fee=" + fee +
                ", name=" + this.getName() +
                ", address=" + this.getAddress() +
                '}';
    }
}
