package dsa.recursion.level_1;

public class Reverse_Num {
    static void main() {
        int n = 12345;
        System.out.println(reverse(n));
    }
    static int reverse(int n) {
        if (n <= 9) return n;
        return n % 10 * (int) Math.pow(10, (int) Math.log10(n)) + reverse(n / 10);
    }
}
