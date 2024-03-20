package FunctionalProgramming.FunctionalInterface;

import FunctionalProgramming.FunctionalInterface.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class useComparator {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(3, "Alice"));
        users.add(new User(1, "Charlie"));
        users.add(new User(5, "Bob"));

        System.out.println("users = " + users);

        // id를 이용한 sort
        Comparator<User> idComparator = (User u1, User u2) -> u1.getId() - u2.getId();
        Collections.sort(users, idComparator);
        System.out.println("users = " + users);

        // name을 이용한 sort
        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));
        System.out.println("users = " + users);
    }
}
