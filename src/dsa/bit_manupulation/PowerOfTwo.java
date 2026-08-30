package dsa.bit_manupulation;

public class PowerOfTwo {
    static void main() {
        int n = 17; // note: fix for n = 0
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}