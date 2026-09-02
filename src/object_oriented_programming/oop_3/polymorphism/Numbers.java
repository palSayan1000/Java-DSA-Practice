package object_oriented_programming.oop_3.polymorphism;

public class Numbers {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    void sum(int a, String s) {
    }

    void sum(String s, int a) {
    }

    int sum(double a, int b) {
        return (int) (a + b);
    }

    static void main() {
        Numbers obj = new Numbers();
        obj.sum(1, 2);
        obj.sum(1, 3, 7);
        // obj.sum(1, 2, 3, 4, 6, 7);
        // Compile time polymorphism
        // also known as static polymorphism
    }
}
