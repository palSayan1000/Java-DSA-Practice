package basic_understanding.number_pro;

import java.util.Scanner;

public class Prime_Check {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:" );
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n){
        if (n == 2 || n == 3)
            return true;
        if (n <= 1 || n % 2 == 0 || n % 3 == 0)
            return false;
        for (int i = 2;  i * i <= n; i ++)
            if (n % i == 0)
                return false;
        return true;
    }
}
