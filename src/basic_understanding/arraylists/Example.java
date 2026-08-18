package basic_understanding.arraylists;

import java.util.ArrayList;

public class Example {
    static void main() {
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(1);
        list.add(3);
        list.add(654);
        list.add(123);
        list.add(196);
        list.add(69);
        list.add(67);

        System.out.println(list.contains(196));
        System.out.println(list);
        list.set(0, 99);
        list.remove(3);
        System.out.println(list);
        for(int num: list)
            System.out.print(num + "\t");
        System.out.println();
    }
}
