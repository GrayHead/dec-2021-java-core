package lesson4.hw.task1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(21, "kokos"));
        users.add(new User(11, "ananas"));
        users.add(new User(31, "banan"));
        users.add(new User(51, "tomat"));
        users.add(new User(41, "potatos"));
        users.add(new User(61, "mango"));

        users.sort((o1, o2) -> o1.getAge() - o2.getAge());
        users.sort((o1, o2) -> o1.getName().length() - o2.getName().length());
        users.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

    }
}
