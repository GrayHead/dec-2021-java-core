package lesson4.demo1_list.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>(1000);

        users.add(new User(2, "kokos")); // 0
        users.add(new User(1, "ananas")); // 1
        users.add(new User(3, "banan")); // 2
        users.add(new User(5, "tomat")); // 3
        users.add(new User(4, "potatos")); // 4
        users.add(new User(6, "mango")); // 5

//        users.remove(new User(2, "kokos"));
        System.out.println(users);
//        users.sort((o1, o2) -> o1.getId() - o2.getId());
//        users.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//        users.removeIf(user -> user.getId() > 0);

//        users.addAll(otherCollection);
//        users.removeAll(otherCollection);
//        users.forEach(System.out::println);
//        System.out.println(users);
//        users.contains(new User());

//        users.replaceAll(user -> {
//            if (user.getName().equals("")) {
//                return new User(0, "uyqwywqtreyt");
//            }
//            return user;
//        });

//        users.set(0, new User());
//        users.add(0, new User());

//        User[] users1 = new User[10];
//        Object[] objects = users.toArray(users1);


        for (User user : users) {
            if (user.getId() == 2) {
                users.remove(user);
            }
        }

    }
}
