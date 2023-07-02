package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws IOException {
/*
        try(LineNumberReader reader = (LineNumberReader) new BufferedReader(new FileReader(""));
            Writer writer = new BufferedWriter(new FileWriter(""))){
            reader.readLine();

        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
*//*
        Path directories = Files.createDirectories();*//*
    }*/

        /*UserFileService userFileService = new UserFileService();
        userFileService.writeUserInformationInFile(new User("Dima","Prudnik",21));
        userFileService.readUserInformationFromFile();*/
/*
        Path path = Files.createTempDirectory("tempDirectory");
        System.out.println("path :" + path);
        Path file = Files.createTempFile("file", ".txt");
        System.out.println("file path:" +file);*/

        FileOperations operations = new FileOperations();
        operations.writeInformationInFile("Hello Dima Prudnik");
    }
}
