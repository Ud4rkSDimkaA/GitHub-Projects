package com.company;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Person person = new Person("Dima Prudnik",21);
        DBService dbService = new DBService(new ArrayList<Person>(),new ReentrantLock());
        dbService.addNewPersonToDB(person);

        Thread thread = new Thread(()-> dbService.findPersonByName(person));
        thread.start();
        System.out.println("----1----");
        Thread thread1 = new Thread(()-> dbService.findPersonByName(person));
        thread1.start();
        System.out.println("----2----");
        Thread thread2 = new Thread(()-> dbService.findPersonByName(person));
        thread2.start();
        System.out.println("----3----");

        System.out.println("Thread is dead!");
        System.out.println("Stop all threads");

        Main main = new Main();
        for (int i = 0;i< Thread.activeCount();i++){
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().toString());
        }

    }
}

