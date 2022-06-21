package lesson4.hw.task3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        HashSet<Driver> drivers = new HashSet<>();
        Iterator<Driver> iterator = drivers.iterator();
        while (iterator.hasNext()) {
            Driver next = iterator.next();
            if (next.getGenred().equals(Genred.MALE)) {
                iterator.remove();
            }
        }

        System.out.println(drivers);

        TreeSet<Driver> treeSet = new TreeSet<>(drivers);



    }
}
