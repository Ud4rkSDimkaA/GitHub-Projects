package com.company;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserService {
    public void doUserTask(Integer number, String input, MyFunctionalInterface functionalInterface){
        if(number == 1){
            functionalInterface.doSomething(input);
        }else if(number==2){
            functionalInterface.doSomething(input);
        }
    }
}
