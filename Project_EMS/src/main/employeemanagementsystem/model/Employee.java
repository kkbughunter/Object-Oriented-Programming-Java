package main.employeemanagementsystem.model;

public class Employee {
    private String name;
    private int age;
    private String dateOfJoin;
    private String degree;

    public Employee(String name, int age, String dateOfJoin, String degree) {
        this.name = name;
        this.age = age;
        this.dateOfJoin = dateOfJoin;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(String dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
