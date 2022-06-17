package lesson4.demo2_set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Set
        // Unique & Sorted set
        TreeSet<User> users = new TreeSet<>();
        users.add(new User(2, "kokos"));
        users.add(new User(2, "kokos"));
        users.add(new User(2, "kokos"));
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        System.out.println(users);
//        users.ceiling(new User());


    }
}
