package com.company.model;

import java.util.Objects;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int workExperience;
    private Position position;

    public int getSalary() {
        return 3 * workExperience * 100;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return workExperience == employee.workExperience && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, workExperience, position);
    }
}
