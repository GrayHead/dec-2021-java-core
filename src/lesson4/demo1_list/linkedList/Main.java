package lesson4.demo1_list.linkedList;

import lesson4.demo1_list.arrayList.User;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // List
        LinkedList<User> users = new LinkedList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));

        System.out.println(users.element());

    }
}
