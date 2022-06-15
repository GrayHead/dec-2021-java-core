package lesson3.homework.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Book("sw", 700, 10050));
        printables.add(new Magazine("VOGUE", Genre.ENTERTAIMENT));
        for (Printable printable : printables) {
            printable.print();
        }
    }
}
