package dsa.math;

public class GCD {
    static void main() {
        System.out.println(gcd(5,2));
    }
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
