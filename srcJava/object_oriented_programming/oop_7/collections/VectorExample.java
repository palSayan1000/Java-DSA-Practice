package object_oriented_programming.oop_7.collections;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    static void main() {
        Vector<Integer> list = new Vector<>();
        List<Integer> lst = new Vector<>();

        list.add(24);
        list.add(45);
        list.add(99);
        list.add(5647389);

        System.out.println(list);

        System.out.println(list.contains(100));

        // Vector is same as arraylist but the only different is that it is synchronized and the arraylist isn't synchronized
        // Vector object -> only one thread can work on it at a time if any other thread tries to access it that thread will be waiting
        // where as in arraylist multiple thread work on it simultaneously
    }
}
