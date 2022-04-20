package pl.migibud.inheritance.ex2;

public class StudentData {

    private String faculty;
    private int year, cost;

    public StudentData(String faculty, int year, int cost) {
        this.faculty = faculty;
        this.year = year;
        this.cost = cost;
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
}
