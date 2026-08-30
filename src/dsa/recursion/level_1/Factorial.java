package dsa.recursion.level_1;

public class Factorial {
    static void main() {
        System.out.println(factorial(5));
    }
    static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
