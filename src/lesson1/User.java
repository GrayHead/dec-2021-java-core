package lesson1;

import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = {"id"})
public class User {
    private int id;
    private String name;
    private ArrayList<String> skills = new ArrayList<>(); // empty collection/array

//    public User(int id, String name, ArrayList<String> skills) {
//        this.id = id;
//        this.name = name;
//        this.skills = skills;
//    }


//    public String skills[] = new String[3];

//    public User(int id, String name, String[] skills) {
//        this.id = id;
//        this.name = name;
//        this.skills = skills;
//    }

    //    public User() {
//    }
//
//    public User(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }

    public String greeting(String msg /*,String name*/) {
        return msg + " my name is " + this.name;
    }

    public void addOneSkill(String skill) {
        this.skills.add(skill);
    }
}
