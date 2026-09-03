package object_oriented_programming.oop_5.interfaces.extend_demo2;

import java.sql.SQLOutput;

public interface A {
    // Backward Compatibility: If you add a default method to an interface,
    // the classes implementing it do not break. They simply inherit the default behavior automatically.
    default void fun() {
        System.out.println("I am in A class"); // after JDK -> 8 -> default implementation of interfaces
        // Optional Overriding: The implementing class can use the default behavior as-is, or it can override it to do something specific.
    } // it is like an additional feature

    // static interface method should always have a body
    // call via the interface name
    static void greeting() {
        System.out.println("Hey i am a static method in interface A");
    }
}
