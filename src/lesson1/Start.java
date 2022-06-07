package lesson1;

import java.util.ArrayList;

public class Start {
    // psvm
    public static void main(String[] args) {


//        String[] strings = new String[3];
//        strings[0] = "html";
//        strings[1] = "js";
//        strings[2] = "java";
//        User user1 = new User(1, "vasya",strings);


//        ArrayList<String> skills = user.getSkills();
//        skills.add("html");
//        skills.add("js");
//        skills.add("java");
//
//        User user1 = new User(1, "vasya", skills);
//        user1.addOneSkill("mysql");
//
////        System.out.println(user1.getId());
////        System.out.println(user1.getName());
//
////        String greeting = user1.greeting("hi");
////        System.out.println(greeting);
//        System.out.println(user1);
//
////        for (int i = 0; i < skills.size(); i++) {
////            System.out.println(skills.get(i));
////        }
//
//        for (String skill : skills) {
//            System.out.println(skill);
//        }


        /*demo*/

        User user = new User();
        user.setId(2);
        user.setName("kokos");
        user.addOneSkill("html");
        user.addOneSkill("js");
        user.addOneSkill("java");

        ArrayList<String> skills = user.getSkills();
        for (int i = 0; i < skills.size(); i++) {
            System.out.println(skills.get(i));

        }

//        if (true) {
//        } else if (false) {
//        }


    }
}
