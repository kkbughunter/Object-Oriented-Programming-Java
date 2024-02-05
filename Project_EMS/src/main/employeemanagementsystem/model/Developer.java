package main.employeemanagementsystem.model;

public class Developer extends Employee {
    private int salary;
    private String department;
    private String programmingLanguage;
    private int experienceYears;

    public Developer(String name, int age, String dateOfJoin, String degree, int salary, String department, String programmingLanguage, int experienceYears) {
        super(name, age, dateOfJoin, degree);
        this.programmingLanguage = programmingLanguage;
        this.experienceYears = experienceYears;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
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
