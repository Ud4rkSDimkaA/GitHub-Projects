package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class DBService {
    private List<Person> people = new ArrayList<>();
    private Lock lock = new ReentrantLock();

    public DBService(List<Person> people, Lock lock) {
        this.people = people;
        this.lock = lock;
    }

    public void findPersonByName(Person person) {
        synchronized (person) {
            System.out.println("Finding people...");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException exception) {
                exception.getMessage();
            }
            System.out.println("Ending finding people!");
            people.stream()
                    .filter(people -> people.getName().equals(people.getName()))
                    .forEach(System.out::println);
        }
    }

    public void addNewPersonToDB(Person person) {
        System.out.println("Adding people...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.getMessage();
        }
        System.out.println("Ending adding people!");

        synchronized (person) {
            if (person.getName() != null && !person.getName().isBlank()) {
                System.out.println("Person " + person.getName() + " was added to DB");
                people.add(new Person(person.getName(), 10));
            } else {
                System.out.println("Person " + person.getName() + " wasn't added to DB");
                return;
            }
        }
    }
}
