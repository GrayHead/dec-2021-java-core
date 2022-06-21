package lesson4.hw.task3;

import lesson2.homework.task4.Car;
import lesson2.homework.task4.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver implements Comparable<Driver> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Genred genred;
    private List<Skill> skills = new ArrayList<>();
    private Car car;

    @Override
    public int compareTo(Driver o) {
        return this.skills.size() - o.skills.size();
    }
}
