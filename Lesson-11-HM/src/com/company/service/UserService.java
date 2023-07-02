package com.company.service;

import com.company.exception.UserMemoryException;
import com.company.exception.UserNullException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    private Scanner scanner = new Scanner(System.in);
    private List<String> userInputList = new ArrayList<>();

    public void userInput() {

        String userMessage = "";

        System.out.println("Enter your messages!");
        do {
            System.out.println("Amount of elements in array | " + userInputList.size() + " |");
            System.out.print(">> ");
            userMessage = scanner.nextLine();

            if (userInputList.size() < 5 ) {
                if(userMessage.equals("get") || userMessage.equals("getAll")){

                }else{
                    userInputList.add(userMessage);
                }
            } else {
                throw new UserMemoryException();
            }
            if (userMessage.equals("get")) {
                if (userInputList.size() == 0) {
                    throw new UserNullException();
                } else {
                    System.out.println(userInputList.get(0));
                    userInputList.remove(0);
                }
            }
            if (userMessage.equals("getAll")) {
                if (userInputList.size() != 0) {
                    System.out.println("============================");
                    for (int i = 0; i < userInputList.size(); i++) {
                        System.out.println("|" + i + "|" + userInputList.get(i));
                    }
                    System.out.println("============================");
                } else {
                    throw new UserNullException();
                }
            }
        }
        while (!userMessage.equals("exit"));
    }
}
