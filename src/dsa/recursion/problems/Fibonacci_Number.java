package dsa.recursion.problems;
// https://leetcode.com/problems/fibonacci-number/
public class Fibonacci_Number {
    static void main() {
        System.out.println(fib(2));
    }
    static int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }
    static int fibFormula(int n) { // formula made using recurences linear in complexcity lecture
        return (int) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }
}
