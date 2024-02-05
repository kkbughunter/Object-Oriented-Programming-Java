package main.employeemanagementsystem.model;

public class Manager extends Employee {
    private int salary;
    private String department;

    public Manager(String name, int age, String dateOfJoin, String degree, int salary, String department) {
        super(name, age, dateOfJoin, degree);
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
