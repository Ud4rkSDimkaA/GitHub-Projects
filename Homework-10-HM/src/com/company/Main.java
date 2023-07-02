package com.company;

import com.company.model.Director;
import com.company.model.Worker;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Director director = new Director("DIRECTOR-1","DIRECTOR-1",5,new ArrayList<>());
        Worker worker1 = new Worker("WORKER-1","WORKER-1",3);
        Worker worker2 = new Worker("WORKER-2","WORKER-2",7);
        Worker worker3 = new Worker("WORKER-3","WORKER-3",5);

        director.addNewEmployee(worker1);
        director.addNewEmployee(worker2);
        Director director1 = new Director("DIRECTOR-2","DIRECTOR-2",5,new ArrayList<>());
        director1.addNewEmployee(worker3);
        director.addNewEmployee(director1);

        director.displayEmployees();

        director.findEmployee("WORKER-1","WORKER-2");
    }
}
