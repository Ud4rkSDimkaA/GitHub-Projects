package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> listOfNumber = new ArrayList<>(List.of(1, 2, 16, 17, 9, 10, 10, 24, 75, 21, 55, 26, 95, 27, 33, 5, 13));
        List<Family> families = Arrays.asList(
                new Family("Zinovenko", 50, "Suharevskay 1", Arrays.asList(
                        new Member("Ivan", 22, false, Member.SEX.MAN),
                        new Member("Evgeniy", 17, false, Member.SEX.MAN),
                        new Member("Sergey", 49, true, Member.SEX.MAN),
                        new Member("Oksana", 42, true, Member.SEX.WOMAN)
                )),
                new Family("Prudnik", 32, "Lobanka 97", Arrays.asList(
                        new Member("Dzmitry", 21, false, Member.SEX.MAN),
                        new Member("Julia", 26, false, Member.SEX.WOMAN),
                        new Member("Aleksandr", 53, true, Member.SEX.MAN),
                        new Member("Larisa", 42, true, Member.SEX.WOMAN)
                )),
                new Family("Halilov", 3, "Suharevskay 3", Arrays.asList(
                        new Member("Nadir", 21, false, Member.SEX.MAN),
                        new Member("Sultus", 56, true, Member.SEX.MAN),
                        new Member("Tatiana", 50, true, Member.SEX.WOMAN)
                )));

        Map<String, Integer> collect = families.stream()
                .collect(Collectors.toMap(Family::getFamilyLastName, Family::getFamilyAverageAge));

        Set<Map.Entry<String, Integer>> entries = collect.entrySet();
        for (Map.Entry<String, Integer> el : entries) {
            System.out.println(el);
        }

        System.out.println("\nOnly boys \n");

        families.stream()
                .flatMap(el -> el.getMembers().stream())
                .filter(el -> el.getSex().equals(Member.SEX.MAN))
                .sorted(new Comparator<Member>() {
                    @Override
                    public int compare(Member o1, Member o2) {
                        return o1.getAge() - o2.getAge();
                    }
                })
                .map(el -> "[" + el.getFirstName() + " " + el.getAge() + "] " + el.getSex().toString())
                .forEach(System.out::println);

        System.out.println("\nOnly girls \n");

        families.stream()
                .flatMap(el -> el.getMembers().stream())
                .filter(el -> el.getSex().equals(Member.SEX.WOMAN))
                .map(el -> "[" + el.getFirstName() + " " + el.getSex() + "] ")
                .sorted()
                .forEach(System.out::println);

        System.out.println("\n\n");


        families.stream()
                .map(el -> el.getMembers())
                .mapToInt(el->el.size())
                .count();


        boolean isExistGirlWithName = families.stream()
                .flatMap(el -> el.getMembers().stream())
                .filter(el -> el.getSex().equals(Member.SEX.WOMAN))
                .anyMatch(el -> el.getFirstName().startsWith("Julia"));

        System.out.println(isExistGirlWithName);
    }

}
