package lesson2.demo6_static;

public class User {
    static int counter = 0;
    private String name;

    public User(String name) {
        this.name = name;
        counter = counter + 1;
    }
}
