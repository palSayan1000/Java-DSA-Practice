package object_oriented_programming.oop_7.collections;

import java.util.*;

public class Main {
    static void main() {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> vector = new Vector<>();
        // all the above here List is the interface and each class i implementing there own methods
        Set<Integer> list3 = new HashSet<>();
        Set<Integer> list4 = new LinkedHashSet<>();
        Set<Integer> list5 = new TreeSet<>();
        // same here Set is the interface and they are implementing there own methods
    }
}
