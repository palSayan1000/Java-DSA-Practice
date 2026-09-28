package dsa.data_structures.hashmap.understanding;

import java.util.*;

public class Main {
    static void main() {
//        String name = "Rahul";
//
//        Integer a = 23456;
//
//        int hashcode = a.hashCode();
//
//        System.out.println(hashcode);

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Kunal", 89);
        map.put("Karan", 99);
        map.put("Sayan", 96);
        map.put("Rahul", 94);

        System.out.println(map);

//        System.out.println(map.get("Karan"));
//        System.out.println(map.getOrDefault("Kapoor", 33));
//        System.out.println(map.containsKey("Sayan"));

        HashSet<String> set0 = new HashSet<>(map.keySet());
//        System.out.println(set0.size());
//        System.out.println(set0.contains("Kunal"));

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);
        set.add(56);
        set.add(2);

        System.out.println(set);

        // same
        // TreeMap<String, Integer> map = new TreeMap<>();
        // TreeSet<Integer> set = new TreeSet<>();
        // here the data will be stored in sorted order

        // Difference between HashMap and HashTable ->
        // HashMap is not thread safe and HashTable is thread safe
    }
}
