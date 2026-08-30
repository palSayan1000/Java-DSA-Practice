package basic_understanding.recursion;

public class NumbersExample {
    static void main() {
        // prints numbers
        // write a function that takes a number and prints it

        print(1); // we cannot add new print statements and will call the function once and cannot use for loop
    }
    static void print(int i) {
        System.out.println(i);
        print1(i + 1);
    }
    static void print1(int i) {
        System.out.println(i);
        print2(i + 1);
    }
    static void print2(int i) {
        System.out.println(i);
        print3(i + 1);
    }
    static void print3(int i) {
        System.out.println(i);
        print4(i + 1);
    }
    static void print4(int i) {
        System.out.println(i);
    }
}
