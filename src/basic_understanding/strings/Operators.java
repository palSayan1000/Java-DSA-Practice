package basic_understanding.strings;

import java.util.ArrayList;

public class Operators {
    static void main() {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        // this is same a after a few steps: "a" + "1"
        // integer will be converted to Integer that will call toString()

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Kunal" + new Integer(56));

        // Error
        // System.out.println(new ArrayList<>() + new Integer(56));
        System.out.println(new ArrayList<>() + "" + new Integer(56)); // this will work
    }
}
