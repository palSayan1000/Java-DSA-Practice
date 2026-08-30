package dsa.math;

public class LCM {
    static void main() {
        System.out.println("LCM: " + lcm(17, 19));
    }
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
