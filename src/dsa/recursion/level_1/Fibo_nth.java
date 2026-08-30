package dsa.recursion.level_1;

import java.util.Scanner;

public class Fibo_nth {
    static void main() {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The nth fibo is: " + fiboFormula(n));
    }
    static int fibo(int n) {
        if (n < 2)
            return n;
        return fibo(n - 1) + fibo(n - 2);
        // this is not tail recursion
    }
    static long fiboFormula(int n) { // formula made using recurences linear in complexcity lecture
        return (long) ((Math.pow((1 + Math.sqrt(5)) / 2, n) - Math.pow((1 - Math.sqrt(5)) / 2, n)) / Math.sqrt(5));
    }
}