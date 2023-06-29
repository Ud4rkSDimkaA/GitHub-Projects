package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer [] array = new Integer[5];
        for (int i = 0; i <5; i++){
            array[i] =  (int) (Math.random()*15);
        }

        HomeWork4 homeWork4 = new HomeWork4();
        System.out.println(Arrays.toString(array));
        homeWork4.findElementInArray(4,array);
        Integer[] minAndMaxElements = homeWork4.findMinAndMaxElements(array);
        System.out.println(Arrays.toString(minAndMaxElements));
        System.out.println("==================");
        Integer[] integers = homeWork4.deleteElementFromArray(1, array);
        System.out.println(Arrays.toString(integers));
    }
}
