package staff;

public class Manager extends Employee{

    private final String deptName;


    public Manager(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}


