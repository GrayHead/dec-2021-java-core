package lesson2.homework.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Skill> skills = new ArrayList<>();
//        skills.add(new Skill("java", 100500));
//        skills.add(new Skill("java2", 100500));
//        skills.add(new Skill("java8", 100500));
//        skills.add(new Skill("java9", 100500));

        Car car = new Car("asdads", 12312, 34634);
        User user =
                new User(
                        1,
                        "vasya",
                        "asd",
                        "asd@asd.com",
                        12,
                        Gender.MALE,
                        car
                );
        System.out.println(user.getSkills()); // []
        user.getSkills().get(0); // [].get(0) ->null

        user.addSkill(new Skill("asdasd",123));
        user.addSkill(new Skill("asdasd",123));
        user.addSkill(new Skill("asdasd",123));
        user.addSkill(new Skill("asdasd",123));
        user.addSkill(new Skill("asdasd",123));

    }
}
