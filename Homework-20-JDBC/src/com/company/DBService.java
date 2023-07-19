package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBService {
    private Connection connection;
    private final static String CREATE_TABLE_USERS = "Create table if not exists users(\n" +
            "    ID serial primary key not null,\n" +
            "    NAME varchar NOT NULL,\n" +
            "    SEX varchar NOT NULL,\n" +
            "    AGE integer NOT NULL\n" +
            ");";
    private final static String ADD_NEW_USER = "INSERT into users\n" +
            "VALUES (?,?,?,?)";
    private final static String DELETE_USER = "delete from users where users.name = ?";
    private final static String GET_USERS_BY_NAME = "SELECT * from users where name = ?";
    private final static String DROP_TABLE_USERS = "DROP TABLE IF EXISTS users";
    private final static String GET_ALL_USERS = "SELECT * from users";


    public DBService() {
        DBConnector dbConnector = new DBConnector();
        Connection connection = dbConnector.connectToDB();
        this.connection = connection;
    }

    public void createTable() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute(CREATE_TABLE_USERS);
        System.out.println("Table with name USERS was created!");
    }

    public void deleteTableUsers() throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute(DROP_TABLE_USERS);
        System.out.println("Table with name USERS was deleted!");
    }

    public List<User> getUsersByName(String name) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(GET_USERS_BY_NAME);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            int userID = resultSet.getInt(1);
            String userName = resultSet.getString(2);
            String userSex = resultSet.getString(3);
            int userAge = resultSet.getInt(4);
            users.add(new User(userID, userName, userAge, userSex));

        }
        return users;
    }

    public List<User> getAllUsers() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_USERS);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            int userID = resultSet.getInt(1);
            String userName = resultSet.getString(2);
            String userSex = resultSet.getString(3);
            int userAge = resultSet.getInt(4);
            users.add(new User(userID, userName, userAge, userSex));
        }
        return users;
    }

    public void appendNewUserToDB(User user) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(ADD_NEW_USER);
        preparedStatement.setInt(1, user.getID());
        preparedStatement.setString(2, user.getUserName());
        preparedStatement.setString(3, user.getUserSex());
        preparedStatement.setInt(4, user.getUserAge());
        preparedStatement.executeUpdate();
        System.out.println("User " + user.getUserSex() + " was added!");
    }

    public void deleteUserFromDB(String name) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
        System.out.println("User " + name + " was deleted!");
    }

    public int test(String str, char t) {
        int i = str.indexOf(t);
        if (i <= str.length()) {
            String substring = str.substring(i + 1);
            return 1 + test(substring,t);
        }
        return 0;
    }
}
