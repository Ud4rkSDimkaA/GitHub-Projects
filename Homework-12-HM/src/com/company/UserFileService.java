package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class UserFileService {
    private static String filePath = "C:/Users/Asus/Desktop/GitHub-Projects/Homework-12-HM/text.txt";

    public void writeUserInformationInFile(User user) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(user);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void readUserInformationFromFile() {
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))){
            Object objectFromFile = inputStream.readObject();
            if(objectFromFile instanceof User){
                User userFromFile = (User) objectFromFile;
                if(userFromFile!=null){
                    System.out.println("User |" + userFromFile.getFirstName() + " " + userFromFile.getLastName() + " | is ready!");
                }else{
                    System.out.println("User from file is null!");
                }
            }

        }catch (IOException | ClassNotFoundException exception){
            System.out.println(exception.getMessage());
        }
    }
}
