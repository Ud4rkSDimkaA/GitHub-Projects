package com.company;

import com.company.exception.UserMemoryException;
import com.company.exception.UserNullException;
import com.company.service.UserService;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        try {
            userService.userInput();
        }catch (UserMemoryException exception){
            System.out.println("Program shut down due the Memory exception");
        }catch (UserNullException exception){
            System.out.println("Program shut down due the null exception");
        }  finally {
            System.out.println("I'm cool programmer!");
        }
    }
}
