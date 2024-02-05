package main;

import main.employeemanagementsystem.model.Employee;
import main.employeemanagementsystem.model.Manager;
import main.employeemanagementsystem.model.Developer;
import main.employeemanagementsystem.project.JobAssign;
import main.employeemanagementsystem.project.Project;

public class Main {
    public static void main(String[] args) {
        // Adding constant numbers of employees, projects, and job assignments
        final int NUM_EMPLOYEES = 3;
        final int NUM_PROJECTS = 2;

        // Creating employees
        Employee employee1 = new Employee("sam", 30, "2022-01-01", "BSc");
        Manager manager1 = new Manager("som", 35, "2021-12-01", "MBA", 80000, "HR");
        Developer developer1 = new Developer("ram", 28, "2023-03-15", "BEng", 60000, "IT", "Java", 3);

        // Creating projects
        Project project1 = new Project("web Application Dev", "Description for ProjectA");
        Project project2 = new Project("Mobile Application Dev", "Description for ProjectB");

        // Creating job assignments
        JobAssign jobAssign1 = new JobAssign(project1, employee1);
        JobAssign jobAssign2 = new JobAssign(project2, manager1);
        JobAssign jobAssign3 = new JobAssign(project1, developer1);

        // Outputting information
        System.out.println("Employees:");
        System.out.println(employee1.getName());
        System.out.println(manager1.getName());
        System.out.println(developer1.getName());

        System.out.println("\nProjects:");
        System.out.println(project1.getProjectName());
        System.out.println(project2.getProjectName());

        System.out.println("\nJob Assignments:");
        System.out.println("Project: " + jobAssign1.getProject().getProjectName() +
                           ", Assigned Employee: " + jobAssign1.getEmployee().getName());
        System.out.println("Project: " + jobAssign2.getProject().getProjectName() +
                           ", Assigned Manager: " + jobAssign2.getEmployee().getName());
        System.out.println("Project: " + jobAssign3.getProject().getProjectName() +
                           ", Assigned Developer: " + jobAssign3.getEmployee().getName());
    }
}
