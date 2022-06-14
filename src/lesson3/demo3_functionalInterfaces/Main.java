package lesson3.demo3_functionalInterfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;

        asdqew(10, 20, (a, b) -> a / b);


//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(123);
//        integers.add(-123);
//        integers.add(6545);
//        integers.add(-6545);
//
//        integers.sort((o1, o2) -> o1 - o2);


    }

    public static void asdqew(int a, int b, Calculator calculator) {
        calculator.calcualate(a, b);

    }


}
