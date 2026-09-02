package object_oriented_programming.oop_3.polymorphism;

public class Shapes {
    void area() {
        System.out.println("I am in shapes");
    }
    // you cannot make the parent class method as final
    // then it gives error
    // Reason -> methods declared as final could not be overridden

    // early binding check notes -> used for preventing inheritance and overriding
    final void area2() {
        // Also function overriding is known as late binding as it is done at last run time
        // but since the final function could not be overridden it is resolved
        // at compile time only hence it is known as early binding
    }
}
