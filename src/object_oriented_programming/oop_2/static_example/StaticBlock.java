package object_oriented_programming.oop_2.static_example;

// this is a demo to show initialization of static variables

// Static block -> used for initialization of static variables
// static block runs once when class is initialized (first active use), not only on first object creation.
// active use includes: accessing static fields/methods OR creating an object.
// in this code, StaticBlock.a / StaticBlock.b are used before new StaticBlock(), so static block runs earlier.
// therefore, no object is required to trigger static initialization.
// note: JVM entry point should be -> public static void main(String[] args)
public class StaticBlock {
    static int a = 4;
    static int b;
    static int c;
    /// A static block runs when the class is initialized, not when the first object is created.

    // below is kunal defination which is wrong the above one is correct
    // will only run once, when the first object is created i.e when the class is loaded for the first time
    static { // this block gets loaded exactly one when the class is loaded
        System.out.println("I am in static block!!!!");
        b = a * 5;
        c = b - 12;
    }

    static void main() {
//        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + "  "  + StaticBlock.b + "  " + StaticBlock.c);

        StaticBlock .b += 3;
        StaticBlock obj = new StaticBlock();
        // see the statement does not gets printed
        System.out.println(StaticBlock.a + "  "  + StaticBlock.b + "  " + StaticBlock.c);

    }
}
