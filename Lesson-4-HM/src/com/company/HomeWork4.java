package com.company;

import java.util.Arrays;

public class HomeWork4 {
    public void findElementInArray(Integer element, Integer[] array) {
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                isFound = true;
                System.out.println(i);
            }
        }
        if (!isFound) {
            System.out.println("There is no such an element in this array");
        }

    }

    public Integer[] deleteElementFromArray(Integer element, Integer[] array) {
        Integer[] buff = new Integer[array.length];
        element = array[0];
        boolean isExist = true;

        for (int i = 0; i < buff.length; i++) {
            if (array[i] != element) {
                buff[i] = array[i];
            }
        }

        int counter = buff.length;
        for (int i = 0; i< buff.length;i++){
            if(buff[i] == null){
                counter--;
            }
        }
        Integer [] lastBuff = new Integer[counter];
        for (int i = 0; i< lastBuff.length;i++){
            if(buff[i]!=null){
                lastBuff[i] = buff[i];
            }
        }

        return lastBuff;
    }

    public Integer[] findMinAndMaxElements(Integer[] array) {
        int maxElement = array[0];
        int minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) minElement = array[i];
            if (array[i] > maxElement) maxElement = array[i];
        }
        Integer[] buffer = new Integer[2];
        buffer[0] = minElement;
        buffer[1] = maxElement;
        return buffer;
    }


}
