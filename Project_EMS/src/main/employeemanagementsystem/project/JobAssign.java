package main.employeemanagementsystem.project;

import main.employeemanagementsystem.model.Employee;

public class JobAssign {
    private Project project;
    private Employee employee;

    public JobAssign(Project project, Employee employee) {
        this.project = project;
        this.employee = employee;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
