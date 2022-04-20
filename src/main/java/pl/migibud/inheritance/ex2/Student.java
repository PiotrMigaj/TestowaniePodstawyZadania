package pl.migibud.inheritance.ex2;

public class Student extends Person{

    String faculty;
    int year, cost;

    public Student(Person person,StudentData studentData) {
        super(person);
        this.faculty = studentData.getFaculty();
        this.year = studentData.getYear();
        this.cost = studentData.getCost();
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(": (%s, %d, %d)",this.faculty,this.year,this.cost);
    }
}
