package dsa.math;

public class Prime {
    static void main() {
        System.out.println("Is Prime: " + isPrime(13));
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }
}
