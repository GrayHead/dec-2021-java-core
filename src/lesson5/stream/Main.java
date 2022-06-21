package lesson5.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User(2, "kokos", true));
        users.add(new User(2, "kokos", true));
        users.add(new User(1, "ananas", true));
        users.add(new User(3, "banan", false));
        users.add(new User(5, "tomat", false));
        users.add(new User(5, "tomat", false));
        users.add(new User(4, "potatos", true));
        users.add(new User(6, "mango", false));


//        List<User> collect = users.stream()
//                .distinct()
//                .filter(User::isStatus)
//                .collect(Collectors.toList());
//
////                .forEach(System.out::println);
//
//        System.out.println(collect);


//        List<SimpleUser> collect = users.stream()
//                .map(user -> new SimpleUser(user.getId(), user.getName()))
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(collect);

//        Stream.of(users.get(0),users.get(1));

//        boolean b = users.stream() // false
//                .allMatch(user -> user.getId() > 0);
//
//        users.stream().anyMatch(user -> user.isStatus()); // true
//
//        if(users.stream().anyMatch(User::isStatus)){
//
//
//        }


//        Optional<User> first = users.stream().findFirst();
//        User x = first.orElse(new User());
//        System.out.println(x);


//        users.stream()
//                .limit(3)
//                .distinct();


//        Stream<String> stringStream = users.stream().flatMap(user -> user.getSkills().stream());
//        stringStream.forEach(System.out::println);

//        User user = users.stream().max((o1, o2) -> o1.getId() - o2.getId()).orElse(new User()); // id 6

//        List<User> collect = users.stream()
//                .filter(user -> user.getId() > 2)
//                .sorted((o1, o2) -> o1.getId() - o2.getId())
//                .collect(Collectors.toList());


//        List<String> letters = Arrays.asList("h", "e", "l", "l", "o");
//        String reduce = letters.stream()
//                .reduce("", (accumulator, element) -> accumulator + element);
//        System.out.println(reduce);


//        User reduce = users.stream().reduce(new User(), (identity, user) -> {
//            identity.getSkills().addAll(user.getSkills());
//            return identity;
//        });
//        System.out.println(reduce);

//        users.stream().skip(9000)


    }
}
