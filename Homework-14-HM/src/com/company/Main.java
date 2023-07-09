package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Dzmitry","MAN",21);

        User user2 = new User("Alex","MAN",40);

        User user3 = new User("John","MAN",31);

        User user4 = new User("Aleksandra","WOMAN",41);

        User user5 = new User("Natalia","WOMAN",5);

/*

        LinkedList<User> users = new LinkedList<>(List.of(user1,user2,user3,user4,user5));
        UserService  userService = new UserService();
        Set<User> sortedUsersByAge = userService.getSortedUsersByAge(users);
        System.out.println(sortedUsersByAge);

        boolean dzmitry = userService.findUserByName("Dzmitry", users);
        System.out.println(dzmitry);
*/

        Map<String,User> stringUserMap = new HashMap<>();
        stringUserMap.put("first",user1);
        stringUserMap.put("second",user2);
        stringUserMap.put("first",user3);
        User user = stringUserMap.get("first");
        User first = stringUserMap.getOrDefault("first", user5);

        Set<Map.Entry<String, User>> entries = stringUserMap.entrySet();
        for (Map.Entry<String, User> user_ : entries){
            String key = user_.getKey();
            User value = user_.getValue();
        }

        System.out.println(stringUserMap);


    }
}