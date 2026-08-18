package basic_understanding.functions_methods;

public class Overloading {
    public static void main(String[] args) {
        func(67);
        func("Sayan Pal");
        // how the program is deciding which  function too run
        // this actually  happens when it is compiles like hoo  this actually takes an integer
        // which function that calls func that takes an integer
        // this happens at compile time
        // for function overloading either the no.of arguments should be different or the type of arguments should be
        // different or the return type should be different
    }
    // imagine two functions of the same name
    static void func(int a) {
        System.out.println(a);
    }
    static void func(String name) {
        System.out.println(name);
    }
}
