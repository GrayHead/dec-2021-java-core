package lesson3.demo1_interfaces;

import java.util.ArrayList;

public class ReversePrinter implements ArrayPrinter, ArraySorter {
    @Override
    public void print(ArrayList<String> strings) {
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));

        }

    }

    @Override
    public void sort(ArrayList<String> strings) {
        System.out.println("sort desc");
    }
}
