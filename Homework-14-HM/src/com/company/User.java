package com.company;

import java.util.Objects;

public class User implements Comparable<User>{
    private String firstName;
    private String sex;
    private Integer age;

    public User(String firstName, String sex, Integer age) {
        this.firstName = firstName;
        this.sex = sex;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) && Objects.equals(sex, user.sex) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, sex, age);
    }

    @Override
    public int compareTo(User o) {
        if(this.age > o.age) return 1;
        else if(this.age == o.age){
            return this.firstName.charAt(0)-o.firstName.charAt(0);
        }
        else return -1;
    }

    @Override
    public String toString() {
        return "User "+ firstName+ " age " +age;
    }
}
