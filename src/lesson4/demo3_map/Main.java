package lesson4.demo3_map;

import java.util.*;
import java.util.Map.*;

public class Main {
    public static void main(String[] args) {

//        HashMap<Integer, String> map = new HashMap();
//        LinkedHashMap<Integer, String> map = new LinkedHashMap();
        TreeMap<Integer, String> map = new TreeMap();
        map.put(2, "two");
        map.put(1, "one");
        map.put(3, "three");

//        System.out.println(map.get(1)); // one
//        System.out.println(map.containsKey(1)); // true
//        System.out.println(map.keySet()); // Set of keys
//        System.out.println(map.values()); // all values
//        map.replace(1, "uno");


        Set<Entry<Integer, String>> entries = map.entrySet();

        Iterator<Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> next = iterator.next();
            System.out.println(next);
            if (next.getValue().equals("two")) {
                iterator.remove();
            }
        }


    }
}
