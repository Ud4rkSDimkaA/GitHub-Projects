package com.company.model;

import java.util.Objects;

public class Worker extends Employee{

    private String firstName;
    private String lastName;
    private int workExperience;
    private Position position;

    public Worker(String firstName, String lastName, int workExperience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workExperience = workExperience;
        this.position = Position.WORKER;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Worker worker = (Worker) o;
        return workExperience == worker.workExperience && Objects.equals(firstName, worker.firstName) && Objects.equals(lastName, worker.lastName) && position == worker.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, workExperience, position);
    }
}
