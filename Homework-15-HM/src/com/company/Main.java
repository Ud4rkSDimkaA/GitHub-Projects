package com.company;

public class Main {

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = userInput -> {
            StringBuilder stringBuilder = new StringBuilder(userInput).reverse();
            System.out.println(stringBuilder.toString());
        };
        MyFunctionalInterface myFunctionalInterface1 = userInput -> {
            int intUserInput = Integer.parseInt(userInput);
            int result = 1;
            for (int i = 1; i < intUserInput+1; i++){
                result*=i;
            }
            System.out.println(result);
        };

        UserService userService = new UserService();
        userService.doUserTask(1, "hello", myFunctionalInterface);
        userService.doUserTask(2, "5",myFunctionalInterface1);

        String text = "Hello world!";

        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.append('1');
        System.out.println(stringBuilder);
    }
}
