package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Director extends Employee {
    private String firstName;
    private String lastName;
    private int workExperience;
    private Position position;
    private List<Employee> directorsEmployees = new ArrayList<>();

    public Director(String firstName, String lastName, int workExperience, List<Employee> directorsEmployees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workExperience = workExperience;
        this.position = Position.DIRECTOR;
        this.directorsEmployees = directorsEmployees;
    }

    public void displayEmployees() {
        System.out.println("All employees of director| " + this.getFirstName() + " |: ");
        for (Employee employee : directorsEmployees) {
            System.out.println(employee.getFirstName() + " " + employee.getLastName());
        }
    }

    public void addNewEmployee(Employee newEmployee) {
        if (newEmployee.getPosition().equals(Position.DIRECTOR)) {
            Director director = (Director) newEmployee;
            List<Employee> newDirectorsEmployees = director.getDirectorsEmployees();
            directorsEmployees.addAll(newDirectorsEmployees);
            directorsEmployees.add(director);
        } else {
            boolean isExist = false;
            Worker worker = (Worker) newEmployee;
            for (Employee employee : directorsEmployees) {
                if (worker.equals(employee)) {
                    isExist = true;
                }
            }
            if (isExist) {
                System.out.println(newEmployee.getFirstName() + " " + newEmployee.getLastName() + " wasn't added!");
            } else {
                directorsEmployees.add(worker);
                System.out.println(worker.getFirstName() + " " + worker.getLastName() + " was added!");
            }
        }

    }

    public void findEmployee(String firstName, String lastName){
        boolean isExist = false;
        for (Employee employee :directorsEmployees){
            if(employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)){
                isExist = true;
            }
        }
        if(isExist){
            System.out.println(firstName + " " + lastName + " is an employee of " + this.firstName);
        }else{
            System.out.println(firstName + " " + lastName + " is not found like an employee of "+ this.firstName);
        }
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Employee> getDirectorsEmployees() {
        return directorsEmployees;
    }

    public void setDirectorsEmployees(List<Employee> directorsEmployees) {
        this.directorsEmployees = directorsEmployees;
    }
}
