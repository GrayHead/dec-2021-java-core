package lesson2.demo3_extends;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        SuperUser superUser = new SuperUser(1, "asgda", "login", "pass");
//
//        System.out.println(superUser);
//        superUser.greeting();


//        User user = new SuperUser();

//        User superUserBase = new User();
//        SuperUser superUser = (SuperUser) superUserBase;


        ArrayList<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new SuperUser(1, "asd", "qwe", "zxc"));
        SuperUser user = (SuperUser) users.get(1);


    }
}
