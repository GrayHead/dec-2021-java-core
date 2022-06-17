package lesson4.demo2_set.linkedHashSet;

import lesson4.demo2_set.treeset.User;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<User> users = new LinkedHashSet<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(1, "ananas"));
        users.add(new User(1, "ananas"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(5, "tomat"));
        users.add(new User(5, "tomat"));
        users.add(new User(5, "tomat"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        System.out.println(users);


//        for (User user : users) {
//            users.remove(user);
//        }

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getId() == 2) {
                iterator.remove();
            }
        }
        System.out.println(users);


    }
}
