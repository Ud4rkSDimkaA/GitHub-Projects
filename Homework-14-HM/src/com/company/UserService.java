package com.company;

import java.util.*;

public class UserService {

    public boolean findUserByName(String userName, LinkedList<User> userList) {
        boolean isFound = false;
        for (User user : userList) {
            if (user.getFirstName().equals(userName)) isFound = true;
        }
        return isFound;
    }

    public boolean findUserByUsername(String userName, Set<User> users){
        boolean isFound = false;
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getFirstName().equals(userName)) isFound = true;
        }
        return isFound;
    }

    public List<User> getUsersWithSexMan(String sex, List<User> userList) {
        List<User> users = new ArrayList<>();
        for (User user : userList) {
            if (user.getSex().equals(sex)) {
                users.add(user);
            }
        }
        return users;
    }

    public Set<User> getSortedUsersByAge(List<User> userList) {
        Set<User> userSet = new TreeSet<>(new UserComparator());
        for (User user: userList){
            userSet.add(user);
        }
        return userSet;
    }

}
