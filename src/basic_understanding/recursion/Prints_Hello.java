package basic_understanding.recursion;

public class Prints_Hello {
    static void main() {
        // write a function that prints hello world 5 times
        messege();
    }
    static void messege(){
        IO.println("Hello World");
        // i cannot modify this function
        // i cannot create new similar function
        // i cannot call the messege 5 times
        // i cannot call another function from this function
        messege1();
    }

    private static void messege1() {
        System.out.println("Hello World");
        messege2();
    }

    private static void messege2() {
        System.out.println("Hello World");
        messege3();
    }

    private static void messege3() {
        System.out.println("Hello World");
    }
}
