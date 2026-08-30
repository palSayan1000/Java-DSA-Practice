package basic_understanding.recursion;

import java.util.Scanner;

public class Fibo_nth {
    static void main() {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The nth fibo is: " + fibo(n));
    }
    static int fibo(int n) {
        if (n < 2)
            return n;
        return fibo(n - 1) + fibo(n - 2);
        // this is not tail recursion
    }
}
