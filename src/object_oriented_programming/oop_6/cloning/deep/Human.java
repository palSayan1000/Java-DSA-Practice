package object_oriented_programming.oop_6.cloning.deep;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Human implements Cloneable{
    // implements Cloneable -> just tells the jvm that there is method clone in this class and is allowed to clone
    // the Cloneable interface is empty inside
    int age;
    String name;
    int[] arr;

    public Human() {
        this.age = 0;
        this.name = "";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        arr = new int[] {3, 4, 5, 6, 0, 1, 9};
    }

    public Human(object_oriented_programming.oop_6.cloning.shallow.Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = new int[5];
    }

    @Override
    public Human clone() throws CloneNotSupportedException{ // the clone method throws and exception
        // this is deep copy
        Human twin = (Human) super.clone(); // this is actually a shallow copy

        // make a deep copy
        twin.arr = Arrays.copyOf(twin.arr, twin.arr.length);
        // System.arraycopy() -> method
        twin.name = new String("Kunal Kushwaha");
        return twin;
    }
}
