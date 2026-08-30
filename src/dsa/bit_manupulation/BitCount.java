package dsa.bit_manupulation;

public class BitCount {
    static void main() {
        int n = 10;
        int base = 2;

        int ans = (int)(Math.log(n) / Math.log(2)) + 1;
        System.out.println(ans);
    }
}
