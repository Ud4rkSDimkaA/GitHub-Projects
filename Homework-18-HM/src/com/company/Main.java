package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = switch (scanner.nextInt()){
            case 1-> 1;
            case 2-> 2;
            case 3-> 3;
            default -> throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
        };

    }

}
