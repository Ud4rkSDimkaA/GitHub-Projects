package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class StreamsService {
    public void printListCorrectly(List<?> arrayList){
        arrayList.stream()
                .forEach(el->{
                    System.out.print("[" + el + "] ");
                });
    }

    public void taskNumberTwo(List<Integer> arrayList){
        arrayList.stream()
                .filter(el-> el%2==0)
                .filter(el-> el<=7 && el>=17)
                .map(el-> "[" + el+"] ")
                .forEach(System.out::print);
    }

    public void taskNumberOne(List<Integer> arrayList){
        arrayList.stream()
                .filter(el-> el<20)
                .distinct()
                .sorted()
                .map(el-> "["+el+"] " )
                .forEach(System.out::print);

    }

    public void taskNumberThree(ArrayList<Integer> arrayList){
        arrayList.stream()
                .map(el->el*3)
                .map(el-> "["+el+"] " )
                .forEach(System.out::print);
    }

    public void taskNumberFour(ArrayList<Integer> arrayList){
        arrayList.stream()
                .limit(4)
                .sorted()
                .map(el-> "["+el+"] " )
                .forEach(System.out::print);
    }

    public void taskNumberFive(ArrayList<Integer> arrayList){
        long count = arrayList.stream()
                .count();
        System.out.println(count);
    }

    public void taskNumberSix(ArrayList<Integer> arrayList){
        OptionalDouble average = arrayList.stream()
                .mapToInt(el -> el)
                .average();

        System.out.println(average);
    }


}
