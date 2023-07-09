package com.company;

public class Member {
    private String firstName;
    private Integer age;
    private boolean isAdult;
    private SEX sex;

    public enum SEX{
        MAN, WOMAN
    }

    public Member(String firstName, Integer age, boolean isAdult, SEX sex) {
        this.firstName = firstName;
        this.age = age;
        this.isAdult = isAdult;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    @Override
    public String toString() {
        return "Member{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    public SEX getSex() {
        return sex;
    }
}
