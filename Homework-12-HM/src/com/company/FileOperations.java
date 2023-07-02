package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class FileOperations {
    private static String filePath = "C:/Users/Asus/Desktop/GitHub-Projects/Homework-12-HM/text1.txt";;

    public void writeInformationInFile(String text) throws IOException {
        Path fileToWrite = Files.createTempFile("fileToWrite", ".txt");

        try(OutputStreamWriter writer = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(String.valueOf(fileToWrite))))){
            System.out.println("File path: "+ fileToWrite);
            UserPrincipal owner = Files.getOwner(fileToWrite);
            System.out.println("Owner of the file: "+ owner);
            boolean hidden = Files.isHidden(fileToWrite);
            boolean regularFile = Files.isRegularFile(fileToWrite);
            boolean readable = Files.isReadable(fileToWrite);
            FileTime lastModifiedTime = Files.getLastModifiedTime(fileToWrite);
            System.out.println("Last time file was modified: "+ lastModifiedTime);
            System.out.println("File is hidden: " + hidden);
            System.out.println("File is regular: " + regularFile);
            System.out.println("File is readable: " + readable);
            writer.write(text);
            String s = Files.readString(fileToWrite);

            System.out.println("Text from file: " + s);


        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }

    public void readInformationFromFile(){

    }

}
