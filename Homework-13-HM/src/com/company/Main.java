package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> array = new ArrayList<>();
        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        array.contains(new String("123"));
    }
}
