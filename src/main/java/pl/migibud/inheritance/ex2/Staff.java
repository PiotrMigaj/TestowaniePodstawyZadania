package pl.migibud.inheritance.ex2;

public class Staff extends Person {

    String specs;
    int salary;

    public Staff(String specs, int salary) {
        super();
        this.specs = specs;
        this.salary = salary;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(": (%s, %d)",this.specs,this.salary);
    }
}
