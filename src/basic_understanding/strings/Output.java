package basic_understanding.strings;

import java.util.Arrays;

public class Output {
    static void main() {
        IO.println(56); // it calles the toString method
        Integer a = new Integer(56);
        System.out.println(a);
        System.out.println(a.toString());
        IO.println("Kunal");
        System.out.println(new int[]{1, 2, 3, 4, 5, 6}); // garbage value // print an object
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4, 5, 6})); // this is called function overriding
        String name = null;
        IO.println(name);
    }
}
