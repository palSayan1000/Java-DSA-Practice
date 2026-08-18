package basic_understanding.functions_methods;

public class Showding {
    static int x = 90; // why static you cannot use object depended things in  object depended things
    // this has it's own scope (above)
    static void main() {
        System.out.println(x); // 90
        int x; // the class variable at line 4 is shadowed by this
        // System.out.println(x); error x not initialized
        x = 40; // the scope will actually begin when value is initialized
        System.out.println(x); // 40 // the variable with the higher level scope is hidden
        func();
    }

    static void func() {
        System.out.println(x);
    }
}
