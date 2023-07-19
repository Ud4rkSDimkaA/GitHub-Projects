package com.company;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        DBService dbService = new DBService();
        dbService.deleteUserFromDB("Prudnik Dima");
        List<User> allUsers = dbService.getAllUsers();
        allUsers.stream()
                .forEach(System.out::println);
    }
}
