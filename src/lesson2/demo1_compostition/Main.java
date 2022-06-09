package lesson2.demo1_compostition;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("ashdgads", "0973184t");

        User user = new User(1, "vasua", passport);

//        Customer customer = new Customer("adsasd", "qweqweq", passport);
        Customer customer = new Customer(
                "adsasd",
                "qweqweq",
                "yqwreytewq",
                "3456983764ad"
        );


    }
}
