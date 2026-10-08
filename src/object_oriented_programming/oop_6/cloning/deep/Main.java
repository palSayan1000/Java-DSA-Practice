package object_oriented_programming.oop_6.cloning.deep;

import java.util.Arrays;

public class Main {
    static void main() throws CloneNotSupportedException { // why throws as the clone throws this exception either do it mention it here or surround that part in try catch
        Human kunal = new Human(34, "Kunal Kushwaha");

        Human twin = kunal.clone();
        System.out.println(twin.age + "  " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(kunal.arr)); // kunal arr get changed
        // therefore shallow copy
    }
}