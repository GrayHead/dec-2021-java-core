package lesson2.demo6_static;

public class Main {
    public static void main(String[] args) {
//        System.out.println(User.counter);
//        User user1 = new User();
//        user1.counter = 100;
//        System.out.println(user1.counter);//100
//
//        User user2 = new User();
//        System.out.println(user2.counter); // 100

        System.out.println(User.counter);
        User asd = new User("asd");
        System.out.println(User.counter);
        User qwe = new User("qwe");
        System.out.println(User.counter);


    }
}
