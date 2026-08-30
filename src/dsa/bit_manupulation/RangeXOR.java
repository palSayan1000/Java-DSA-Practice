package dsa.bit_manupulation;

public class RangeXOR {
    static void main() {
        // range xor from a till b
        // = xor(b) ^ xor(a-1)
        int a = 3, b = 9, ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);
    }
    // this gives xor from 0 till a
    static int xor(int a) {
        return switch (a % 4) {
            case 0 -> a;
            case 1 -> 1;
            case 2 -> a + 1;
            default -> 0;
        };
    }
}
