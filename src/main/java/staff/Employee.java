package staff;

import sun.jvm.hotspot.SALauncherLoader;
import sun.tools.java.BinaryClass;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) throws IllegalArgumentException{
        this.name = name;
        this.niNumber = niNumber;
        if (salary <= 0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0){
            this.name = name;

        }
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double salaryIncrease) {
        if (salaryIncrease > 0){
            this.salary += salaryIncrease;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
