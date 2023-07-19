package com.company;

public class User {
    private Integer ID;
    private String userName;
    private Integer userAge;
    private String userSex;

    public User(String userName, Integer userAge, String userSex) {
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
    }

    public User(Integer ID, String userName, Integer userAge, String userSex) {
        this.ID = ID;
        this.userName = userName;
        this.userAge = userAge;
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userSex='" + userSex + '\'' +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
